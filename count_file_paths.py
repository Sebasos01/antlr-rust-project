#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import argparse
import re
import os
from collections import Counter

def contar_rutas_padre(path_archivo):
    """
    Lee el archivo indicado, extrae todas las rutas tras 'File Path   :',
    obtiene su directorio padre y devuelve un Counter con las frecuencias de cada directorio.
    """
    contador = Counter()
    patron = re.compile(r"^File Path\s*:\s*(.+)$")
    with open(path_archivo, encoding='utf-8') as f:
        for línea in f:
            match = patron.match(línea.strip())
            if match:
                ruta_completa = match.group(1)
                ruta_padre = os.path.dirname(ruta_completa)
                contador[ruta_padre] += 1
    return contador

def main():
    parser = argparse.ArgumentParser(
        description="Cuenta y ordena los directorios padre en los mensajes de Rust Parse Error."
    )
    parser.add_argument(
        "archivo", help="Ruta al archivo de entrada con los mensajes de error."
    )
    args = parser.parse_args()

    contador = contar_rutas_padre(args.archivo)
    if not contador:
        print("No se encontró ninguna línea con 'File Path  :'.")
        return

    # Imprimir de mayor a menor
    print(f"{'Frecuencia':>10}  Directorio")
    print("-" * 70)
    for directorio, freq in contador.most_common():
        print(f"{freq:10}  {directorio}")

if __name__ == "__main__":
    main()

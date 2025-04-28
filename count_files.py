#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import argparse
import re
from collections import Counter

def contar_rutas(path_archivo):
    """
    Lee el archivo indicado, extrae todas las rutas tras 'File Path   :'
    y devuelve un Counter con las frecuencias de cada ruta.
    """
    contador = Counter()
    patron = re.compile(r"^File Path\s*:\s*(.+)$")
    with open(path_archivo, encoding='utf-8') as f:
        for línea in f:
            match = patron.match(línea.strip())
            if match:
                ruta = match.group(1)
                contador[ruta] += 1
    return contador

def main():
    parser = argparse.ArgumentParser(
        description="Cuenta y ordena las rutas de File Path en un log de Rust Parse Error."
    )
    parser.add_argument(
        "archivo", help="Ruta al archivo de entrada con los mensajes de error."
    )
    args = parser.parse_args()

    contador = contar_rutas(args.archivo)
    if not contador:
        print("No se encontró ninguna línea con 'File Path  :'.")
        return

    # Imprimir de mayor a menor
    print(f"{'Frecuencia':>10}  Ruta")
    print("-" * 60)
    for ruta, freq in contador.most_common():
        print(f"{freq:10}  {ruta}")

if __name__ == "__main__":
    main()

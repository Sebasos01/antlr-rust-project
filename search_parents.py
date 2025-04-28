#!/usr/bin/env python3
import os
import sys
import argparse

def main():
    parser = argparse.ArgumentParser(
        description="Busca bajo un directorio dado los archivos listados en el input "
                    "y recopila sus directorios padre únicos."
    )
    parser.add_argument(
        "ruta_interes",
        help="Directorio raíz donde buscar recursivamente los archivos"
    )
    parser.add_argument(
        "archivo_input",
        help="Archivo de texto con líneas “<número> <ruta_al_archivo>”"
    )
    args = parser.parse_args()

    # Validaciones
    if not os.path.isdir(args.ruta_interes):
        sys.exit(f"Error: '{args.ruta_interes}' no es un directorio válido.")
    if not os.path.isfile(args.archivo_input):
        sys.exit(f"Error: '{args.archivo_input}' no existe o no es un archivo.")

    # 1) Leer todos los nombres de fichero del input
    basenames = set()
    with open(args.archivo_input, encoding='utf-8') as f:
        for line in f:
            stripped = line.lstrip()
            if not stripped.strip():
                continue
            parts = stripped.split(maxsplit=1)
            if len(parts) < 2:
                continue
            ruta_fichero = parts[1].strip()
            basenames.add(os.path.basename(ruta_fichero))

    # 2) Recorrer ruta_interes y recoger directorios padre de coincidencias
    padres = set()
    for root, _, files in os.walk(args.ruta_interes):
        for fname in files:
            if fname in basenames:
                padres.add(os.path.abspath(root))

    # 3) Imprimir en orden alfabético
    for directorio in sorted(padres):
        print(directorio)

if __name__ == "__main__":
    main()

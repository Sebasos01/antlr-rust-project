#!/usr/bin/env python3
import os
import re
import argparse
import sys

def main():
    parser = argparse.ArgumentParser(
        description="Extrae y lista todos los directorios padre de los 'File Path' en un archivo de input."
    )
    parser.add_argument(
        "input_file",
        help="Archivo de texto con bloques de Rust Parse Error que incluyen líneas 'File Path   : <ruta>'"
    )
    args = parser.parse_args()

    if not os.path.isfile(args.input_file):
        sys.exit(f"Error: '{args.input_file}' no existe o no es un archivo.")

    # Regex para captar la ruta tras 'File Path'
    pattern = re.compile(r'^\s*File Path\s*:\s*(.+)$')

    padres = set()
    with open(args.input_file, encoding='utf-8') as f:
        for line in f:
            m = pattern.match(line)
            if not m:
                continue
            ruta = m.group(1).strip()
            padre = os.path.dirname(ruta)
            # Asegurar barra final
            if not padre.endswith(os.sep):
                padre += os.sep
            padres.add(padre)

    # Imprimir todos los directorios únicos
    for d in sorted(padres):
        print(d)

if __name__ == "__main__":
    main()

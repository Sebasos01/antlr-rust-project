#!/usr/bin/env python3
import argparse
import os
import sys
import tempfile

def recopilar_nombres(ruta_interes: str) -> set:
    """
    Recorre recursivamente `ruta_interes` y devuelve un set con
    todos los nombres de archivo (sin ruta) que encuentra.
    """
    nombres = set()
    for root, dirs, files in os.walk(ruta_interes):
        for f in files:
            nombres.add(f)
    return nombres

def procesar(input_path: str, ruta_interes: str):
    ruta_interes = os.path.normpath(ruta_interes)
    # Pre-calc: todos los nombres de fichero bajo ruta_interes
    nombres_interes = recopilar_nombres(ruta_interes)

    # Creamos un temporal junto al archivo de input
    dir_tmp = os.path.dirname(input_path) or '.'
    fd, tmp_path = tempfile.mkstemp(dir=dir_tmp, text=True)
    os.close(fd)

    with open(input_path, 'r', encoding='utf-8') as fin, \
         open(tmp_path,      'w', encoding='utf-8') as fout:

        for line in fin:
            original = line
            stripped = line.lstrip()

            # Conserva líneas vacías o sin formato
            if not stripped.strip():
                fout.write(original)
                continue

            partes = stripped.split(maxsplit=1)
            if len(partes) < 2:
                fout.write(original)
                continue

            _, ruta_fichero = partes
            ruta_fichero = ruta_fichero.strip()
            nombre = os.path.basename(ruta_fichero)

            # Si el nombre de este archivo existe en ruta_interes, lo "eliminamos":
            if nombre in nombres_interes:
                sys.stdout.write(original)  # imprimir línea coincidente
            else:
                fout.write(original)        # conservar en el archivo

    # Reemplaza el original por el filtrado
    os.replace(tmp_path, input_path)

def main():
    parser = argparse.ArgumentParser(
        description="Eliminar líneas cuyo archivo (por nombre) exista bajo una carpeta, imprimiéndolas."
    )
    parser.add_argument('ruta_interes',
                        help='Carpeta raíz donde buscar archivos (p.ej. /home/.../rust_foo)')
    parser.add_argument('archivo_input',
                        help='Archivo con líneas “<número> <ruta_al_archivo>”')
    args = parser.parse_args()

    if not os.path.isdir(args.ruta_interes):
        parser.error(f"No es un directorio válido: {args.ruta_interes}")
    if not os.path.isfile(args.archivo_input):
        parser.error(f"No existe el archivo de input: {args.archivo_input}")

    procesar(args.archivo_input, args.ruta_interes)

if __name__ == '__main__':
    main()

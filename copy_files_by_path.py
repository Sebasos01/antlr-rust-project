#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import argparse
import os
import shutil
import sys
import re

def parse_args():
    parser = argparse.ArgumentParser(
        description="Copia archivos listados en un fichero de input "
                    "que pertenecen a un path de interés hacia un path destino, "
                    "manteniendo la estructura relativa."
    )
    parser.add_argument(
        "input_file",
        help="Fichero de texto con líneas: frecuencia<espacios>ruta"
    )
    parser.add_argument(
        "src_prefix",
        help="Prefijo de ruta de interés (solo se copiarán archivos cuya ruta empiece por aquí)"
    )
    parser.add_argument(
        "dst_prefix",
        help="Directorio destino donde copiar los archivos"
    )
    return parser.parse_args()

def extraer_ruta(line):
    """
    De una línea tipo '    6  /home/.../archivo.rs'
    devuelve '/home/.../archivo.rs'.
    """
    m = re.match(r'^\s*\d+\s+(.+)$', line)
    if m:
        return m.group(1).strip()
    return None

def main():
    args = parse_args()

    if not os.path.isfile(args.input_file):
        print(f"ERROR: no existe el fichero de input '{args.input_file}'", file=sys.stderr)
        sys.exit(1)

    # Asegurarnos de que dst_prefix existe
    os.makedirs(args.dst_prefix, exist_ok=True)

    with open(args.input_file, 'r', encoding='utf-8') as f:
        for línea in f:
            línea = línea.rstrip('\n')
            # Saltar separadores o cabeceras
            if not línea or línea.startswith('-') or línea.lower().startswith('frecuencia'):
                continue

            ruta = extraer_ruta(línea)
            if ruta is None:
                # línea no tiene el formato esperado
                continue

            # ¿Pertenece al path de interés?
            if ruta.startswith(args.src_prefix):
                # calculamos la ruta relativa respecto al prefijo
                relativa = os.path.relpath(ruta, args.src_prefix)
                destino = os.path.join(args.dst_prefix, relativa)

                # Creamos directorios necesarios
                os.makedirs(os.path.dirname(destino), exist_ok=True)

                try:
                    shutil.copy2(ruta, destino)
                    print(f"Copiado: {ruta} → {destino}")
                except FileNotFoundError:
                    print(f"AVISO: archivo no encontrado: {ruta}", file=sys.stderr)
                except PermissionError:
                    print(f"AVISO: permiso denegado copiando: {ruta}", file=sys.stderr)
                except Exception as e:
                    print(f"ERROR copiando {ruta}: {e}", file=sys.stderr)

if __name__ == "__main__":
    main()

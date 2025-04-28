#!/usr/bin/env python3
import os
import sys
import argparse
import shutil

def leer_basenames(archivo_input):
    """
    Lee el archivo de input y devuelve un set con los nombres de fichero (basename)
    extraídos de cada línea con formato "<número> <ruta_completa>".
    """
    basenames = set()
    with open(archivo_input, encoding='utf-8') as f:
        for linea in f:
            # Quitar espacios/tabs al inicio y final
            s = linea.strip()
            if not s:
                continue
            partes = s.split(maxsplit=1)
            if len(partes) < 2:
                continue
            ruta = partes[1]
            basenames.add(os.path.basename(ruta))
    return basenames

def copiar_archivos(ruta_interes, ruta_destino, basenames):
    """
    Recorre recursivamente ruta_interes y copia a ruta_destino
    todos los archivos cuyo basename esté en basenames,
    preservando la estructura de directorios relativa.
    """
    for root, dirs, files in os.walk(ruta_interes):
        for nombre in files:
            if nombre in basenames:
                origen = os.path.join(root, nombre)
                # calcular ruta relativa dentro de ruta_interes
                rel_path = os.path.relpath(origen, ruta_interes)
                destino = os.path.join(ruta_destino, rel_path)
                destino_dir = os.path.dirname(destino)
                # crear carpetas necesarias (no falla si ya existen)
                os.makedirs(destino_dir, exist_ok=True)
                # copiar preservando metadata
                shutil.copy2(origen, destino)
                print(f"Copiado: {origen} → {destino}")

def main():
    parser = argparse.ArgumentParser(
        description="Copia desde una carpeta origen a un destino los archivos listados en un input, "
                    "preservando estructura de directorios."
    )
    parser.add_argument('ruta_interes',
                        help='Directorio raíz donde buscar recursivamente los archivos')
    parser.add_argument('ruta_destino',
                        help='Directorio donde se copiarán los archivos (se creará si no existe)')
    parser.add_argument('archivo_input',
                        help='Archivo con líneas “<número> <ruta_al_archivo>”')
    args = parser.parse_args()

    # Validar rutas
    if not os.path.isdir(args.ruta_interes):
        sys.exit(f"Error: '{args.ruta_interes}' no es un directorio válido.")
    # Crear ruta destino si no existe
    os.makedirs(args.ruta_destino, exist_ok=True)
    if not os.path.isfile(args.archivo_input):
        sys.exit(f"Error: '{args.archivo_input}' no existe o no es un archivo.")

    basenames = leer_basenames(args.archivo_input)
    if not basenames:
        sys.exit("No se encontraron rutas válidas en el archivo de input.")

    copiar_archivos(args.ruta_interes, args.ruta_destino, basenames)

if __name__ == '__main__':
    main()

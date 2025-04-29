#!/usr/bin/env python3
import os
import sys

def extraer_ruta(linea: str) -> str | None:
    """Devuelve la ruta que contiene la línea o None si no hay ruta."""
    pos = linea.find("/")          # adapta a "\\" si estuvieras en Windows
    if pos == -1:
        return None               # no se encontró una ruta
    return linea[pos:].strip()

def leer_basenames(archivo: str) -> set[str]:
    """Lee *archivo* (archivo 2) y devuelve el conjunto de basenames ."""
    basenames: set[str] = set()
    with open(archivo, encoding="utf-8") as f:
        for linea in f:
            ruta = extraer_ruta(linea)
            if ruta:
                basenames.add(os.path.basename(ruta))
    return basenames


def filtrar_archivo1(archivo1: str, basenames: set[str]) -> list[str]:
    """Devuelve las líneas de *archivo1* menos las que contengan
    un basename que esté en *basenames*."""
    resultado: list[str] = []
    with open(archivo1, encoding="utf-8") as f:
        for linea in f:
            ruta = extraer_ruta(linea)
            if ruta and os.path.basename(ruta) in basenames:
                # Coincidencia: eliminar línea (no la añadimos)
                continue
            resultado.append(linea)
    return resultado


def main() -> None:
    if len(sys.argv) < 3:
        sys.exit("Uso:  python filtra.py <archivo1> <archivo2> [salida]")

    archivo1, archivo2 = sys.argv[1], sys.argv[2]
    salida = sys.argv[3] if len(sys.argv) > 3 else None

    excluir = leer_basenames(archivo2)
    filtradas = filtrar_archivo1(archivo1, excluir)

    if salida:
        with open(salida, "w", encoding="utf-8") as f:
            f.writelines(filtradas)
    else:
        sys.stdout.writelines(filtradas)


if __name__ == "__main__":
    main()

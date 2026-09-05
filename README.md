# Mi-Primer-Proyecto - Maquina Expendedora de Cafe

[![Build](https://github.com/GastonGuber/Mi-Primer-Proyecto/actions/workflows/build.yml/badge.svg)](https://github.com/GastonGuber/Mi-Primer-Proyecto/actions/workflows/build.yml)
[![Release](https://img.shields.io/github/v/release/GastonGuber/Mi-Primer-Proyecto)](https://github.com/GastonGuber/Mi-Primer-Proyecto/releases/latest)

---

## Espanol

Programa hecho en **Java** con interfaz grafica (Swing) que simula una **maquina expendedora de cafe**. Tiene dos maquinas:

- **Maquina Expendedora**: prepara cafe.
- **Maquina Pro**: prepara cafe y cafe carioca.

Con sus botones podes **preparar** la bebida, **recargar** la maquina cuando se queda sin stock y **retirar** el vaso cuando esta listo. Los botones se habilitan y deshabilitan para simular el ciclo real de una maquina expendedora.

La hice para practicar **programacion orientada a objetos** y **programacion basada en eventos**.

### Como ejecutar la version compilada (JAR)

1. Entra a [Releases](https://github.com/GastonGuber/Mi-Primer-Proyecto/releases/latest) y descarga el archivo `Cafetera.jar` (el mas reciente se llama "latest" o "Ultima version").
2. Necesitas **Java 8 o superior** instalado.
3. Ejecuta:

```bash
java -jar Cafetera.jar
```

> Si usas Windows, configura el **escalado de pantalla al 100%**, si no las imagenes se ven cortadas.

### Como ejecutar desde el codigo fuente

**Opcion A - BlueJ:** abre la carpeta `Cafetera/` en BlueJ y ejecuta el metodo `main` de la clase `Main`.

**Opcion B - Linea de comandos:**

```bash
javac -encoding UTF-8 -d build/out Cafetera/*.java
printf 'Main-Class: Main\n' > build/MANIFEST.MF
jar cfm build/Cafetera.jar build/MANIFEST.MF -C build/out . -C Cafetera maquina_cafetera_logo.png -C Cafetera maquina_cafetera_pro_logo.png -C Cafetera Cafe.png -C Cafetera Carioca.png -C Cafetera ImagenBlanco.png
java -jar build/Cafetera.jar
```

### Capturas de pantalla

> Agrega tus capturas de pantalla a la carpeta `screenshots/` y referencialas aca para que se vean en la portada del repositorio.

---

## English

Java program with a **graphical interface (Swing)** that simulates a **coffee vending machine**. It has two machines:

- **Standard machine**: prepares coffee.
- **Pro machine**: prepares coffee and "carioca" (coffee with milk).

Using the buttons you can **prepare** the drink, **refill** the machine when it runs out of stock, and **take the cup** once it's ready. Buttons are enabled/disabled to simulate the real cycle of a vending machine.

It was built to practice **object-oriented programming** and **event-driven programming**.

### Run the compiled version (JAR)

1. Go to [Releases](https://github.com/GastonGuber/Mi-Primer-Proyecto/releases/latest) and download `Cafetera.jar`.
2. You need **Java 8 or newer**.
3. Run:

```bash
java -jar Cafetera.jar
```

> On Windows, set display **scaling to 100%**, otherwise images will look cropped.

### Run from source

**Option A - BlueJ:** open the `Cafetera/` folder in BlueJ and run the `main` method of the `Main` class.

**Option B - Command line:**

```bash
javac -encoding UTF-8 -d build/out Cafetera/*.java
printf 'Main-Class: Main\n' > build/MANIFEST.MF
jar cfm build/Cafetera.jar build/MANIFEST.MF -C build/out . -C Cafetera maquina_cafetera_logo.png -C Cafetera maquina_cafetera_pro_logo.png -C Cafetera Cafe.png -C Cafetera Carioca.png -C Cafetera ImagenBlanco.png
java -jar build/Cafetera.jar
```

### Screenshots

> Add your screenshots to the `screenshots/` folder and link them here so they show up on the repository landing page.
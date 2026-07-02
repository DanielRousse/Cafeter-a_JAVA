# ☕ Cafetería JAVA

Este es un proyecto colaborativo desarrollado en **Java** diseñado para simular el sistema de gestión de una cafetería, aplicando los conceptos fundamentales de la **Programación Orientada a Objetos (POO)**.

---

## 👥 Integrantes del Equipo
* Jonathan Daniel Reyes Gordillo
* Michael Castro
* Estefania Lozada Sotelo
* Elisa Martínez

---

## 📋 Descripción del Proyecto
El sistema permite administrar el menú general de la cafetería y gestionar órdenes de compra de los clientes, calculando de manera automatizada el total a pagar, incluyendo impuestos (IVA 16%), subtotales y promociones especiales.

### Características Principales:
* **Gestión de Menú:** Registrar y listar alimentos y bebidas con sus respectivas especificaciones.
* **Sistema de Ventas (Órdenes):** Agregar productos de manera dinámica a una orden activa, mostrando la cantidad de productos, subtotal, IVA (16%) y total a pagar.
* **Precios Dinámicos e Interfaces:** Uso de la interfaz `Vendible` para aplicar cargos extra (por tamaño de bebidas) y descuentos (en alimentos vegetarianos).

---

## 🛠️ Estructura del Código
Todos los archivos fuente se ubican dentro de la carpeta `src/` bajo la siguiente estructura final:
```text
src/
├── Producto.java      # Clase base abstracta para los productos.
├── Bebida.java        # Subclase de Producto para bebidas (fria/caliente, tamaño).
├── Alimento.java      # Subclase de Producto para alimentos (calorías, vegetariano).
├── Vendible.java      # Interfaz para el cálculo de precios finales.
├── Menu.java          # Gestor de la colección de productos disponibles.
├── Orden.java         # Gestor de los productos de la compra actual.
└── Main.java          # Clase de prueba que ejecuta el flujo principal.
```

---

## 🚀 Cómo Ejecutar
1. Clona el repositorio:
   ```bash
   git clone https://github.com/DanielRousse/Cafeter-a_JAVA.git
   ```
2. Compila y ejecuta el proyecto en tu entorno Java preferido (IDE como IntelliJ) o desde la terminal:
   ```bash
   javac src/*.java
   java -cp src Main
   ```

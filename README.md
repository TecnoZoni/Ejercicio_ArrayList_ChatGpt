# Ejercicio_ArrayList_ChatGpt
Ejercicio de ArrayList en Java que le pedi a ChatGPT que me creeara para poner a pruebas mis conocimientos del tema.

### Ejercicio: Gestión de una lista de productos en un inventario

#### Descripción:

Imagina que estás desarrollando un sistema de inventario para una tienda. Necesitas implementar una funcionalidad para gestionar una lista de productos utilizando `ArrayList`.

#### Tareas a realizar:

1. **Crear una clase `Producto`**:
   - Atributos: `id`, `nombre`, `precio`, `cantidad`.
   - Constructor para inicializar todos los atributos.
   - Métodos getters y setters para cada atributo.

2. **Crear una clase `Inventario`**:
   - Atributo: `listaProductos` (un `ArrayList` de `Producto`).
   - Método para agregar un nuevo producto al inventario.
   - Método para eliminar un producto del inventario por su ID.
   - Método para buscar un producto por su nombre y mostrar su información.
   - Método para mostrar todos los productos en el inventario.
   - Método para actualizar la cantidad de un producto en el inventario.

3. **Crear una clase principal `Main`**:
   - Crear un objeto `Inventario`.
   - Agregar varios productos al inventario.
   - Mostrar todos los productos.
   - Buscar un producto por nombre y mostrar su información.
   - Eliminar un producto por su ID.
   - Actualizar la cantidad de un producto y mostrar el inventario actualizado.

#### Puntos extras:

- Implementa validaciones adicionales, como evitar la adición de productos duplicados o manejar casos en los que la cantidad de un producto se reduce a cero.

### Instrucciones adicionales:

- Utiliza el método `toString()` en la clase `Producto` para facilitar la visualización de la información del producto.
- Utiliza la estructura de control `for-each` para iterar a través de la lista de productos en la clase `Inventario`.

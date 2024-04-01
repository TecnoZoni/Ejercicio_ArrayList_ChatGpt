package arraylistejerciciochatgpt;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> listado = new ArrayList<>();

    public void agregarProducto(int id, String nombre, double precio, int cantidad) {
        boolean repetido = false;
        for (Producto producto : listado) {
            if (producto.getNombre().equalsIgnoreCase(nombre) || producto.getId() == id) {
                repetido = true;
            }
        }
        if (cantidad <= 0) {
            repetido = true;
        }
        if (!repetido) {
            try {
                listado.add(new Producto(id, nombre, precio, cantidad));
                System.out.println("Producto Agregado con Exito.");
            } catch (Exception e) {
                System.out.println("El producto no se pudo Agregar.");
            }
        } else {
            System.out.println("El producto no se pudo Agregar revise el stock o que no este repetido.");
        }
    }

    public void eliminarProducto(int id) {
        try {
            for (int i = 0; i < listado.size(); i++) {
                if (listado.get(i).getId() == id) {
                    listado.remove(i);
                    break;
                }
            }
            System.out.println("Producto Eliminado con Exito.");
        } catch (Exception e) {
            System.out.println("El producto no se pudo Eliminar.");
        }
    }

    public void buscarProducto(String nombre) {
        try {
            for (Producto producto : listado) {
                if (producto.getNombre().equals(nombre)) {
                    System.out.println(producto.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("No se encontro el producto.");
        }
    }

    public void mostrarProductos() {
        try {
            if (listado.isEmpty()) {
                System.out.println("No hay prodcutos en el Inventario.");
            }
            for (Producto producto : listado) {
                System.out.println(producto.toString());
            }
        } catch (Exception e) {
            System.out.println("No se pudo mostrar el stock.");
        }
    }

    public void actualizarStock(int id, int cantidad) {
        if (cantidad > 0) {
            try {
                for (Producto producto : listado) {
                    if (producto.getId() == id) {
                        producto.setCantidad(cantidad);
                    }
                }
                System.out.println("El producto se Actualizo con exito.");
            } catch (Exception e) {
                System.out.println("El producto no pudo actualizarse");
            }
        } else {
            System.out.println("El stock tiene que ser mayor a 0");
        }
    }
}

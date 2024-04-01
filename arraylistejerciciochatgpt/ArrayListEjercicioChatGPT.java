package arraylistejerciciochatgpt;

import java.util.Scanner;

public class ArrayListEjercicioChatGPT {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Inventario inventario = new Inventario();
        boolean salida = true;
        int eleccion, id, cantidad;
        String nombre;
        double precio;

        do {
            System.out.println("============================");
            System.out.println("GESTION DE INVENTARIO");
            System.out.println("============================");
            System.out.println("Que deseas hacer (Ingrese el numero de la accion): \n 1.Mostrar productos \n 2.Agregar producto \n 3.Eliminar prodcuto \n 4.Buscar producto \n 5.Actualizar Stock de un producto \n 6. salir");
            eleccion = leer.nextInt();
            leer.nextLine();
            switch (eleccion) {
                case 1:
                    inventario.mostrarProductos();
                    break;
                case 2:
                    System.out.println("Ingrese el Id del producto:");
                    id = leer.nextInt();
                    leer.nextLine();
                    System.out.println("Ingrese el nombre del producto:");
                    nombre = leer.nextLine();
                    System.out.println("Ingrese el precio del prodcuto:");
                    precio = leer.nextDouble();
                    leer.nextLine();
                    System.out.println("Ingrese la cantidad del producto:");
                    cantidad = leer.nextInt();
                    leer.nextLine();
                    inventario.agregarProducto(id, nombre, precio, cantidad);
                    break;
                case 3:
                    System.out.println("Ingrese el Id del prodcuto que quiere eliminar: ");
                    id = leer.nextInt();
                    leer.nextLine();
                    inventario.eliminarProducto(id);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del producto que quiere buscar:");
                    nombre = leer.nextLine();
                    inventario.buscarProducto(nombre);
                    break;
                case 5:
                    System.out.println("Ingrese el id del producto al que quiera actualizar el Stock:");
                    id = leer.nextInt();
                    leer.nextLine();
                    System.out.println("Ingrese la cantidad de stock que tiene el producto:");
                    cantidad = leer.nextInt();
                    inventario.actualizarStock(id, cantidad);
                    break;
                case 6:
                    salida = false;
                    break;
                default:
                    System.out.println("Por favor seleccione una opcion correcta");
            }

        } while (salida);

    }

}

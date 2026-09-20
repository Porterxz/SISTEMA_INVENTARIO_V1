package arraylist.sistema.inventario.dinamico;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListSistemaInventarioDinamico {

    public static Scanner sc;
    public static ArrayList<String> listaProductos = new ArrayList<>();
    public static int opcion = 0;

    public static void main(String[] args) {
        //USE ARRAYLIST
        //USAR LOS METODOS DE ARRAYLIST PARA DEMOSTRAR SU FUNCIONALIDAD
        sc = new Scanner(System.in);
        System.out.println("---Bienvenido al Sistema de Registro de Inventario---");
        System.out.println("Ingrese 5 productos: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Producto #" + (i + 1) + " :");
            String nombreProducto = sc.nextLine();
            listaProductos.add(nombreProducto);
            sc.nextLine();

        }

        do {
            System.out.println("Que desea hacer? ");
            System.out.println("1.Ver productos");
            System.out.println("2.Agregar productos");
            System.out.println("3.Editar productos");
            System.out.println("4.Eliminar producto");
            System.out.println("0.Salir");
            System.out.println("Seleccione una opcion del menu:");
            opcion = sc.nextInt();

            System.out.println("********************************");
            switch (opcion) {
                case 1:
                    verProductos();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    System.out.println("Editando producto...");
                    break;
                case 4:
                    System.out.println("Eliminando producto....");
                    break;

            }

        } while (opcion != 0);

        System.out.println("FIN DEL PROGRAMA,GRACIAS.");
    }

    public static void verProductos() {
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println("****************************");
            System.out.println("---Lista de Productos");
            System.out.println(listaProductos.get(i));
        }

    }

    public static void agregarProducto() {
        System.out.println("Cuantos productos desea agregar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre Producto: ");
            String nuevoProducto = sc.nextLine();
            listaProductos.add(nuevoProducto);
        }
    }

    public static void editarProducto() {

    }

    public static void eliminarProducto() {

    }

}

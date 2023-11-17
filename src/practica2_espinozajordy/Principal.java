package practica2_espinozajordy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        List<Producto> listaProductos = crearListaProductos();
        List<Usuario> listaUsuarios = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda virtual PAQUITO , regístrese aqui para comenzar.");

        // Registro del usuario
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine();

        int idUsuario = listaUsuarios.size() + 1;
        Usuario nuevoUsuario = new Usuario(idUsuario, nombre, correo);
        listaUsuarios.add(nuevoUsuario);

        // Mostramos la lista de productos
        
        System.out.println(" Lista de productos en stock :");
        mostrarProductos(listaProductos);

        // Seleccion de productos y agregar al carrito
        
        System.out.print(" Seleccione los productos por su número para agregarlos a su carrito (separados por ( - ): ");
        String seleccion = scanner.nextLine();
        String[] numerosProductos = seleccion.split("-");

        for (String num : numerosProductos) {
            int index = Integer.parseInt(num.trim());
            if (index > 0 && index <= listaProductos.size()) {
                Producto productoSeleccionado = listaProductos.get(index - 1);
                nuevoUsuario.agregarProductoAlCarrito(productoSeleccionado);
            }
        }

        // Mostrar información del usuario y su carrito
        
        System.out.println("REGISTRO COMPLETADO !!");
        System.out.println("Detalles del usuario: " + nuevoUsuario.toString());
        System.out.println("Productos en el carrito: " + nuevoUsuario.getCarrito().toString());
    
        // Realizar pedido
        Pedido pedido = new Pedido(nuevoUsuario);
        pedido.setProductos(nuevoUsuario.getCarrito().getProductos());

        // Mostrar información del pedido realizado
        
        System.out.println(" SU PEDIDO ESTA RECIBIDO !! ");
        System.out.println(pedido.toString());

        }
    
    // Método para crear la lista de productos
    
    private static List<Producto> crearListaProductos() {
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(" Balon de Futbol ", 10.00));
        listaProductos.add(new Producto("Guantes de Arquero", 15.00));
        listaProductos.add(new Producto("Vendas de Futbol", 2.00));
        listaProductos.add(new Producto("Membresia PAQUITO", 45.00));
        listaProductos.add(new Producto("Bolso Deportivo", 29.99));
     
        return listaProductos;
    }

    // Mostramos la lista de productos
    
    private static void mostrarProductos(List<Producto> listaProductos) {
    for (int i = 0; i < listaProductos.size(); i++) {
        System.out.println((i + 1) + ". " + listaProductos.get(i).toString());
    }
    
    }
    
}

package practica2_espinozajordy;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    
    private List<Producto> productos;

    public Carrito(String nombre) {
        
        this.productos = new ArrayList<>();
    }
    
    // Getters y setters
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void vaciarCarrito() {
        productos.clear();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    //método toString

    @Override
    public String toString() {
        return " Cantidad de Productos en el carrito : " + productos.size() + " ---> Sus productos seleccionados: " + productos + ')';
    }
}


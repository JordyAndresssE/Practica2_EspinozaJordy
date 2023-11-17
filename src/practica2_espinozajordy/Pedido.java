package practica2_espinozajordy;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;
    private Usuario usuario;

    public Pedido(Usuario usuario) {
        this.usuario = usuario;
        this.productos = new ArrayList<>();
    }
    
    // Getters y setters
    
    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    // método toString

    @Override
    public String toString() {
        return "Pedido = (" + " Nombre de los productos = " + productos + ", Usuario = " + usuario + ')';
    }
}
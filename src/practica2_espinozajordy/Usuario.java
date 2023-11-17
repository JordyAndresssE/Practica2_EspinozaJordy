package practica2_espinozajordy;

public class Usuario {
    private int id;
    private String nombre;
    private String correoElectronico;
    private Carrito carrito;

    public Usuario(int id, String nombre, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.carrito = new Carrito(nombre);
    }

    // Getters y setters

    public void agregarProductoAlCarrito(Producto producto) {
        carrito.agregarProducto(producto);
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    // método toString

    @Override
    public String toString() {
        return "Usuario = (" + " Numero del usuario : " + id + ", Nombre del usuario : " + nombre + ", Correo electronico del usuario : " + correoElectronico + ')';
    }
}


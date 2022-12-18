public class Producto{
    private String nombreProducto;
    private float precio;
    
    public Producto(String nombreProducto, float precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

   public String mostrarDatos() {
        return "Nombre del producto: " + nombreProducto + "\nPrecio del producto: " + precio;
   }
}
   

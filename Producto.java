public class Producto{
    private String nombreProducto;
    private int valor;
    
    
    public Producto(String nombreProducto,int valor) {
        this.nombreProducto = nombreProducto;
        this.valor = valor;

    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getValor() {
        return valor;
    }

   public String mostrarDatos(){
     return "Nombre del producto: "+nombreProducto+ "\n Precio del producto: "+valor;


                        
   }
}
   

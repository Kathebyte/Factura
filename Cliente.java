public class Cliente{

    private String nombre;
    private String apellido;
    private int cedula;
    private String direccion;
    private int telefono;
    
    public Cliente(String nombre, String apellido, int cedula, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion="
                + direccion + ", telefono=" + telefono + "]";
    }

}
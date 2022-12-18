import java.util.Scanner;

public class Principal {
    public static int indiceProductoBarato(Producto productos[]){
        float precio;
        int indice = 0;

        // Lets assume the first product is the cheapest
        precio = productos[0].getPrecio();

        // Iterate starting from the index 1, index 0 is already taken
        for(int i = 1; i < productos.length; i++){
            // Update our index
            if(productos[i].getPrecio() < precio){
                precio = productos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static int indiceProductoCostoso(Producto productos[]) {
        float precio;
        int indice = 0;

        // Lets assume the first product is the most expensive
        precio = productos[0].getPrecio();

        // Iterate starting from the index 1, index 0 is already taken
        for(int i = 1; i < productos.length; i++) {
            // Update our index
            if(productos[i].getPrecio() > precio) {
                precio = productos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String args[]) {
        String nombreProducto;
        float precio;
        int indice, opc = 0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cuentos productos deseas Facturar");
        int numProd = teclado.nextInt();

        Producto productos[] = new Producto[numProd];

        for(int i = 0; i < numProd; i++) {
            System.out.println("Ingresa el nombre del producto "+(i+1));
            // This will allows us to read the string and not skip it
            teclado.nextLine();
            nombreProducto = teclado.nextLine();
            System.out.println("Introduzca el precio");
            precio=teclado.nextFloat();
            
            productos[i] = new Producto(nombreProducto, precio);
        }

        do {
            System.out.println("MENU:");
            System.out.println("1.Desea ingresar produtos y su respectivio precio");
            System.out.println("2.Visualizar producto mas Barato");
            System.out.println("3.Visualizar producto mas costoso");
            System.out.println(".Conocer el total a pagar");
            System.out.println(".Facturar");
            System.out.println("4.Salir");
            System.out.println(".Digite la opcion del menu");

            opc = teclado.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("Estos son los datos ingresados: ");
                    // Loop in each product and show it
                    for (int i = 0; i < productos.length; ++i) {
                        System.out.println(productos[i].mostrarDatos());
                    }
                    break;

                case 2:
                    System.out.println("El producto mas Barato es : ");
                    indice = indiceProductoBarato(productos);
                    System.out.println("\nEl producto mas barato es: ");
                    System.out.println(productos[indice].mostrarDatos());
                    break;

                case 3:
                    System.out.println("El producto mas Costoso es : ");
                    indice = indiceProductoCostoso(productos);
                    System.out.println("\nEl producto mas barato es: ");
                    System.out.println(productos[indice].mostrarDatos());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error, Opcion incorrecata");
                    break;

            }
            System.out.println("");
        }while(opc!=4);

        teclado.close();
    }   
}
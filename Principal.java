import java.util.Scanner;
import java.util.Arrays;


public class Principal {

    public static int indiceProductoBarato(Producto producto[]){
        float precio;
        int indice = 0;

        precio = producto[0].getValor();
        for(int i= 1; i < producto.length;i++){
            if(producto[i].getValor()<precio){
                precio = producto[i].getValor();
                indice= i;

            }
            
        }
        return indice;

    }
    

    public static int indiceProductoCostoso(Producto producto[]){
        float precio;
        int indice = 0;

        precio = producto[0].getValor();
        for(int i= 1; i > producto.length;i++){
            if(producto[i].getValor()<precio){
                precio = producto[i].getValor();
                indice= i;

            }
            
        }
        return indice;
    }

    public static void main(String args[]) {
        
        String nombreProducto;
        int valor,opc=0;
        int indiceBarato,indiceCostoso;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cuentos productos deseas Facturar");
        int numProd = teclado.nextInt();

        Producto producto[] = new Producto[numProd];

        for(int i =0; i< numProd; i++){
            System.out.println("Ingresa el nombre del producto "+(i+1));
            teclado.nextLine();
            nombreProducto = teclado.nextLine();
            System.out.println("Introduzca el precio");
            valor=teclado.nextInt();
            
            producto[i] = new Producto(nombreProducto, valor);
        }

        int i=0;
        do{ System.out.println("MENU:");
            System.out.println("1.Desea ingresar produtos y su respectivio valor");
            System.out.println("2.Visualizar producto mas Barato"); 
            System.out.println("3.Visualizar producto mas costoso"); 
            System.out.println(".Conocer el total a pagar"); 
            System.out.println(".Facturar");
            System.out.println("4.Salir");
            System.out.println(".Digite la opcion del menu");

            opc=teclado.nextInt();

        
            switch(opc){

                
                case 1: System.out.println("Estos son los datos ingresados: ");
                        producto[i].mostrarDatos();
                        break;

                case 2: System.out.println("El producto mas Barato es : ");
                        indiceBarato = indiceProductoBarato(producto);
                        System.out.println("\nEl producto mas barato es: ");
                        System.out.println(producto[indiceBarato].mostrarDatos());
                        break;

                case 3: System.out.println("El producto mas Costoso es : ");
                        indiceBarato = indiceProductoBarato(producto);
                        System.out.println("\nEl producto mas barato es: ");
                        System.out.println(producto[indiceBarato].mostrarDatos());
                        break;
                case 4: break;
                default:System.out.println("Error, Opcion incorrecata");break;   
                
            }
            System.out.println("");
            i++;    
        }while(opc!=4);
    }   
}




    
    

       
            
         // int suma= Arrays.stream(producto(valor)).sum();
        // System.out.println(suma);
            
            
        

        

        

    
    


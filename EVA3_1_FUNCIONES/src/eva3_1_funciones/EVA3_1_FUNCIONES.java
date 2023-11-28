
package eva3_1_funciones;

import java.util.Scanner;


public class EVA3_1_FUNCIONES {

    public static void main(String[] args) {
        
      //A ESTO SE LE LLAMA "LLAMAR A LA FUNCION"
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Digite la cantidad que se repetira el mensaje");
        int veces = sc.nextInt();
       
        imprimirMensaje("hola mundo!!!", veces);
        
       
        
        
        
 }
     public static void imprimirMensaje(String mensaje, int cant){
            for (int i = 0; i < cant; i++) {
            
        
                 System.out.println(mensaje);
          }
    }
    
   
    
    
}

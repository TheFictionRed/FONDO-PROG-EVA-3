
package eva3_5_parametros;

public class EVA3_5_PARAMETROS {

    public static void main(String[] args) {
       
        int x=5;
        System.out.println("EL valor de x en el main() es de " + x);
        
        pasoPorValor(x);
        System.out.println("EL valor de x en el main() despues de modificar en el metodo " + x);
    }
 //EN EL PASO POR VALOR DE ARGUMENTOS, SE ENVIA UNA COPIA DEL METODO
    public static void pasoPorValor(int valor){
        
        System.out.println("El valor que recibio en un método es de "+ valor );
        valor++;
        System.out.println("El valor modificado en el metodo es de "+ valor);
        
    }
}

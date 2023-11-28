/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_factorial;

/**
 *
 * @author FERNANDO
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int val=5;
        System.out.println("factorial de 5 = "+ calcularFactorial(val););
    }
    public static int calcularFactorial(){
    int guardar = 1;
        for (int i = 0; i <= val; i++) {
            guardar*=i;
            
        }
    return guardar;
    }
}

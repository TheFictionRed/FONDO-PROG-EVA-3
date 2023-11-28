/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_objetos;

/**
 *
 * @author FERNANDO
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso1 = new Persona();
        
        System.out.println(perso1);
        perso1.nombre = "Juan";
        perso1.apellido = "Perez";
        perso1.edad = 10;
        imprimirPersonas(perso1);
        
        Persona perso2 = new Persona();
        
        System.out.println(perso2);
        perso2.nombre = "Pedro";
        perso2.apellido = "Páramo";
        perso2.edad = 70;
        
        
        
        imprimirPersonas(perso2);
        
       
        
    }
    public static void imprimirPersonas(Persona perso){
    
        System.out.println("Direccion: "+ perso);
        System.out.println("Nombre completo: " + perso.nombre +" "+ perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }
    
}
//Definen una plantilla para crear objetos
//Crean un nuevo tipo de datos
class Persona{
String nombre, apellido;
int edad;

}
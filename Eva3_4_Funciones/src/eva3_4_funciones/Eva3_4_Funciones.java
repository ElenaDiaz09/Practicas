/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_funciones;

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Eva3_4_Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //para usar la funcion------->llamada a funcion
       Eva3_4_Funciones objeto = new Eva3_4_Funciones ();
      objeto.imprimeMensaje("Elena");
      
      Math.random();
      
   
    }
    //Paradigmas de programacion:
    //Programacion estructurada
    //Programacion modular, orientada a objetos, funcional 
    
    //OOP
    //PUCNLICO
    //PRIVADO
    //PROTEGIDO
    //DEFAULT
    
    //procedimiento------>No regresa nada
    //funciones---------->Regresa un valor
    
     void imprimeMensaje(String mensaje){
        System.out.println("Hola" + mensaje );
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_stack.over.flow;

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Eva3_7_StackOverFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        miStackOverFlow();
    }
    //Recursividad - NOS ACABAMOS LA MEMORIA (STACK OVERFLOW)
    public static void miStackOverFlow(){
        System.err.println("Hola Usuario, Buen dia!!");
        miStackOverFlow();
        
    
}
}
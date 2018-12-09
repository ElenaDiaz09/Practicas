/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_factorial;

/**
 *
 * Elena Diaz Lopez #18550623
 * 
 */
public class Eva3_5_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Factorial
        int iVal = 5;
        int iResu = calculaFactorial(iVal);
        System.out.println("Resultado=" + iResu);
    }
    
    
    public static int calculaFactorial(int iVal){
        int iResu = 1;
        
        for (int i = iVal; i >= 1; i-- ){
            iResu *=  i; //iResu = iResu * i; 
        }
        
        return iResu;
        
    }
    
}

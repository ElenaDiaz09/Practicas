/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_parametros;

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Eva3_9_Parametros { // clasee ---- tipo de dato abstracto

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Paso por valor----->Copia de los datos(JAVA)
        // Paso por referencia---->la direccion de la ram dodne estan los datos 
        //Referencia ---> Apuntador
        //El simbolo & en C++ hace rferencia automatica

        
        int iValor = 5;
        incrementa(iValor);
        System.out.println("El valor es " + iValor);
        //
        Valor vObjetoValor = new Valor();
        vObjetoValor.iValor = 5;
        incrementa(vObjetoValor);
        System.out.println("El Valor 2 es " + vObjetoValor.iValor);
    }
    public static void incrementa (int iVal){
        iVal++;
    }
       public static void incrementa (Valor vValor){
        vValor.iValor++;
    }
    }



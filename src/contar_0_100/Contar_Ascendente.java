/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contar_0_100;

/**
 *
 * @author usu21
 */
public class Contar_Ascendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] num = new int[100];
         
        for (int i = 0; i < num.length; i++) {
            num[i] = i+1;
        }
        
        
        

        // Mostrar los números del array
        
        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);
        }

    }

}

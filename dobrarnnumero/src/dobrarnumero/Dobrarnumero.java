/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobrarnumero;

import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class Dobrarnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       
        System.out.print("Digite um numero para saber o dobro dele ");
        int n = leia.nextInt();
        
        if (n >= 1 && n <= 12) {
           int r = 2 * n;
            System.out.println("dobro é ")
           System.out.println(r);
    }else {
            System.out.println("Entre com um numero de 1 a 12...");
           
    }
    }
    
}

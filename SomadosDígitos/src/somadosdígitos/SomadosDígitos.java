/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somadosdígitos;

import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class SomadosDígitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       int soma=0;
        
            System.out.println(" Numero ");
            String n = leia.nextLine(); 
           
            for (int i = 0; i < n.length();i++){
            String d = n.substring (i, i+1);
            int di = Integer.parseInt(d);
            soma = soma +di;
            }
            System.out.println("Soma: "+soma);            
            
            
            
        }
    }
    





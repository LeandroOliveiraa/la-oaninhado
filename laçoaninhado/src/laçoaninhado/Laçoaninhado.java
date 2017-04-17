/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laçoaninhado;

/**
 *
 * @author leandro.osouza
 */
public class Laçoaninhado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                for (int s = 0; s <= 59; s++) {
                    System.out.printf("%d:%d:%d \n", h, m, s);
                if (h == 23 && m == 50 && s == 50){
                System.out.printf("ALARME! ");
                break;
                
                
                }
            }
                if (m== 50){
                    break;
                }
        }
           if (h== 50){
                    break; 
    }
    }
}
}

        

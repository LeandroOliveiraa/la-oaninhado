
package exemplocondicionaissimples;

import java.util.Scanner;


public class ExemploCondicionaisSimples {

  
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
       int n1, n2, n3;
        System.out.print("N1: ");
    n1 = leitor.nextInt();
        System.out.print("N2: ");
    n2 = leitor.nextInt();
     System.out.print("N3: ");
    n3 = leitor.nextInt();
    
   if(n1>n2 && n1>n3) {
       System.out.printf("O número %d é o MAIOR\n", n1);
   }else if (n2>n1 && n2>n3){
   System.out.printf("O número %d é o MAIOR\n", n2);
   }else if (n3>n1 && n3>n2){
       System.out.printf("O número %d é o MAIOR\n", n3);  
   }else{
       System.out.println("Os números São iguais!");
   
   
   }
    
    }
    
    
}

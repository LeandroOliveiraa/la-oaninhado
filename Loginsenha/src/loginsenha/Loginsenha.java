/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsenha;

import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class Loginsenha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
               Scanner leitor = new Scanner (System.in);
        System.out.println("Login:  ");
      String login = leitor.nextLine ();
        System.out.println("Senha: ");
        String senha = leitor.nextLine ();
        if (login.equals("leandro") && senha.equals("123456")){
            System.out.printf("Logado com Sucesso", login);
        }else{
            System.out.println("Login ou senha Errado. ");
        }
    }
    
}
    
    


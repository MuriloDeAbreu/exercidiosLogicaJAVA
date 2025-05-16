/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg01;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
     public static boolean numeroPerfeito(int num) {
         
     if (num <= 1){
     return false;
        }

     int soma = 0;
     for (int i = 1; i < num; i++) {
       if (num % i == 0){
        soma += i;
            }
        }
        return soma == num;
     }
    
     
    public static void main (String[] args){
        
        
        
        
     System.out.println (numeroPerfeito(28));
     System.out.println (numeroPerfeito(4));
     System.out.println (numeroPerfeito(12));
     System.out.println (numeroPerfeito(6));
    }

}
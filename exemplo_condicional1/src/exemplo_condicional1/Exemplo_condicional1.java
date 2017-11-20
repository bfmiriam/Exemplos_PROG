
package exemplo_condicional1;

import java.util.Scanner;


public class Exemplo_condicional1 {

  
    public static void main(String[] args) {
       
       
       
       Scanner ler= new Scanner (System.in);
       
       System.out.println("Introduce primeiro numero:");
       int num1=ler.nextInt();
        
       System.out.println("Introduce segundo numero:");
       int num2=ler.nextInt();
       
       /**if(num1>num2){
           
          System.out.println(num1+" é maior que "+ num2);
       }
       else{
        System.out.println(num1+" é menor que "+num2);
    }
      */  
       //tamén
       
       
      /** String resposta=(num1>=num2)? "maior edade" : "menor edade";
        System.out.println(resposta);
        */
      
      if(num1==num2){
          System.out.println("os numeros son iguais");
      }
        else if(num1>num2){
            System.out.println(num1+" é maior que "+ num2);
        }
        else{
             System.out.println(num1+" é menor que "+ num2); 
        }
    }
    
}

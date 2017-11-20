
package exemplo_switch;

import java.util.Scanner;


public class Exemplo_switch {

 
    public static void main(String[] args) {
        
        Scanner res=new Scanner(System.in);
        
        Metodos obx=new Metodos();
     
        System.out.println(" *** MENU ***\n 1- LUNS\n 2-MARTES\n 3-MERCORES\n 4-XOVES\n 5-VERNES\n 6-SABADO\n 7-DOMINGO");
       System.out.println("Elixe unha opcion:");
        String op=res.next();
        
        obx.comparar(op);
        
        
        
    }
    
}

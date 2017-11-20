
package exemplobucles;

import java.util.Scanner;



public class Exemplobucles {

   
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int op;
        do{
        System.out.println("***MENU***\n1- BucleWhile\n2-BucleDoWhile\n3-BucleFor\n elixe a opcion:");
        op=ler.nextInt();
        switch(op){ 
            case 1: BucleWhile objWhile=new BucleWhile();
                    objWhile.calcularWhile();
                    break;
            case 2: BucleDoWhile objDoWhile=new BucleDoWhile();
                    objDoWhile.calcularDoWhile();
                    break;
            case 3: BucleFor objFor=new BucleFor();
                    objFor.calcularFor();
                    break;
            default: System.out.println("nada");
        }
        }
        while(op!=0);
    }
    
}

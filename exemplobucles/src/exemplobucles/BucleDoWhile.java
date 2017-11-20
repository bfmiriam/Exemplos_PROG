
package exemplobucles;

import java.util.Scanner;


public class BucleDoWhile {
    
    int i=0, aSuma=0, aProducto=1,num;
    
    Scanner ler=new Scanner(System.in);
    
public void calcularDoWhile(){  
    
    do{
    num=ler.nextInt();
    aSuma=aSuma+num;
    aProducto=aProducto*num;
    i++;
    
    }while(i<7);
    System.out.println("suma --> "+aSuma+" producto --> "+aProducto);
    
    }   
}

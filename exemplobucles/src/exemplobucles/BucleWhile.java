
package exemplobucles;

import java.util.Scanner;


public class BucleWhile {
    
public void calcularWhile(){
    
    int i=0, acuSuma=0, acuProducto=1, num;
    Scanner ler=new Scanner(System.in);
    
    
    while(i<7){
        num=ler.nextInt();
        
        acuSuma=acuSuma+num;
        acuProducto=acuProducto*num;
        i++; 
    }
    System.out.println("suma= "+acuSuma+" producto= "+acuProducto);
}
    
    
    
    
    
}

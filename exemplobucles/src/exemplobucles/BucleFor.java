
package exemplobucles;

import java.util.Scanner;


public class BucleFor {
    int aSum=0, aPro=1, num;
    
    Scanner ler=new Scanner(System.in);
    
public void calcularFor(){
    System.out.println("teclea 7 numeros: ");
    
    for(int i=0; i<7;i++){
        
        num=ler.nextInt();
        
        aSum+=num;
        aPro*=num;
    }
    
    System.out.println("suma..."+aSum+" producto..."+aPro);
        }
}

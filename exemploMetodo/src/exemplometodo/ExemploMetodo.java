
package exemplometodo;

import java.util.Scanner;


public class ExemploMetodo {

  
    public static void main(String[] args) {
     
  Rectangulo rect = new Rectangulo();
  
   Scanner ler = new Scanner(System.in);     
   rect.amosar();
   System.out.println("escribe base: ");
   float base= ler.nextFloat();
   System.out.println("escribe altura: ");
   float altura = ler.nextFloat();
   
   Rectangulo rect2 = new Rectangulo(base, altura);
   rect2.amosar();
  rect2.calcularArea(2f,4f); 

   /*float pe= rect2.calcularPerimetro(base,altura);
   System.out.println("perimetro= "+pe);    ou */
   System.out.println("peri= "+rect2.calcularPerimetro(base, altura));
   
   //darlle á base do rectangulo 2 o valor de 10
   
   float perimetro = rect2.calcularPerimetro(base, altura);
   System.out.println("perimetro= "+perimetro);

  float valorAltura=rect2.getAltura();
  System.out.println("altura= "+valorAltura);
  
  System.out.println(rect2.visualizar());
       
   }
  
   
 
  
  
   
   
   
   
   
   
    }
    


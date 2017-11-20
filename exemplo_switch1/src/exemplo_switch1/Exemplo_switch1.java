
package exemplo_switch1;


public class Exemplo_switch1 {

  
    public static void main(String[] args) {
     int sw=0;
        
       for(int i=0; i<6;i++){
       if(sw==0){
       System.out.println("Hola"); 
       sw=1;
       }
       else{
       System.out.println("Adiós"); 
       sw=0;
        }
      } 
    }
    
}

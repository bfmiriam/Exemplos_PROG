
package exemploexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ExemploExcepcion {

  
    public static void main(String[] args) {
     
//        CapturaExcepcion obx1 = new CapturaExcepcion();
//        obx1.dividirCaptura();
        
//        VariosCatch vc1 = new VariosCatch();
//        vc1.dividirCapturaVariosCatch();
//        
//        System.out.println("Remata o programa");

//        ConFinally obx3 = new ConFinally();
//        obx3.dividirCapturaVariosCatch();
          
//        PropagarExcepcion obx4 = new PropagarExcepcion();
//        try{
//        obx4.dividirPropagarExcepcion();
//        }catch(ArithmeticException ex){
//             System.out.println(ex.getMessage());
//        }
   
          DividirCaNosaExcepcion obx5 = new DividirCaNosaExcepcion();
          try {
                obx5.diCaNosaExcepcion();
            } catch (NosaExcepcion ex) {
            System.out.println(ex.getMessage());
          }
            
    
    }
    
    
}


package exemploexcepcion;

import javax.swing.JOptionPane;


public class PropagarExcepcion {
    
    
     private int numerador;
     private int denominador;
    
     
     public PropagarExcepcion() {
         
     }
     
     public void dividirPropagarExcepcion() throws ArithmeticException {
         
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador: "));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador: "));
         
         if(denominador == 0)
             throw new ArithmeticException("****non dividas entre 0 ****");
         System.out.println("resultado= "+numerador/denominador);
         
     }
}

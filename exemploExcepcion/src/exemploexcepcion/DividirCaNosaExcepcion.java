
package exemploexcepcion;

import javax.swing.JOptionPane;

public class DividirCaNosaExcepcion {
    
     private int numerador;
     private int denominador;

    public DividirCaNosaExcepcion() {
    }
    
    public void diCaNosaExcepcion() throws NosaExcepcion{
        
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador: "));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador: "));
         
         if(denominador == 0)
             throw new NosaExcepcion("... non dividas entre 0 ...");
         System.out.println("resultado= "+numerador/denominador);
        
    }
    
   
     
     
    
    
    
}

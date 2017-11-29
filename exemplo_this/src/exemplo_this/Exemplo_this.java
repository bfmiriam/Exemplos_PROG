
package exemplo_this;

import javax.swing.JOptionPane;


public class Exemplo_this {

    
    public static void main(String[] args) {
        
    Rectangulo rec1=new Rectangulo(8,9);
    System.out.println("rec1-> "+rec1.toString());
        
    Rectangulo rec2=new Rectangulo(6);
    System.out.println("rec2-> "+rec2.toString());
    
    
    Rectangulo rec3 = rec1.incrementar();
    System.out.println("rec3-> "+rec3.toString());
    Rectangulo rec4=new Rectangulo(4,5);
    rec4.mudarBase();
     System.out.println("rec4-> "+rec4.toString());
     
     //JOptionPane.showMessageDialog("DGF");
     //JOptionPane.showImputDialog("dame altura"+);
    }
    
}

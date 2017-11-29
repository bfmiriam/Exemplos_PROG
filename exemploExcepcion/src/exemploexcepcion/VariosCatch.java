
package exemploexcepcion;

import javax.swing.JOptionPane;


public class VariosCatch {
   private int numerador;
    private int denominador;

    public VariosCatch() {

    }

    public void dividirCapturaVariosCatch() {

        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador: "));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador: "));

        try {
            int resultado = numerador / denominador;

            System.out.println(numerador + "/" + denominador + " = " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("ERRO 1,Non se pode dividir entre 0.");
            
        }catch(NumberFormatException e2){
            System.out.println("erro 2"+e2.toString());
            //no es un numero
        }
        
    }
}

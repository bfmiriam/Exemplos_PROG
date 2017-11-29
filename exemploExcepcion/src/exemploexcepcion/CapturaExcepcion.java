package exemploexcepcion;

import javax.swing.JOptionPane;

public class CapturaExcepcion {

    private int numerador;
    private int denominador;

    public CapturaExcepcion() {

    }

    public void dividirCaptura() {

        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador: "));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador: "));

        try {
            int resultado = numerador / denominador;

            System.out.println(numerador + "/" + denominador + " = " + resultado);

        } catch (ArithmeticException e) {
            // System.out.println("Non se pode dividir entre 0.");

            e.printStackTrace();
        }
    }
}

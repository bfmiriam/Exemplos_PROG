
package exemploobxecto;


public class ExemploObxecto {


    public static void main(String[] args) {
    Semaforo unSemaforo = new Semaforo(); 
    unSemaforo.darCor("verde");
   String resposta= unSemaforo.dimeCor();
   System.out.println(resposta);
   Semaforo outroSemaforo = new Semaforo();
   outroSemaforo.darCor("amarelo");
   resposta= outroSemaforo.dimeCor();
   System.out.println(resposta);
   //Tamen
   System.out.println(outroSemaforo.dimeCor());
    }
    
}


package exemplo_atributos_obxetos;


public class exemplo_atributos_obxetos {

 
    public static void main(String[] args) {
        
       Conta obxConta = new Conta("millonetis","11111111",10000);
       System.out.println(obxConta.toString());
               
     Persoa p1= new Persoa ("lolo", "2343445556gt");
     obxConta.setTitular(p1);
     System.out.println(obxConta.toString());
     
     
     System.out.println(obxConta.saldoFinal());
     //System.out.println("xuro= "+ Conta.xuro);
     //System.out.println("saldo= "+ obxConta.saldo);
     System.out.println("xuro =" + Conta.getXuro());
 
        
        
    }
    
}

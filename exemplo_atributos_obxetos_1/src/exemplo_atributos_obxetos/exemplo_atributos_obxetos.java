
package exemplo_atributos_obxetos;


public class exemplo_atributos_obxetos {

 
    public static void main(String[] args) {
        
       Conta obxConta = new Conta("millonetis","11111111",10000);
       System.out.println(obxConta.toString());
               
    Persoa obxPer= new Persoa("bbbbb","222222");
    Conta conta2= new Conta(obxPer,258);
    System.out.println("conta2: "+conta2.getTitular()+" saldo: "+conta2.getSaldo());
        
        
    }
    
}

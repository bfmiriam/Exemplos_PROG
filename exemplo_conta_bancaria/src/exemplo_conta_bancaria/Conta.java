
package exemplo_conta_bancaria;


public class Conta {
    
    private String nome, numConta;
    private double saldo;
    
    public Conta(){
   
    }
    
    public Conta(String nome, String numConta, double saldo){
        
        this.nome=nome;
        this.numConta=numConta;
        this.saldo=saldo;
        
    }
    
    public void setnumConta (String num){
        numConta=num;
       
    }
    
    public String getnumConta(){
        return numConta;
    }
     
    
    public String getnome(){
        return nome;
    }
    
    public void setsaldo (double saldo){
        this.saldo=saldo;
       
    }
    
    public double ingresar (double ingreso){
        
         saldo=ingreso+saldo;
        
        return saldo;   
        //ou
        //return saldo + ingreso;
        //saldo+=ingreso -> saldo=ingreso+saldo
    }
    
    public double retirar (double retiro){ 
        
        saldo=saldo-retiro;
        
        return saldo;
    }
    
    
    @Override
    public String toString(){
        return ("Nome= "+nome+"Numero de Conta= "+numConta+"saldo= "+saldo);
    }
    
    public void anularConta(){
        
        nome= "null";
        numConta= "null";
        saldo= 0.0;
        
    }
    
    
    
  
    
    
    
    
    
}

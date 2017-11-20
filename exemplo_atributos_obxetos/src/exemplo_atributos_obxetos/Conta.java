
package exemplo_atributos_obxetos;


public class Conta {
    
     private Persoa titular;
     private double saldo;
     
     
public Conta(){
    titular=new Persoa();
}

public Conta (String nom, String dn, double saldo){
    titular= new Persoa();
    titular.setNome(nom);
    titular.setDni(dn);
    this.saldo=saldo;
}

  public void setTitular(Persoa titular){
   this.titular=titular;
     
 }
 public Persoa getTitular(){
     return titular;
 }
 public void setSaldo (double saldo){
     this.saldo=saldo;
 }
 public double getSaldo(){
     return saldo;
 }
 
//     @Override
// public String toString(){
//     
//     return "titular : "+ titular.getNome()+", "+titular.getDni() +", saldo :"+saldo;
 
 
      @Override
 public String toString(){
     
     return "titular : "+ titular +", saldo : "+saldo;
 
 }
}


package exemplo_atributos_obxetos;


public class Conta {
    
     private Persoa titular= new Persoa();
     private double saldo;
     
     
public Conta(){
 
}

public Conta (String nom, String dn, double saldo){
    titular.setNome(nom);
    titular.setDni(dn);
    this.saldo=saldo;
}
public Conta (Persoa per, double saldo){
    titular=per;
    this.saldo=saldo;
}


  public void setTitular(Persoa ti){
    titular=ti;   
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


package exemplo_this;

import javax.swing.JOptionPane;


public class Rectangulo {
    
   private float base;
   private float altura;
    
public Rectangulo(){
    
}
public Rectangulo(float base, float alt){
    this.base=base;
    altura=alt;
}
//constructor con this
public Rectangulo(float b){
    this(b,0);
}
public float getBase(){
    return base;

}
public void setBase(float base){
    
}
public float getAltura(){
    return altura;

}
public void setAltura(float altura){
    
}
   @Override
   public String toString(){
    return "Rectangulo:\nBase: "+base+"\nAltura: "+altura; 
}
 public Rectangulo incrementar(){
    base++;
    altura=altura+2;
    return this;
   }
public float calcularArea(){
    return base*altura;
}  
public Rectangulo mudarBase(){
    base=15;
    return this;
}


}

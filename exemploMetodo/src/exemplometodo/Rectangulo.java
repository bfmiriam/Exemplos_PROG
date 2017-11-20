
package exemplometodo;


public class Rectangulo {
    
    
    private float base, altura;
    //private float base;
    //private float altura;
    
    public Rectangulo(){
        
    }
    //constructor por parametros
    public Rectangulo (float ba, float alt){
        //si se escribieran = (base=base) -> this.base = base
        base=ba;
        altura=alt;
            
    }
    
    //metodos de acceso
    
    public void setBase(float b){
        base=b;
    }
    public float getBase(){
        return base;
    }
    
    public void setAltura(float a){
        altura=a;
        
    }
    public float  getAltura(){
        return altura;
    }
    public void amosar(){
        System.out.println("base= "+base+" altura= "+altura);
       
    }
    
   // non devolve nada e recibe 2 valores de tipo float, 
    //un para base e outro para altura
    
    public void calcularArea(float b,float a){
    
    float area= b*a;
    
    System.out.println("area= "+area);
    }
    //recibe os valores da base e altura e retorna o perimetro
    public float calcularPerimetro(float b,float a){
      
        //return (b*2+a*2);
        float perimetro= 2*b+2*a;
        
         return perimetro;
   
    
  
    
    }
    
//non vai recibir nada e vai devolver un string (visualizar)
    public String visualizar(){
    
    return ("base= "+base+" altura= "+altura);
    }   
    
}


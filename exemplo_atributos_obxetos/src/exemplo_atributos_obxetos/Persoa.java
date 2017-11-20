
package exemplo_atributos_obxetos;


public class Persoa {
    
    private String nome;
    private String dni;
    

public Persoa(){

}

public Persoa(String nome, String dni){

this.nome=nome;
this.dni=dni;

}
public void setNome(String nome){
    this.nome=nome;
}
public String getNome(){
    return nome;
}
public void setDni(String dni){
    this.dni=dni;
}
public String getDni(){
    return dni;
}
    @Override
    public String toString(){
        
        return "nome="+ nome +", dni="+dni;
}

}

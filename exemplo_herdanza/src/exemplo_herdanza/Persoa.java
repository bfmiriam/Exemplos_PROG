
package exemplo_herdanza;


public class Persoa {
    
    private String nome;
    protected String apelido;
    private int edade;
    
public Persoa(){
    
}
public Persoa(String no, String ap, int ed){
    nome=no;
    apelido=ap;
    edade=ed;
}
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome=nome;
}
public String getApelido(){
    return apelido;
} 
public void setApelido(String apelido){
    this.apelido=apelido;
}
public int getEdade(){
    return edade;
}
public void setEdade(int edade){
    this.edade=edade;
} 

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + '}';
    }

}

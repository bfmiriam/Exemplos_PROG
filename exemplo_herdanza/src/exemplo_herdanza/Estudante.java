
package exemplo_herdanza;


public class Estudante extends Persoa {
    
    private String codigo;
    private int notaFinal;
    
public Estudante(){
    
}
public Estudante(String no, String ap, int ed, String co, int not){
    super(no,ap,ed);
    codigo=co;
    notaFinal=not;
    
}
 public String getCodigo(){
     return codigo;
 }   
 public void setCodigo(String co){
     codigo=co;
 }
 public int getNotaFinal(){
     return notaFinal;
 }
 public void setNotaFinal(int no){
     notaFinal=no;
 }
 public void amosar(){
     System.out.println("nome: "+getNome()+"\napelido: "+apelido+
    "\nedade: "+getEdade()+"\ncodigo: "+getCodigo()+"\nnota final:" +getNotaFinal());
 }

    @Override
    public String toString() {
        return "Estudante{" + "codigo=" + codigo + ", notaFinal=" + notaFinal +super.toString()+ '}';
    }
 
}

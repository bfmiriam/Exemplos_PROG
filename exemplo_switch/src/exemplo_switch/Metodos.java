
package exemplo_switch;


public class Metodos {
    
    public void comparar(String op){
        switch(op){
            case "luns": System.out.println("Luns");
            break;
            case "martes": System.out.println("Martes");
            break;
            case "mercores": System.out.println("Mercores");
            break;
            case "xoves": System.out.println("Xoves");
            break;
            case "venres": System.out.println("Venres");
            break;
            case "sabado": System.out.println("Sabado");
            break;
            case "domingo": System.out.println("Domingo");
            break;
            
            default: System.out.println("A opcion escollida non é válida");
           
        }
    }
}

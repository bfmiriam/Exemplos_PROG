
package exemplo_conta_bancaria;

import java.util.Scanner;



public class Exemplo_conta_bancaria {

  
    public static void main(String[] args) {
//codifica un programa para xestionar unha conta bancaria
//para iso crea unha clase conta con tres atributos(nome,nºde conta e saldo tipo bouble)
//constructores por defecto e por parametros.
//metodos de acceso para o nº de conta, metodo para recibir o nome da conta e para mudar o saldo
//metodo que reciba unha cantidade de cartos e os ingrese na nosa conta e devolva o saldo final
/*metodo que reciba unha cantidade de cartos e os retire da nosa conta devolvendo o saldo total
(ainda que non teña cartos na conta o banco nolos da e queda en numeros vermellos)*/
Scanner ler=new Scanner(System.in);

Conta libreta1 = new Conta ();

System.out.println(libreta1.toString());

libreta1.setsaldo(100000);
libreta1.setnumConta("1111 ");
System.out.println(libreta1.toString());


Conta libreta2 = new Conta("Ana ", "22222 ", 5000);
System.out.println(libreta2.toString());

libreta2.setnumConta(" 1234 ");
System.out.println(libreta2.toString());

System.out.println(" nome: ");
String nome=ler.nextLine();

System.out.println(" numConta: ");
String numConta=ler.next();


System.out.println(" saldo: ");
double saldo=ler.nextDouble();

Conta libreta3= new Conta (nome, numConta, saldo);


//libreta3.ingresar(3000);

//System.out.println(libreta3.toString());

System.out.println("total= "+libreta3.ingresar(3000));

System.out.println("total= "+libreta3.retirar(200));


System.out.println("total= "+libreta3.retirar(200000));

libreta3.anularConta();

System.out.println(libreta3.toString());






    }
    
}

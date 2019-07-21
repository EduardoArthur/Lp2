package lp2g12.biblioteca;
import java.io.Serializable;
import java.util.*;

public class Pessoa implements Serializable{

    private String nome;
    private GregorianCalendar nasc;

    public Pessoa(String a,int x,int y,int z){
        this.nome = a;
        this.nasc = new GregorianCalendar(z,y,x);
    }

    public String getnome(){
        return nome;
    }
    public GregorianCalendar getdata(){
        return nasc;
    }

    @Override
    public String toString(){
        String a = "Nome: " + nome + "\n";
        String b = "Data de nascimento: " + nasc.get(Calendar.DATE) + "/" + nasc.get(Calendar.MONTH) + "/" + nasc.get(Calendar.YEAR) + "\n"; 
        return a + b;
    } 

}
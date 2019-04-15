import java.io.IOException;
import java.io.*;
public class Pessoa{
    private String nome;
    private String data;
    public Pessoa(String a, String b){
        this.data = b;
        this.nome = a;
    }

    public String getnome(){
        return this.nome;
    }
    public String getdata(){
        return this.data;
    }
    
    @Override
    public String toString(){
        String a,b;
        a = String.format("Nome: "+ getnome() + "\n");
		b = String.format("Data de Nascimento: " + getdata() + "\n");
		return a+b;
    }

}
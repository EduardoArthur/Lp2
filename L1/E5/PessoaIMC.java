import java.io.IOException;
import java.io.*;
public abstract class PessoaIMC extends Pessoa{
    private double peso;
    private double altura;
    private double IMC;
    public PessoaIMC(String a,String b,double c,double d){
        super(a,b);
        this.peso = c;
        this.altura = d;
    }
    public double getpeso(){
        return this.peso;
    }
    public double getaltura(){
        return this.altura;
    }
    public double calculaIMC(double a, double p){
        this.IMC = (p)/(a*a);
        return (p)/(a*a); 
    }
    public double getIMC(){
        return this.IMC;
    }
    public abstract String resultIMC();
    @Override
    public String toString(){
        String a,b,c,d;
        a = String.format("Nome: "+ getnome() + "\n");
        b = String.format("Data de Nascimento: " + getdata() + "\n");
        c = String.format("Peso: "+ getpeso() + "\n");
		d = String.format("Altura: " + getaltura() + "\n");
		return a+b+c+d;
    }


}
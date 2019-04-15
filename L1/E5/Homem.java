public class Homem extends PessoaIMC{

    public Homem(String a,String b,double c,double d){
        super(a,b,c,d);
    }
    private double IMC;
    public String resultIMC(){
        double x;
        String a;
        x=calculaIMC(getaltura(),getpeso());
        if(x > 26.4){
            a=String.format("acima do peso ideal (IMC: %.2f) \n", x);
        }else if(x < 20.7){
            a=String.format("abaixo do peso ideal (IMC: %.2f) \n", x);
        }else{
            a=String.format("peso ideal (IMC: %.2f) \n", x);
        }
        this.IMC = x;
        return  a;
    }
    @Override
    public String toString(){
        String a,b,c,d;
        a = String.format("Nome: "+ getnome() + "\n");
        b = String.format("Data de Nascimento: " + getdata() + "\n");
        c = String.format("Peso: "+ getpeso() + "\n");
		d = String.format("Altura: " + getaltura() + "\n");
		return a+b+c+d+resultIMC();
    }

}
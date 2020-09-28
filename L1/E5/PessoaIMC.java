public abstract class PessoaIMC extends Pessoa{
    private double peso;
    private double altura;
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
        return (p)/(a*a);
    }
    public abstract String resultIMC();
    @Override
    public String toString(){
        String a,b,c;
        a = super.toString();
        b = String.format("Peso: "+ getpeso() + "\n");
		c = String.format("Altura: " + getaltura() + "\n");
		return a+b+c;
    }


}
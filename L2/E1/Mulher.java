public class Mulher extends PessoaIMC{

    public Mulher(String a,String b,double c,double d){
        super(a,b,c,d);
    }
    public String resultIMC(){
        double x;
        String a;
        x=calculaIMC(getaltura(),getpeso());
        if(x > 25.8){
            a=String.format("acima do peso ideal (IMC: %.2f)\n",getIMC());
        }else if(x < 19){
            a=String.format("abaixo do peso ideal (IMC: %.2f)\n",getIMC());
        }else{
            a=String.format("peso ideal (IMC: %.2f)\n",getIMC());
        }
        return  a;
    }
    @Override
    public String toString(){
		return super.toString() + resultIMC();
    }

}
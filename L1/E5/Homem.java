public class Homem extends PessoaIMC{

    public Homem(String a,String b,double c,double d){
        super(a,b,c,d);
    }
    public String resultIMC(){
        double x;
        String a;
        x=calculaIMC(getaltura(),getpeso());
        if(x > 26.4){
            a=String.format("acima do peso ideal\n");
        }else if(x < 20.7){
            a=String.format("abaixo do peso ideal\n");
        }else{
            a=String.format("peso ideal\n");
        }
        return  a;
    }
    @Override
    public String toString(){
		return super.toString() + resultIMC();
    }

}
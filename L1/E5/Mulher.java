public class Mulher extends PessoaIMC{

    public Mulher(String a,String b,double c,double d){
        super(a,b,c,d);
    }
    public String resultIMC(){
        double x;
        String a;
        x=calculaIMC(getaltura(),getpeso());
        if(x > 25.8){
            a=String.format("acima do peso ideal\n");
        }else if(x < 19){
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
import java.util.*;
public class MinhaListaOrdenavel{
    ArrayList<PessoaIMC> Pessoas = new ArrayList<PessoaIMC>();
    public void adiciona(PessoaIMC a){
        Pessoas.add(a);
    }
    public PessoaIMC getpessoa(int i){
        return Pessoas.get(i);
    }
    public Comparator<Object> pesoc = new Comparator<Object>(){
        public int compare(Object a,Object b){
            double x,y;
            PessoaIMC A = (PessoaIMC) a;
            PessoaIMC B = (PessoaIMC) b;
            x=A.getpeso();
            y=B.getpeso();
            return (int)Math.round(x-y);
        }
    };
    public Comparator<Object> alturac = new Comparator<Object>(){
        public int compare(Object a,Object b){
            double x,y,t;
            PessoaIMC A = (PessoaIMC) a;
            PessoaIMC B = (PessoaIMC) b;
            x=A.getaltura();
            y=B.getaltura();
            t=x-y;
            if(t>0){
                return 1;
            }else{
                return -1;
            }
        }
    };
    public Comparator<Object> IMCc = new Comparator<Object>(){
        public int compare(Object a,Object b){
            double x,y,t;
            PessoaIMC A = (PessoaIMC) a;
            PessoaIMC B = (PessoaIMC) b;
            x=A.getIMC();
            y=B.getIMC();
            t=x-y;
            if(t>0){
                return 1;
            }else{
                return -1;
            }
        }
    };
    public Comparator<Object> Azc = new Comparator<Object>(){
        public int compare(Object a,Object b){
            String x,y;
            char X,Y;
            PessoaIMC A = (PessoaIMC) a;
            PessoaIMC B = (PessoaIMC) b;
            x= A.getnome();
            y= B.getnome();
            X=x.charAt(0);
            Y=y.charAt(0);
            if(X < Y){
                return -1;
            }else if(X==Y){
                for(int i=1;i<x.length();i++){
                    X=x.charAt(i);
                    Y=y.charAt(i);
                    if(X < Y){
                        return -1;
                    }else if(X > Y){
                        return 1;
                    }
                }
            }else{
                return 1;
            }
            return 0;
        }
    };

    public Comparator<Object> Genc = new Comparator<Object>(){
        public int compare(Object a,Object b){
            PessoaIMC A = (PessoaIMC) a;
            PessoaIMC B = (PessoaIMC) b;
            if((A instanceof Homem) && (B instanceof Mulher)){
                return 1;
            }else if((A instanceof Mulher) && (B instanceof Homem)){
                return -1;
            }else{
                return 0;
            }
        }
    };
    public ArrayList ordena(int x){
        switch (x) {
            case 1:
                // az
                Collections.sort(this.Pessoas, Azc);
                break;
            case 2:
                // za
                Collections.sort(this.Pessoas, Azc.reversed());
                break;
            case 3:
                // peso
                Collections.sort(this.Pessoas, pesoc);
                break;
            case 4:
                // peso v2
                Collections.sort(this.Pessoas, pesoc.reversed());
                break;
            case 5:
                // altura
                Collections.sort(this.Pessoas, alturac);
                break;
            case 6:
                // altura v2
                Collections.sort(this.Pessoas, alturac.reversed());
                break;
            case 7:
                // imc
                Collections.sort(this.Pessoas, IMCc);
                break;
            case 8:
                Collections.sort(this.Pessoas, IMCc.reversed());
                break;
            case 9:
                Collections.sort(this.Pessoas, Genc);
                break;
            case 10:
                Collections.sort(this.Pessoas, Genc.reversed());
            
        }
        return this.Pessoas;
    }
    @Override
    public String toString(){
        String a="";
        for(int i=0;i<Pessoas.size();i++){
            a = a + String.format(getpessoa(i)+"\n");
        }
        return a;
    }
    
}
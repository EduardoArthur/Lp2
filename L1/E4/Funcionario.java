public class Funcionario{
    private String nome;
    private String id;
    protected double salarioL;
    protected double salario;

    public Funcionario(String a, String b, double x){
        this.nome = a;
        this.id = b;
        this.salario = x;
        this.salarioL = x;
    }

    public double calculaSalario(double desconto){
        return (salario * (100 - desconto))/100 ;
    }
    public String getnome(){
        return this.nome;
    }
    public String getid(){
        return this.id;
    }
    public double getsalario(){
        return this.salario;
    }
    public double getsalarioL(){
        return this.salarioL;
    }
    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + "Codigo: " + id + "\n" + "Salario Base: " + salario ;
    }

}
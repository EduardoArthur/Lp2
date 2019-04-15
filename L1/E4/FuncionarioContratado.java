public class FuncionarioContratado extends Funcionario{
    private int dependentes;
    private double salarioF;
    private double valordep = 9.58;
    private double aliquotaIR = 15.00;
    public FuncionarioContratado(String a, String b, double x, int y){
        super(a,b,x);
        this.dependentes = y;
    }
    public void calculasalario(){
        this.salarioL = calculaSalario(aliquotaIR);
    }
    public void calculasalario(int x){
        this.salarioF = x * valordep;
        double a = salario;
        this.salario = a + salarioF;
        this.salarioL = calculaSalario(aliquotaIR);
    }
    public double getsalarioF(){
        return this.salarioF;
    }
    public int getdep(){
        return this.dependentes;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Salario Liquido: " + salarioL;
    }

}
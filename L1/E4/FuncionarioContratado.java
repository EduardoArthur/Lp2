public class FuncionarioContratado extends Funcionario{
    private int dependentes;
    private float salarioF;
    private double valordep = 9.58;
    private float aliquotaIR = 15;
    public FuncionarioContratado(String a, String b, float x, int y){
        super(a,b,x);
        this.dependentes = y;
    }
    public void calculasalario(){
        this.salarioL = calculaSalario(aliquotaIR);
    }
    public void calculasalario(int x){
        this.salarioF = x * (float)valordep;
        float a = salario;
        this.salario = a + salarioF;
        this.salarioL = calculaSalario(aliquotaIR);
    }
    public float getsalarioF(){
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
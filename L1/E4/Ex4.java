import java.io.*;
import java.util.ArrayList;
public class Ex4{

    private static int Funcionarios;
    public static String data;
    private static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    public Ex4(int x){
        this.Funcionarios = x;
    }
    public void Calculasalario()throws IOException{
        String nome,id;
        float salario=0;
        int dep=0;
        ArrayList <FuncionarioContratado> novo = new ArrayList<>();
        System.out.println("--- Cadastro de Funcionarios");
        for(int i=0;i<Funcionarios;i++){
            boolean sucesso = false;
            System.out.println("Digite o nome do funcionario:");
            data = buff.readLine();
            while(data.length() == 0){
                System.out.println("Nome vazio");
                System.out.println("Digite o nome do funcionario:");
                data = buff.readLine();
            }
            nome = data;
            System.out.println("Digite o codigo do funcionario:");
            data = buff.readLine();
            while(data.length() == 0){
                System.out.println("Codigo vazio");
                System.out.println("Digite o codigo do funcionario:");
                data = buff.readLine();
            }
            id = data;
            do{
                try{
                    System.out.println("Digite o salario do funcionario:");
                    data = buff.readLine();
                    salario = Float.parseFloat(data);
                    if(salario > 0){
                        sucesso = true;
                    }else{
                        System.out.println("Nao paga o seu funcionario?");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Entrada invalida");
                }
            }while(!sucesso);
            sucesso = false;
            do{
                try{
                    System.out.println("Digite o numero de dependentes:");
                    data = buff.readLine();
                    dep = Integer.parseInt(data);
                    sucesso = true;
                }catch(NumberFormatException e){
                    System.out.println("Entrada invalida");
                }
            }while(!sucesso);
            novo.add(new FuncionarioContratado(nome,id,salario,dep));
            novo.get(i).calculasalario(dep);
            System.out.println();
        }
    System.out.println("\n --- Folha Salarial ---");
    for(int i=0;i<Funcionarios;i++){
        System.out.println(novo.get(i));
        System.out.println("----");
    }
}

    public static void main(String[] args){
        int x=0;
        boolean sucesso = false;
        do{
            try{
                System.out.println("Digite a quantidade de funcionarios contratados");
                data = buff.readLine();
                x = Integer.parseInt(data);
                if(x > 0){
                    sucesso = true;
                    Ex4 yey = new Ex4(x);
                    yey.Calculasalario();
                }
            }catch(NumberFormatException e){
                System.out.println("Entrada nao estritamente numerica.");
            }catch(IOException e){
                System.out.println("Entrada invalida.");
            }
        }while(!sucesso);
    }
}
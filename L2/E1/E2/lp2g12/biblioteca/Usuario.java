package lp2g12.biblioteca;
import java.util.*;
import java.io.*;
public class Usuario extends Pessoa implements Serializable{

    private String adress;
    private int codigo;
    private ArrayList<Emprestimo> historico; 
    protected int livrosemprestados = 0;

    public Usuario(String nome, int dia, int mes, int ano, String endereco, int codigoUsuario){
        super(nome, dia, mes, ano);
        this.adress = endereco;
        this.codigo = codigoUsuario;
        historico = new ArrayList<Emprestimo>();
    }
    public String getadress(){
        return adress;
    }
    public int getcod(){
        return codigo;
    }
    public void atualizaemprestimo(int x){
        if(x == 1){
            this.livrosemprestados++;
        }else if(x == -1){
            this.livrosemprestados--;
        }
    }

    public void addLivroHist(GregorianCalendar I,GregorianCalendar F, String a){
        historico.add(new Emprestimo(I, F, a));
    }

    public void atualizahist(GregorianCalendar data, String a){
        int tmpindex = -1;
        Emprestimo tmpEmprest = null;
        for(int i = 0;i<historico.size();i++){
            tmpEmprest = (Emprestimo) historico.get(i);
            if(tmpEmprest.getid().equals(a)){
                tmpindex = i;
                
            }
        }
        Emprestimo temp = historico.get(tmpindex);
        long duration = temp.getdataF().getTimeInMillis() - data.getTimeInMillis();
        if(duration < 0){
            System.out.println("Entrega com atraso");
        }
        Emprestimo atual = new Emprestimo(temp.getdataI(), data, a);
        try{
            historico.set(tmpindex, atual);
        }catch(IndexOutOfBoundsException e){
            System.out.println("emprestimo nao localizado");
        }
        
    }
    
    public String gethistorico(){
        String h = "\n";
        for(int i = 0;i < historico.size();i++){
            h = h + historico.get(i) + "\n";
        }
        return "----Historico----" + h;
    }

    @Override
    public String toString(){
        return super.toString() + "Endereco: " + adress + "\n" + "Codigo de usuario: "
         + codigo + "\n" + gethistorico();
    } 

    

}
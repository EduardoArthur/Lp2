package lp2g12.biblioteca;
import lp2g12.exception.*;
import java.io.Serializable;
import java.util.*;
public class Livro implements Serializable{

    private String id;
    private String titulo;
    private String categoria;
    private int total;
    private int emprestados;
    private ArrayList<EmprestadoPara> Historico;
    public Livro(String a,String b,String c,int d,int e){
        this.id=a;
        this.titulo=b;
        this.categoria=c;
        this.total=d;
        this.emprestados=e;
        Historico = new ArrayList<EmprestadoPara>();
    }
    public Livro(String a){
        this.titulo = a;
    }
    public String gettitulo(){
        return this.titulo;
    }
    public String getID(){
        return this.id;
    }
    public String getcategoria(){
        return this.categoria;
    }
    public int gettotal(){
        return this.total;
    }
    public int getemprestados(){
        return this.emprestados;
    }
    
    public void empresta()throws CopiaNaoDisponivelEx{
        if(emprestados < total){
            this.emprestados=emprestados+1;
        }else{
            throw new CopiaNaoDisponivelEx();
        }
    }
    public void devolve()throws NenhumaCopiaEmprestadaEx{
        if(emprestados < 1){
            throw new NenhumaCopiaEmprestadaEx();
        }else{
            this.emprestados=emprestados-1;
        }
    }
    
    public void addUsuarioHist(GregorianCalendar a,GregorianCalendar b,int c){
        EmprestadoPara rip = new EmprestadoPara(a,b,c);
        Historico.add(rip);
    }
    public void atualizaHist(GregorianCalendar data,int x){
        EmprestadoPara tmpEmprest = null;
        int tmpindex = -1;
        for(int i = 0;i<Historico.size();i++){
            tmpEmprest = (EmprestadoPara) Historico.get(i);
            if(tmpEmprest.getcodigo() == x){
                tmpindex = i;   
            }
        }
        EmprestadoPara tmp = Historico.get(tmpindex);
        EmprestadoPara atual = new EmprestadoPara(tmp.getinicio(),data,x);
        try{
            Historico.set(tmpindex, atual);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Emprestimo nao localizado");
        }
    }
    public String gethist(){
        String h = "\n";
        for(int i = 0;i < Historico.size();i++){
            h = h + Historico.get(i) + "\n";
        }
        return "----Historico----" + h;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + titulo + "\nCodigo do livro: " + id + "\n" + "Categoria: " +
        categoria + "\nTotal de exemplares : " + total +"\nCopias emprestadas: " + emprestados +
        "\n" + gethist();
    }
}
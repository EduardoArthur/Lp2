package lp2g12.biblioteca;
import java.io.Serializable;
import java.util.*;
public class EmprestadoPara implements Serializable{

    private GregorianCalendar dataI;
    private GregorianCalendar dataF;
    private int codigo;
    
    public EmprestadoPara(GregorianCalendar I,GregorianCalendar F,int x){
        this.dataI = I;
        this.dataF = F;
        this.codigo = x;
    }
    public int getcodigo(){
        return codigo;
    }
    public GregorianCalendar getinicio(){
        return dataI;
    }
    public GregorianCalendar getfim(){
        return dataF;
    }

    @Override
    public String toString(){
        String a = "Data de emprestimo: " + dataI.get(Calendar.DATE) + "/" + dataI.get(Calendar.MONTH) + "/" + dataI.get(Calendar.YEAR) + "\n";
        String b = "Data de devolucao: " + dataF.get(Calendar.DATE) + "/" + dataF.get(Calendar.MONTH) + "/" + dataF.get(Calendar.YEAR) + "\n";
        return a + b + "Codigo do Usuario: " + codigo + "\n";
    }

}
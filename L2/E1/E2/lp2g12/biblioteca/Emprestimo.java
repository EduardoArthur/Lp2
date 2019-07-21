package lp2g12.biblioteca;
import java.io.Serializable;
import java.util.*;

public class Emprestimo implements Serializable{
    private GregorianCalendar dataI;
    private GregorianCalendar dataF;
    private String id;

    public Emprestimo(GregorianCalendar I,GregorianCalendar F, String a){
        this.dataI = I;
        this.dataF = F;
        this.id = a;
    }
    public String getid(){
        return id;
    }
    public GregorianCalendar getdataF(){
        return dataF;
    }
    public GregorianCalendar getdataI(){
        return dataI;
    }

    @Override
    public String toString(){
        String a = "Data de emprestimo: " + dataI.get(Calendar.DATE) + "/" + dataI.get(Calendar.MONTH) + "/" + dataI.get(Calendar.YEAR) + "\n";
        String b = "Data de devolucao: " + dataF.get(Calendar.DATE) + "/" + dataF.get(Calendar.MONTH) + "/" + dataF.get(Calendar.YEAR) + "\n";
        return a + b + "Codigo do livro: " + id + "\n";
    }
}
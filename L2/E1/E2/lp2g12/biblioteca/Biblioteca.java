package lp2g12.biblioteca;
import lp2g12.exception.*;
import java.util.*;
import java.io.*;
public class Biblioteca implements Serializable{
    
    private Hashtable usuarios;
    private Hashtable livros;

    public Biblioteca(String arqUsuario, String arqLivros){
        try{

            ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream(arqUsuario));
            usuarios = (Hashtable)inputStream1.readObject();
            inputStream1.close();

            ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream(arqLivros));
            livros = (Hashtable)inputStream2.readObject();
            inputStream2.close();

        }catch(FileNotFoundException e){
            System.out.println("Arquivo nao encontrado");
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public Biblioteca(){
        usuarios = new Hashtable();
        livros = new Hashtable();
    }

    public void cadastraUsuario(Usuario a){
        usuarios.put(a.getcod(), a);
    }
    public void cadastraLivro(Livro a){
        livros.put(a.getID(), a);
    }
    public void salvaArquivo(Hashtable a,String arq){
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arq));
            outputStream.writeObject(a);
            outputStream.flush();
            outputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("Arquivo nao encontrado");
        }catch(IOException e){
            System.out.println(e);
        }

    }
    public void leArquivo(String arq){
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arq));
            Hashtable temp = (Hashtable)inputStream.readObject();
            System.out.println(temp);
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("Arquivo nao encontrado");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public void emprestaLivro(Usuario a,Livro b) throws CopiaNaoDisponivelEx{
        if(a.livrosemprestados < 3){
            b.empresta();
            a.atualizaemprestimo(1);
            GregorianCalendar hoje = new GregorianCalendar();
            GregorianCalendar devolucao = new GregorianCalendar();
            devolucao.add(Calendar.DATE,10);
            a.addLivroHist(hoje, devolucao, b.getID());
            b.addUsuarioHist(hoje, devolucao, a.getcod());
            
        }else{
            System.out.println("O Usuario ja retirou o maximo de livros permitido pela politica da biblioteca");
        } 
    }
    public void devolveLivro(Usuario a, Livro b) throws NenhumaCopiaEmprestadaEx{
        if(a.livrosemprestados > 0){
            b.devolve();
            a.atualizaemprestimo(-1);
            GregorianCalendar hoje = new GregorianCalendar();
            a.atualizahist(hoje,b.getID());
            b.atualizaHist(hoje,a.getcod());
        }else{
            System.out.println("O Usuario nao tem livros para devolver");
        }
    }
    public String imprimeLivros(){
        return livros.toString();
    }
    public String imprimeUsuarios(){
        return usuarios.toString();
    }
    public Livro getLivro(String codigoLivro) throws LivroNaoCadastradoEx{
        Livro livro = (Livro) livros.get(codigoLivro);
        if(livro == null){
            throw new LivroNaoCadastradoEx();
        }else{
            return livro;
        }
    }
    public Usuario getUsuario(int codigoUsuario) throws UsuarioNaoCadastradoEx{
        Usuario usuario = (Usuario) usuarios.get(codigoUsuario);
        if(usuario == null){
            throw new UsuarioNaoCadastradoEx();
        }else{
            return usuario;
        }
    }
    public Hashtable getUsuarioHash(){
        return usuarios;
    }
    
    public Hashtable getLivroHash(){
        return livros;
    }
}
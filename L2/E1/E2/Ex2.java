import lp2g12.biblioteca.*;
import lp2g12.exception.*;
import java.io.*;
public class Ex2{

    private static Biblioteca biblioteca = new Biblioteca();

    public static void manutencao(String arq1, String arq2){
        try{
            FileInputStream inputStream1 = new FileInputStream(arq1);
            FileInputStream inputStream2 = new FileInputStream(arq2);
            biblioteca = new Biblioteca(arq1, arq2);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }

    public static void cadastro() throws IOException{

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        boolean sucess = false , running = true;
        int opcao = 0,dia = 0,mes = 0,ano = 0,cod = 0,copia = 0;
        String nome = "",endereco = "",codL = "",categoria = "";
        String info = "";
        while(running){
            while(!sucess){
                info = "teste";
                System.out.println("==== Menu de Cadastros ====");
                System.out.println("Digite o numero referente a opcao desejada:");
                System.out.println("1 - Cadastrar Usuario");
                System.out.println("2 - Cadastrar Livro");
                System.out.println("3 - Salvar");
                System.out.println("4 - Voltar");
                System.out.println("===========================");
                try{
                    info = buff.readLine();
                    opcao = Integer.parseInt(info);
                    if(opcao > 0 && opcao < 5){
                        sucess = true;
                    }else{
                        System.out.println("opcao invalida");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Digite o NUMERO referente a opcao");
                }catch(IOException e){
                    System.out.println("algo deu errado tente novamente");
                }
            }
            sucess = false;
            switch(opcao){
                case 1:
                    System.out.println("==== Cadastrar Usuario ====");
                    while(!sucess){
                        System.out.println("Nome do usuario:");
                        info = "";
                        info = buff.readLine();
                        if(info.isEmpty()){
                            System.out.println("Nome vazio");
                        }else{
                            nome = info;
                            sucess = true;
                        }
                    }
                    sucess = false;
                    System.out.println("==== Data de nascimento ====");
                    while(!sucess){
                        System.out.println("Digite o dia:");
                        try{
                            info=buff.readLine();
                            dia = Integer.parseInt(info);
                            if(dia > 31 || dia < 1){
                                System.out.println("Dia invalido");
                            }else{
                                sucess=true;
                            }
                        }catch(NumberFormatException e){
                            System.out.println("Dia deve ser numerico");
                        }catch(IOException e){
                            System.out.println("Dia invalido");
                        }
                    }
                    sucess = false;
                    while(!sucess){
                        System.out.println("Digite o mes:");
                        try{
                            info = buff.readLine();
                            mes = Integer.parseInt(info);
                            if(mes > 12 || mes < 1){
                                System.out.println("Mes invalido");
                            }else{
                                sucess=true;
                            }
                        }catch(NumberFormatException e){
                            System.out.println("Mes deve ser numerico");
                        }catch(IOException e){
                            System.out.println("Mes invalido");
                        }
                    }
                    sucess = false;
                    while(!sucess){
                        System.out.println("Digite o ano:");
                        try{
                            info = buff.readLine();
                            ano = Integer.parseInt(info);
                            if(ano > 1900){
                                sucess=true;
                            }else{
                                System.out.println("impossivel, digite um ano valido");
                            }
                        }catch(NumberFormatException e){
                            System.out.println("o ano deve ser numerico");
                        }catch(IOException e){
                            System.out.println("Ano invalido:");
                        }
                    }
                    sucess = false;
                    while(!sucess){
                        System.out.println("Digite o endereco:");
                        info = buff.readLine();
                        if(info.length() == 0 ){
                            System.out.println("endereco vazio");
                        }else{
                            endereco = info;
                            sucess = true;
                        }
                    }
                    sucess = false;
                    while(!sucess){
                        System.out.println("Digite o codigo do usuario:");
                        try{
                            info=buff.readLine();
                            cod = Integer.parseInt(info);
                            try{
                                biblioteca.getUsuario(cod);
                            }catch(UsuarioNaoCadastradoEx e){
                                sucess = true;
                            }
                        }catch(NumberFormatException e){
                            System.out.println("O codigo deve ser numerico:");
                        }

                    }
                    sucess = false;
                    Usuario user = new Usuario(nome, dia, mes, ano, endereco, cod);
                    biblioteca.cadastraUsuario(user);
                    System.out.println("Cadastro concluido");
                    break;
                case 2:
                    System.out.println("==== Cadastrar Livro ====");
                    sucess = false;
                    while(!sucess){
                        System.out.println("Digite o Nome do Livro:");
                        info = "";
                        info = buff.readLine();
                        if(info.isEmpty()){
                            System.out.println("Nome vazio");
                        }else{
                            nome = info;
                            sucess = true;
                        }
                    }
                    sucess = false;
                    while(!sucess){
                        System.out.println("Digite o Codigo do Livro:");
                        info = "";
                        info = buff.readLine();
                        codL = info;
                        if(info.isEmpty()){
                            System.out.println("Codigo vazio");
                        }else{
                            try{
                                biblioteca.getLivro(codL);
                            }catch(LivroNaoCadastradoEx e){
                                sucess = true;
                            }
                        }
                    }
                    sucess = false;
                    while(!sucess){
                        System.out.println("Digite a categoria do Livro:");
                        info = "";
                        info = buff.readLine();
                        if(info.isEmpty()){
                            System.out.println("Nome vazio");
                        }else{
                            categoria = info;
                            sucess = true;
                        }
                    }
                    sucess = false;
                    while(!sucess){
                        System.out.println("Digite a quantidade de exemplares disponiveis:");
                        try{
                            info=buff.readLine();
                            copia = Integer.parseInt(info);
                            if(copia > 0){
                                sucess=true;
                            }else{
                                System.out.println("Precisa ter no minimo 1 livro");
                            }
                        }catch(NumberFormatException e){
                            System.out.println("Entrada invalida");
                        }
                    }
                    sucess = false;
                    Livro livro = new Livro(codL, nome, categoria, copia, 0);
                    biblioteca.cadastraLivro(livro);
                    System.out.println("Livro cadastrado");
                    break;
                case 3:
                    sucess = false;
                    int op = 0;
                    while(!sucess){
                        System.out.println("Digite o numero referente a opcao desejada:");
                        System.out.println("1 - Salvar Cadastro de Usuario");
                        System.out.println("2 - Salvar Cadastro de Livro");
                        System.out.println("3 - Voltar");
                        try{
                            info = buff.readLine();
                            op = Integer.parseInt(info);
                            if(op > 0 && op < 4){
                                sucess = true;
                            }else{
                                System.out.println("Opcao invalida");
                            }
                        }catch(NumberFormatException e){
                            System.out.println("Digite o NUMERO referente a opcao");
                        }
                    }
                    sucess = false;
                    String arq = "";
                    switch(op){
                        case 1:
                            System.out.println("Digite o nome do arquivo");
                            arq = buff.readLine();
                            biblioteca.salvaArquivo(biblioteca.getUsuarioHash() , arq);
                            System.out.println("Arquivo de usuarios salvo");
                            break;
                        case 2:
                            System.out.println("Digite o nome do arquivo");
                            arq = buff.readLine();
                            biblioteca.salvaArquivo(biblioteca.getLivroHash() , arq);
                            System.out.println("Arquivo de livros salvo");
                            break;
                        case 3:
                            break;

                    }
                    sucess = false;
                    break;
                case 4:
                    sucess = false;
                    running = false;
                    break;
            }
        }
    }

    public static void emprestimo()throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        boolean sucess = false, running = true;
        int opcao = 0;
        String info = "";
        while(running){
            sucess = false;
            int cod = 0;
            Usuario pessoa = null;
            Livro book = null;
            int tenta = 3;
            while(!sucess){
                info = "teste";
                System.out.println("==== Menu de Emprestimos ====");
                System.out.println("Digite o numero referente a opcao desejada:");
                System.out.println("1 - Exibir Livros");
                System.out.println("2 - Emprestar Livro");
                System.out.println("3 - Devolver Livro");
                System.out.println("4 - Voltar");
                System.out.println("=============================");
                try{
                    info = buff.readLine();
                    opcao = Integer.parseInt(info);
                    if(opcao > 0 && opcao < 5){
                        sucess = true;
                    }else{
                        System.out.println("opcao invalida");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Digite o NUMERO referente a opcao");
                }catch(IOException e){
                    System.out.println("algo deu errado tente novamente");
                }
            }
            sucess = false;
            switch(opcao){
                case 1:
                    System.out.println("==== Livros Cadastrados ====");
                    System.out.println(biblioteca.imprimeLivros());
                    System.out.println("Para retornar aperte qualquer tecla:");
                    String tmp = buff.readLine();
                    break;
                case 2:
                    sucess = false;
                    cod = 0;
                    pessoa = null;
                    book = null;
                    tenta = 3;
                    while(!sucess && tenta > 0){
                        System.out.println("Digite o codigo do usuario:");
                        try{
                            info=buff.readLine();
                            cod = Integer.parseInt(info);
                            pessoa = (Usuario) biblioteca.getUsuario(cod);
                            sucess = true;
                        }catch(NumberFormatException e){
                            System.out.println("O codigo deve ser numerico:");
                        }catch(UsuarioNaoCadastradoEx e){
                            System.out.println(e);
                            tenta--;
                            System.out.println("tentativas restantes: " + tenta);
                        }

                    }
                    if(tenta < 1){
                        break;
                    }
                    sucess = false;
                    tenta = 3;
                    while(!sucess && tenta > 0){
                        System.out.println("Digite o Codigo do Livro:");
                        info = buff.readLine();
                        String codL = info;
                        try{
                            book = (Livro) biblioteca.getLivro(codL);
                            sucess = true;
                        }catch(LivroNaoCadastradoEx e){
                             System.out.println(e);
                             tenta--;
                             System.out.println("tentativas restantes: " + tenta);
                        }
                    }
                    if(tenta < 1){
                        break;
                    }
                    try{
                        biblioteca.emprestaLivro(pessoa, book);
                        System.out.println("Livro emprestado com sucesso");
                    }catch(CopiaNaoDisponivelEx e){
                        System.out.println(e);
                    }
                    sucess = false;
                    break;
                case 3:
                    sucess = false;
                    cod = 0;
                    pessoa = null;
                    book = null;
                    tenta = 3;
                    while(!sucess && tenta > 0){
                        System.out.println("Digite o codigo do usuario:");
                        try{
                            info=buff.readLine();
                            cod = Integer.parseInt(info);
                            pessoa = (Usuario) biblioteca.getUsuario(cod);
                            sucess = true;
                        }catch(NumberFormatException e){
                            System.out.println("O codigo deve ser numerico:");
                        }catch(UsuarioNaoCadastradoEx e){
                            System.out.println(e);
                            tenta--;
                            System.out.println("tentativas restantes: " + tenta);
                        }

                    }
                    if(tenta < 1){
                        break;
                    }
                    tenta = 3;
                    sucess = false;
                    while(!sucess){
                        System.out.println("Digite o Codigo do Livro:");
                        info = buff.readLine();
                        String codL = info;
                        try{
                            book = (Livro) biblioteca.getLivro(codL);
                            sucess = true;
                        }catch(LivroNaoCadastradoEx e){
                            System.out.println(e);
                            tenta--;
                            System.out.println("tentativas restantes: " + tenta);
                        }
                    }
                    if(tenta < 1){
                        break;
                    }
                    try{
                        biblioteca.devolveLivro(pessoa, book);
                        System.out.println("Livro devolvido com sucesso");
                    }catch(NenhumaCopiaEmprestadaEx e){
                        System.out.println(e);
                    }
                    sucess = false;
                    break;
                case 4:
                    sucess = false;
                    running = false;
                    break;
            }
        }
    }

    public static void relatorio()throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        boolean sucess = false, running = true;
        int opcao = 0,cod = 0,tenta = 3;
        String info = "", tmp = "";
        while(running){
            sucess = false;
            while(!sucess){
                System.out.println("==== Relatorio ====");
                System.out.println("Digite o numero referente a opcao desejada:");
                System.out.println("1 - Acervo de Livros.");
                System.out.println("2 - Cadastros dos Usuarios.");
                System.out.println("3 - Detalhes de um usuario especifico.");
                System.out.println("4 - Detalhes de um livro especifico.");
                System.out.println("5 - Voltar.");
                System.out.println("===================");
                try{
                    info = buff.readLine();
                    opcao = Integer.parseInt(info);
                    if(opcao > 0 && opcao < 6){
                        sucess = true;
                    }else{
                        System.out.println("opcao invalida");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Digite o NUMERO referente a opcao");
                }catch(IOException e){
                    System.out.println("algo deu errado tente novamente");
                }
            }
            switch(opcao){
                case 1:
                    System.out.println(biblioteca.getLivroHash());
                    System.out.println("Para retornar aperte qualquer tecla:");
                    tmp = buff.readLine();
                    sucess = false;
                    break;
                case 2:
                    System.out.println(biblioteca.getUsuarioHash());
                    System.out.println("Para retornar aperte qualquer tecla:");
                    tmp = buff.readLine();
                    sucess = false;
                    break;
                case 3:
                    sucess = false;
                    tenta = 3;
                    while(!sucess && tenta > 0){
                        System.out.println("Digite o codigo do usuario:");
                        try{
                            info=buff.readLine();
                            cod = Integer.parseInt(info);
                            Usuario tmpuser = (Usuario) biblioteca.getUsuario(cod);
                            System.out.println(tmpuser);
                            sucess = true;
                        }catch(NumberFormatException e){
                            System.out.println("O codigo deve ser numerico");
                        }catch(UsuarioNaoCadastradoEx e){
                            System.out.println(e);
                            tenta--;
                            System.out.println("tentativas restantes: " + tenta);
                        }
                    }
                    if(tenta < 1){
                        break;
                    }
                    System.out.println("Para retornar aperte qualquer tecla:");
                    tmp = buff.readLine();
                    sucess = false;
                    break;
                case 4:
                    sucess = false;
                    tenta = 3;
                    while(!sucess && tenta > 0){
                        System.out.println("Digite o codigo do Livro:");
                        try{
                            info=buff.readLine();
                            Livro tmpbook = (Livro) biblioteca.getLivro(info);
                            System.out.println(tmpbook);
                            sucess = true;
                        }catch(LivroNaoCadastradoEx e){
                            System.out.println(e);
                            tenta--;
                            System.out.println("tentativas restantes: " + tenta);
                        }
                    }
                    if(tenta < 1){
                        break;
                    }
                    System.out.println("Para retornar aperte qualquer tecla:");
                    tmp = buff.readLine();
                    sucess = false;
                    break;
                case 5:
                    sucess = false;
                    running = false;

            }
        }
    }



    public static void main(String[] args) throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        boolean running = true,sucess = false;
        int opcao = 0;
        String arq1 ="", arq2 = "", info = "";
        while(running){
            sucess = false;
            while(!sucess){
                info = "";
                System.out.println("==== Menu ====");
                System.out.println("Digite o numero referente a opcao desejada:");
                System.out.println("1 - Cadastros");
                System.out.println("2 - Emprestimos");
                System.out.println("3 - Manutencao");
                System.out.println("4 - Relatorio");
                System.out.println("5 - Encerrar");
                System.out.println("==============");
                try{
                    info = buff.readLine();
                    opcao = Integer.parseInt(info);
                    if(opcao > 0 && opcao < 6){
                        sucess = true;
                    }else{
                        System.out.println("opcao invalida");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Digite o NUMERO referente a opcao");
                }catch(IOException e){
                    System.out.println("algo deu errado tente novamente");
                }   
            }
            switch(opcao){
                case 1:
                    cadastro();
                    sucess = false;
                    break;
                case 2:
                    emprestimo();
                    sucess = false;
                    break;
                case 3:
                    System.out.println("digite o arquivo do cadastro de usuarios:");
                    arq1 = buff.readLine();
                    System.out.println("digite o arquivo do cadastro de livros:");
                    arq2 = buff.readLine();
                    manutencao(arq1, arq2);
                    sucess = false;
                    break;
                case 4:
                    relatorio();
                    sucess = false;
                    break;
                case 5:
                    sucess = false;
                    running = false;
            }
        }   
    }
}
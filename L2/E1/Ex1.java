import java.io.*;
public class Ex1{
    public static void main(String []args){
        MinhaListaOrdenavel lista = new MinhaListaOrdenavel();
        int dia,mes,ano;
        boolean sucess = false;
        boolean running = true;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String info,a,b;
        char s;
        double c,d;
        lista.adiciona(new Homem("Eduardo","28/04/1999",50.0,1.66));
        lista.adiciona(new Homem("Mac","18/09/1987",49.0,1.42));
        lista.adiciona(new Mulher("Ashley","27/07/2004",40.0 ,1.30));
        lista.adiciona(new Homem("Kazuma","07/06/1999",75.0 ,1.67));
        lista.adiciona(new Mulher("Yuri","12/04/2001",70.0 ,1.65));
        lista.adiciona(new Mulher("Sayori","22/09/2001",55.0 ,1.57));
        lista.adiciona(new Homem("Erwin","14/10/1990",92.0 ,1.88));
        lista.adiciona(new Mulher("Zelda","25/12/1996",65.0 ,1.70));
        lista.adiciona(new Mulher("Megumin","04/12/2002",50.0 ,1.50));
        lista.adiciona(new Homem("Sasuke","23/07/2002",52.2 ,1.68));
        
        while(running){
            System.out.println("============================");    
            System.out.println("1 - Imprimir a lista.");
            System.out.println("2 - Adicionar nova pessoa.");
            System.out.println("3 - Encerrar.");
            System.out.println("============================");
            System.out.println("Escolha o numero referente ao que deseja fazer:");
            int op=0,op2=0;
            do{
                try{
                    info = buff.readLine();
                    op = Integer.parseInt(info);
                    sucess = true;
                }catch(NumberFormatException e){
                    System.out.println("Escolha o NUMERO referente a opcao que deseja:");
                }catch(IOException e){
                    System.out.println("Escolha o NUMERO referente a opcao que deseja:");
                }
            }while(!sucess);
            sucess = false;
                    switch(op){
                        case 1:
                            System.out.println("=================================");
                            System.out.println("Escolha a forma de ordenacao:");
                            System.out.println("1 - Alfabetica A-Z");
                            System.out.println("2 - Alfabetica Z-A");
                            System.out.println("3 - Peso crescente");
                            System.out.println("4 - Peso decrescente");
                            System.out.println("5 - Altura crescente");
                            System.out.println("6 - Altura decrescente");
                            System.out.println("7 - IMC crescente");
                            System.out.println("8 - IMC decrescente");
                            System.out.println("9 - Genero (mulheres primeiro)");
                            System.out.println("10 - Genero (homens primeiro)");
                            System.out.println("=================================");
                            do{
                                try{
                                    info = buff.readLine();
                                    op2 = Integer.parseInt(info);
                                    sucess = true;
                                }catch(NumberFormatException e){
                                    System.out.println("Escolha o NUMERO referente a opcao que deseja:");
                                }catch(IOException e){
                                    System.out.println("Escolha o NUMERO referente a opcao que deseja:");
                                }
                            }while(!sucess);
                            lista.ordena(op2);
                            System.out.println(lista);
                            break;
                        case 2:
                            info="teste"; ano=0;d=0;
                            s='e'; mes=0; dia=0;c=0;
                            a="teste"; sucess = false;
                            System.out.println("Inserir homem(h) ou mulher(m)?");
                            do{
                                try{
                                    info=buff.readLine();
                                    s=info.charAt(0);
                                    sucess=true;
                                    while(s!='h'&& s!='m'){
                                        s = 'e';
                                        System.out.println("Invalido");
                                        System.out.println("Inserir homem(h) ou mulher(m)?");
                                        info=buff.readLine();
                                        if(info.length() > 0){
                                            s = info.charAt(0);
                                        }
                                    }
                                }catch(IOException e){
                                    System.out.println("Invalido");
                                }catch(StringIndexOutOfBoundsException e){
                                    System.out.println("Invalido");
                                    System.out.println("Inserir homem(h) ou mulher(m)?");
                                }
                            }while(!sucess);
                
                            sucess=false;
                            do{
                                System.out.println("digite o nome:");
                                try{
                                    info=buff.readLine();
                                    while(info.length() == 0){
                                        System.out.println("Nome vazio:");
                                        System.out.println("Digite o nome:");
                                        info=buff.readLine();
                                    }
                                    a=info;
                                    sucess=true;
                                }catch(IOException e){
                                    System.out.println("Nome invalido");
                                }
                            }while(!sucess);
                            
                            sucess=false;
                            System.out.println("Data de nascimento:");
                            do{
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
                            }while(!sucess);
                
                            sucess=false;
                                do{
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
                                }while(!sucess);
                                
                                sucess=false;
                                System.out.println("Digite o ano:");
                                do{
                                    try{
                                        info = buff.readLine();
                                        ano = Integer.parseInt(info);
                                        sucess=true;
                                    }catch(NumberFormatException e){
                                        System.out.println("o ano deve ser numerico");
                                        System.out.println("Digite o ano:");
                                    }catch(IOException e){
                                        System.out.println("Digite o ano:");
                                    }
                                }while(!sucess);
                            b = dia + "/" + mes + "/" + ano;
                            sucess=false;
                            do{
                                System.out.println("Digite o peso(KG):");
                                try{
                                    info=buff.readLine();
                                    c=Double.parseDouble(info);
                                    if(c > 0){
                                        sucess = true;
                                    }else{
                                        System.out.println("Peso deve ser maior que zero");
                                    }
                                }catch(NumberFormatException e){
                                    System.out.println("O peso deve ser numerico");
                                }catch(IOException e){
                                    System.out.println("O peso deve ser numerico");
                                }
                            }while(!sucess);
                            
                            sucess=false;
                            do{
                                System.out.println("Digite a altura(M):");
                                try{
                                    info=buff.readLine();
                                    d=Double.parseDouble(info);
                                    if(d > 0){
                                        sucess=true;
                                    }else{
                                        System.out.println("Altura deve ser maior que zero");
                                    }
                                }catch(NumberFormatException e){
                                    System.out.println("A altura deve ser um numerica:");
                                }catch(IOException e){
                                    System.out.println("A altura deve ser numerica:");
                                }
                            }while(!sucess);
                            
                            if(s =='h'){
                                Homem novo = new Homem(a,b,c,d);
                                lista.adiciona(novo);
                            }else{
                                Mulher nova = new Mulher(a,b,c,d);
                                lista.adiciona(nova);
                            }
                            break;
                    
                        case 3:
                            running = false;
                            break;
                    }
        }
    }
}
import java.io.IOException;
import java.io.*;
public class Ex1{
    public static void main(String []args){
        MinhaListaOrdenavel lista = new MinhaListaOrdenavel();
        int dia,mes,ano;
        boolean sucess=false;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String info,a,b;
        char s;
        double c,d;
        for(int i=0;i<10;i++){
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
                        System.out.println("Invalido");
                        System.out.println("Inserir homem(h) ou mulher(m)?");
                        info=buff.readLine();
                        s=info.charAt(0);
                    }
                }catch(IOException e){
                    System.out.println("Invalido");
                }catch(StringIndexOutOfBoundsException e){
                    System.out.println("Invalido");
                    System.out.println("Inserir homem(h) ou mulher(m)?");
                }
            }while(!sucess);
            sucess=false;
            System.out.println("digite o nome:");
            do{
                try{
                    info=buff.readLine();
                    a=info;
                    sucess=true;
                }catch(IOException e){
                    System.out.println("Digite o nome:");
                }
            }while(!sucess);
            
            sucess=false;
            System.out.println("Data de nascimento:");
            System.out.println("Digite o dia:");
            do{
                try{
                    info=buff.readLine();
                    dia = Integer.parseInt(info);
                    sucess=true;
                }catch(NumberFormatException e){
                    System.out.println("Dia deve ser numerico");
                    System.out.println("Digite o dia:");
                }catch(IOException e){
                    System.out.println("Digite o dia:");
                }
            }while(!sucess);
            sucess=false;
            
                while(dia > 31 || dia < 1){
                    System.out.println("Dia invalido");
                    System.out.println("Digite o dia:");
                    do{
                        try{
                            info = buff.readLine();
                            dia = Integer.parseInt(info);
                            sucess=true;
                        }catch(NumberFormatException e){
                            System.out.println("Dia deve ser numerico");
                            System.out.println("Digite o dia:");
                        }catch(IOException e){
                            System.out.println("Digite o dia:");
                        }
                        
                    }while(!sucess);
                    
                }
                System.out.println("Digite o mes:");
                sucess=false;
                do{
                    try{
                        info = buff.readLine();
                        mes = Integer.parseInt(info);
                        sucess=true;
                    }catch(NumberFormatException e){
                        System.out.println("Mes deve ser numerico");
                        System.out.println("Digite o mes:");
                            
                    }catch(IOException e){
                        System.out.println("Digite o mes:");
                    }
                }while(!sucess);
                
                sucess=false;
                while(mes > 12 || mes < 1){
                    System.out.println("Mes invalido:");
                    System.out.println("Digite o mes:");
                    do{
                        try{
                            info = buff.readLine();
                            mes = Integer.parseInt(info);
                            sucess=true;
                        }catch(NumberFormatException e){
                            System.out.println("Mes deve ser numerico");
                            System.out.println("Digite o mes:");
                        }catch(IOException e){
                            System.out.println("Digite o mes:");
                        }
                    }while(!sucess);
                    
                }
                System.out.println("Digite o ano:");
                sucess=false;
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
            System.out.println("Digite o peso(KG):");
            sucess=false;
            do{
                try{
                    info=buff.readLine();
                    c=Double.parseDouble(info);
                    sucess = true;
                }catch(NumberFormatException e){
                    System.out.println("O peso deve ser numerico");
                    System.out.println("Digite o peso(KG):");
                }catch(IOException e){
                    System.out.println("O peso deve ser numerico");
                }
            }while(!sucess);
            
            sucess=false;
            System.out.println("Digite a altura(M):");
            do{
                try{
                    info=buff.readLine();
                    d=Double.parseDouble(info);
                    sucess=true;
                }catch(NumberFormatException e){
                    System.out.println("A altura deve ser um numerica:");
                    System.out.println("Digite a altura(M):");
                }catch(IOException e){
                    System.out.println("A altura deve ser numerica:");
                }
            }while(!sucess);
            
            if(s =='h'){
                Homem novo = new Homem(a,b,c,d);
                lista.adiciona(novo);
                System.out.println(novo);
            }else{
                Mulher nova = new Mulher(a,b,c,d);
                lista.adiciona(nova);
                System.out.println(nova);
            }
        }
        sucess = false;
        System.out.println("1-Imprimir a lista.");
        System.out.println("2-Encerrar.");
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
                        System.out.println("Escolha a forma de ordenacao:");
                        System.out.println("1 - Alfabetica A-Z");
                        System.out.println("2 - Alfabetica Z-A");
                        System.out.println("3 - Peso crescente");
                        System.out.println("4 - Peso decrescente");
                        System.out.println("5 - Altura crescente");
                        System.out.println("6 - Altura decrescente");
                        System.out.println("7 - IMC crescente");
                        System.out.println("8 - IMC decrescente");
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
                
                }
    }
}
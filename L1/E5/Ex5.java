import java.io.*;
import java.util.*;
public class Ex5{
    public static void main(String []args){
        ArrayList lista = new ArrayList ();
        int dia,mes,ano,n=0;
        boolean sucess=false;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String info,a,b;
        char s;
        double c,d;
        
        while(!sucess){
            try{
                System.out.println("digite a quantidade de pessoas:");
                info = buff.readLine();
                n = Integer.parseInt(info);
                if(n>0){
                    sucess = true;
                }
            }catch(NumberFormatException e){
                System.out.println("digite um valor valido");
            }catch(IOException e){
                System.out.println("digite um valor valido");
            }
        }

        for(int i=0;i<n;i++){
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
                lista.add(novo);
            }else{
                Mulher nova = new Mulher(a,b,c,d);
                lista.add(nova);
            }
        }
        for(int i=0;i<lista.size();i++){
            System.out.println("--------");
            System.out.println(lista.get(i));
        }
    }
}
import java.io.IOException;
import java.io.*;
public class Ex5{
    public static void main(String []args){
        int dia,mes,ano;
        boolean sucess=false;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String info,a,b;
        char s;
        double c,d;
        info="teste"; ano=0;d=0;
        s='e'; mes=0; dia=0;c=0;
        a="teste";
        System.out.println("Inserir homem(h) ou mulher(m)?");
        do{
            try{
			    info=buff.readLine();
                s=info.charAt(0);
                while(s!='h'&& s!='m'){
                    System.out.println("Invalido");
                    System.out.println("Inserir homem(h) ou mulher(m)?");
                    info=buff.readLine();
                    s=info.charAt(0);
                }
                sucess=true;
            }catch(IOException e){
                System.out.println("Invalido");
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
            System.out.println(novo);
        }else{
            Mulher nova = new Mulher(a,b,c,d);
            System.out.println(nova);
        }
    }
}
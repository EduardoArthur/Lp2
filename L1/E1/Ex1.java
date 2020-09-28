import java.io.*;

public class Ex1{
    public static Boolean negativo(float a){
        if(a<=0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        if(args.length < 1 || args.length > 3){
            System.out.println("Numero de argumentos invalidos");
        }else{
            try{
                float a = Float.parseFloat(args[0]);
                if(negativo(a) == true){
                    System.out.println("Uma das medidas igual ou menor a zero");
                }else{
                    if(args.length == 1){
                        Objeto Circulo = new Objeto(a,0,0);
                        System.out.printf("Area do circulo: %.2f unidades de medida",Circulo.iniciar());
                    }else if(args.length == 2){

                        float b = Float.parseFloat(args[1]);
                        if(negativo(b) == true){
                            System.out.println("Uma das medidas igual ou menor a zero");
                        }else{
                            Objeto Retangulo = new Objeto(a,b,0);
                            System.out.printf("Area do Retangulo: %.2f unidades de medida",Retangulo.iniciar());
                        }
                    }else if(args.length == 3){

                            float b = Float.parseFloat(args[1]);
                            float c = Float.parseFloat(args[2]);
                            if(negativo(b) == true || negativo(c) == true){
                                System.out.println("Uma das medidas igual ou menor a zero");
                            }else{
                                Objeto Triangulo = new Objeto(a,b,c);
                                System.out.printf("Area do Triangulo: %.2f unidades de medida \n",Triangulo.iniciar());
                                System.out.println(Triangulo.gettriangulo());
                            }
                    }
                }
            }catch(NumberFormatException e){
                System.out.println("Entrada nao estritamente numerica");
            }
        }
    }
}
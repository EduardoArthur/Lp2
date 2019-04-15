import java.io.*;
public class Teste{
    public static void main(String[] args){
        Retangulo[] quadrados = new Retangulo[5];
        quadrados[0] = new Retangulo(2,2);
        quadrados[1] = new Retangulo(3,5);

        for(int i=0;i<5;i++){
            if(quadrados[i] == null){
                System.out.println("vazio");
            }else if(quadrados[i].getaltura() == quadrados[i].getbase()){
                System.out.println("Quadrado");
            }else{
                System.out.println("Retangulo");
            }
        }

    }
}

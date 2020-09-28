import java.io.*;
public class Ex3{
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String aux = "iniciar";
        Boolean sucess = false;
        int x = 0;
        while(!sucess){
            try{
                System.out.println("digite a quantidade de angulos:");
                aux = in.readLine();
                x = Integer.parseInt(aux);
                if(x>0){
                    sucess = true;
                }else{
                    System.out.println("quantidade invalida");
                }
            }catch(NumberFormatException e){
                System.out.println("nao eh numero");
            }
        }
        Double v[] = new Double[x];
		AnguloObj[] array = new AnguloObj[x];
        for(int i=0;i<x;i++){
            sucess = false;
            while(!sucess){
                try{
                    System.out.println("digite o angulo:");
                    aux = in.readLine();
                    v[i] = Double.parseDouble(aux);
                    array[i] = new AnguloObj(v[i]);
                    sucess = true;
                }catch(NumberFormatException e){
                    System.out.println("nao eh numero");
                }
            }
        }
        System.out.println("===== Resultado =====");
        for(int i=0;i<x;i++){
            System.out.println(array[i]);
        }
	}
}
			

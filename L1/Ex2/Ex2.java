import java.io.*;
public class Ex2{
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String aux = "inicio";
		do{
			try{
				System.out.println("digite o angulo:");
				aux = in.readLine();
				if(aux.isEmpty()){
					break;
				}
				Angulo info = new Angulo();
				double x = Double.parseDouble(aux);
				System.out.printf("angulo em radianos: %.2f \n" , info.getAngulo(x));
				System.out.printf("seno: %.2f \n" , info.getseno(x));
				System.out.printf("coseno: %.2f \n" , info.getcoseno(x));
				System.out.printf("tangente: %.2f \n" , info.gettangente(x));
				System.out.printf("cotangente: %.2f \n" , info.getcotan(x));
				System.out.println("");
			}catch(NumberFormatException e){
				System.out.println("entrada nao numerica");
			}catch(IOException e){
				System.out.println("entrada invalida");
			}	
		}while(!aux.isEmpty());
	}
}
			
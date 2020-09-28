import java.io.*;
public class Ex2{
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String aux = "inicio";
		do{
			try{
				System.out.println("Digite o angulo em graus:");
				aux = in.readLine();
				if(aux.isEmpty()){
					break;
				}
				Angulo info = new Angulo();
				double x = Double.parseDouble(aux);
				System.out.printf("Angulo em radianos: %.2f \n" , info.getAngulo(x));
				System.out.printf("Seno: %.2f \n" , info.getseno(x));
				System.out.printf("Cosseno: %.2f \n" , info.getcoseno(x));
				System.out.printf("Tangente: %.2f \n" , info.gettangente(x));
				System.out.printf("Cotangente: %.2f \n" , info.getcotan(x));
				System.out.println("");
			}catch(NumberFormatException e){
				System.out.println("Entrada nao numerica");
			}catch(IOException e){
				System.out.println("Entrada invalida");
			}	
		}while(!aux.isEmpty());
	}
}
			
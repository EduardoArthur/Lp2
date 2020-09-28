import java.lang.Math;
public class Angulo{
	private static double converte(double a){
		return Math.toRadians(a);
	}
	public static double getAngulo(double a){
		return converte(a);
	}
	private static double seno(double a){
		return Math.sin(a);
	}
	public static double getseno(double a){
		return seno(getAngulo(a));
	}
	private static double coseno(double a){
		return Math.cos(a);
	}
	public static double getcoseno(double a){
		return coseno(getAngulo(a));
	}
	private static double tangente(double a){
		return Math.tan(a);
	}
	public static double gettangente(double a){
		return tangente(getAngulo(a));
	}
	public static double getcotan(double a){
		return (1/(tangente(getAngulo(a))));
	}
}
import java.lang.Math;
import java.text.DecimalFormat;
public class AnguloObj{

	private double anguloconv;
	
  public AnguloObj (double a){
    this.anguloconv = Math.toRadians(a);
	}
	public double getangulo(){
		return Math.toRadians(anguloconv);
	}
	public double seno(){
		return Math.sin(anguloconv);
	}
	public double coseno(){
		return Math.cos(anguloconv);
	}
	public double tangente(){
		return Math.tan(anguloconv);
	}
	public double cotan(){
		return (1/(Math.tan(anguloconv)));
  }
  @Override
  public String toString(){
		String a,b,c,d,e;
		DecimalFormat x = new DecimalFormat("#0.00");
		a =	String.format("angulo em radianos: %.2f rad\n",anguloconv);
		b =	String.format("seno: "+ x.format(seno())+ "\n");
		c =	String.format("coseno: "+ x.format(coseno())+ "\n");
		d =	String.format("tangente: "+ x.format(tangente())+ "\n");
		e =	String.format("cotangente: "+ x.format(cotan())+ "\n");
		return a+b+c+d+e;
  }
}
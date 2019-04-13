import java.lang.Math;
public class Objeto{
    private double x;
    private double y;
    private double z;

    public Objeto(double a, double b, double c){
        this.x = a;
        this.y = b;
        this.z = c;
    }
    public double iniciar(){
        return calcula(x,y,z);
    }
    private static double calcula(double a,double b,double c){
        double area;
        if(b == 0){
            area = Math.PI*(a*a);
        }else if(c == 0){
            area = a*b;
        }else{
            double p = (a + b + c)/2;
            area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        }
        return area;
    }
    public String gettriangulo(){
        if(!((Math.abs(y-z) < x && x < y+z) && (Math.abs(x-z) < y && y < x+z) && (Math.abs(x-y) < z && z < x+y))){
			return "Nao e um triangulo.";
        }else if((x == y) && (x == z)){
			return "O triangulo e equilatero.";
		}else if((x == y) || (x == z) || (y == z)){
			return "O triangulo e isosceles.";
		}else{
			return "O triangulo e escaleno.";
		}
	}
    @Override
    public String toString(){
        return "Area: " + iniciar();
    }
}

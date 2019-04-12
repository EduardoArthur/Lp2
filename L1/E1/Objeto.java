import java.lang.Math;
public class Objeto{
    private Double x;
    private Double y;
    private Double z;

    public Objeto(Double a, Double b, Double c){
        this.x = a;
        this.y = b;
        this.z = c;
    }
    public Double iniciar(){
        return calcula(x,y,z);
    }
    public String gettriangulo(){
        if(!( x < (y+z) && y < (x+z) && z < (x+y))){
			return "Nao e um triangulo";
		}else{
            if(x==y && x==z){
				return "Triangulo equilatero";
			}else if((x == y && x != z)||(y == z && z != x)||(x == z && z != y)){
				return "Triangulo isoceles";
			}else{
				return "Triangulo escaleno";
			}
		}
    }
    private static Double calcula(Double a,Double b,Double c){
        Double area;
        if(b == null){
            area = Math.PI*(a*a);
        }else if(c == null){
            area = a*b;
        }else{
            Double p = (a + b + c)/2;
            area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        }
        return area;
    }
    @Override
    public String toString(){
        return "Area: " + iniciar();
    }
}
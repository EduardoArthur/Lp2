public class Retangulo{
    private double base;
    private double altura;
    private double perimetro;
    private double area;
    public double getperimetro(){
        return this.perimetro;
    }
    public double getarea(){
        return this.area;
    }
    public double getaltura(){
        return this.altura;
    }
    public double getbase(){
        return this.base;
    }
    public Retangulo(double a, double b){
        this.base = a;
        this.altura = b;
        this.perimetro = a*2 + b*2;
        this.area = a*b;
    } 
}

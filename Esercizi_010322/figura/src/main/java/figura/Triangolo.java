package figura;
public class Triangolo extends FiguraGeo{
    private final double lato1, lato2, lato3;
    private double area, perimetro;
     public Triangolo(double lato1, double lato2, double lato3) {
        super("Triangolo");
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    
    public double getLato1() {
        return lato1;
    }
    public double getLato2() {
        return lato2;
    }
    public double getLato3() {
        return lato3;
    }
    
    @Override
    public double Perimetro(){
       perimetro=lato1+lato2+lato3;
       return perimetro;
    }
        
    @Override
    public double Area(){
        double sp=perimetro;
        area=Math.sqrt(sp*(sp-lato1*lato2)*(sp-lato2*lato3)*(sp-lato1*lato3));
        return area;
    }
     @Override
     public String toString() {
        return ("L'area del triangolo e' " +area+" mentre il perimetro e' "+perimetro);
    }
}

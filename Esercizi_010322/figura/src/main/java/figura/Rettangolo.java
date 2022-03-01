package figura;
public class Rettangolo extends FiguraGeo{
    private final double base, altezza;
    private double perimetro, area;
    public Rettangolo(double base, double altezza) {
        super("Rettangolo");
        this.base = base;
        this.altezza = altezza;
    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltezza() {
        return altezza;
    }
    
    @Override
    public double Perimetro(){
       perimetro=2*(base+altezza);
       return perimetro;
    }
        
    @Override
    public double Area(){
        area=base*altezza;
        return area;
    }
    
     @Override
     public String toString() {
        return ("L'area del rettangolo e' " +area+" mentre il perimetro e' "+perimetro);
    }
     
}
      

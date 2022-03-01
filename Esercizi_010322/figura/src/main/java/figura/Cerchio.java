package figura;
public class Cerchio extends FiguraGeo {
    private final double raggio;
    private double area, perimetro;
     public Cerchio(double raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }
     
    public double getRaggio() {
        return raggio;
    }
    
    
    @Override
    public double Perimetro(){
       perimetro=2*Math.PI*(raggio);
       return perimetro;
    }
        
    @Override
    public double Area(){
        area=raggio*raggio*Math.PI;
        return area;
    }
     @Override
     public String toString() {
        return ("L'area del cerchio e' " +area+" mentre il perimetro e' "+perimetro);
    }
     
}

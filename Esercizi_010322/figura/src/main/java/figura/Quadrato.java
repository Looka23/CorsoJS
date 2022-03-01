package figura;
public class Quadrato extends FiguraGeo{
    private final double lato;
    private double area, perimetro;
    public Quadrato(double lato) {
        super("Quadrato");
        this.lato = lato;
    }
    
    public double getLato() {    
        return lato;
    }
    
    @Override
    public double Perimetro(){
        perimetro=lato*4;
        return perimetro;
    }
    
    @Override
    public double Area(){
        area=lato*lato;
        return area;
    }
    
    @Override
    public String toString() {
        return ("L'area del rettangolo e' " +area+ " mentre il perimetro e' "+perimetro);
    }
    
}
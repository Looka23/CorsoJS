package figura;
public class Ellisse extends FiguraGeo{
    private final double SAM, sam;
    private double perimetro, area;
     public Ellisse(double SAM, double sam) {
        super("Ellisse");
        this.SAM = SAM;
        this.sam = sam;
    }   
     
    public double getSAMaggiore() {
        return SAM;
    }
    
    public double getsam() {
        return sam;
    }
    
    @Override
    public double Perimetro(){
       perimetro=2*Math.PI*Math.sqrt((Math.pow(SAM,2)+Math.pow(sam,2))/2);
       return perimetro;
    }
        
    @Override
    public double Area(){
        area=Math.PI*sam*SAM;
        return area;
    }
    
     @Override
     public String toString() {
        return ("L'area dell'ellisse e' " +area+" mentre il perimetro e' "+perimetro);
    }
     
}

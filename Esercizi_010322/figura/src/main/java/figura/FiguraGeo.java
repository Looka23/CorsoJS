package figura;
public abstract class  FiguraGeo {
    private final String descrizione;
    
    public FiguraGeo(String descrizione) {
        this.descrizione= descrizione;
    }
    
    public String getDescrizione(){
        return descrizione;
    }
    
    public double Perimetro(){
        return 0;
    }
    
    public double Area(){
        return 0;
    }
    
     @Override
     public String toString() {
        return "FiguraGeo{" + "descrizione=" + descrizione + '}';
}
   
}

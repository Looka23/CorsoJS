package Articolo;
public class Mobile implements Articolo {
    private String nome;
    private double prezzo;
    private double lunghezza;
    private double altezza;
    private double profondità;
    
    public Mobile(String nome, double prezzo, double lunghezza, double altezza, double profondità){
        this.nome = nome;
        this.prezzo = prezzo;
        this.lunghezza = lunghezza;
        this.altezza = altezza;
        this.profondità = profondità;
    }
    
    @Override
    public String getNome() {
    return nome;
  }
    
    @Override
    public double getPrezzo() {
    return prezzo;
  }
    
    public double getLunghezza() {
    return lunghezza;
  }
    
    public double getAltezza() {
    return altezza;
  }
    
    public double getProfondità() {
    return profondità;
  }
    
    @Override
    public String toString(){
       return this.nome+" Prezzo: "+prezzo+" Misure: "+lunghezza+" X "+altezza+" X "+profondità;
}

}

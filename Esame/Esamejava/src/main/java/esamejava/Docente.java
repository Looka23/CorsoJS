package esamejava;
public class Docente {
    private String nome;
    private String cognome;
    private int codice;
    private int età;
    public Docente(String n, String c, int cod, int e){
        nome=n;
        cognome=c;
        codice=cod;
        età=e;  
}
    public Docente(Docente d){
        nome=d.getNome();
        cognome=d.getCognome();
        codice=d.getCodice();
        età=d.getEtà();
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCognome(){
        return cognome;
    }
    
    public int getCodice(){
        return codice;
    }
    
    public int getEtà(){
        return età;
    }
}

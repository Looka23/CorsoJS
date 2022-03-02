package contatto;
//luca pelliccioni
public class Contatto {
    private String nome;
    private String cognome;
    private String numeroT;
    
    public Contatto(String nome, String cognome, String numeroT){
        this.nome=nome;
        this.cognome=cognome;
        this.numeroT=numeroT;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCognome() {
        return this.cognome;
    }
    public String getNumero() {
        return this.numeroT;
    }
    @Override
    public String toString() {
        return this.nome+" "+this.cognome+" "+this.numeroT;
}
}

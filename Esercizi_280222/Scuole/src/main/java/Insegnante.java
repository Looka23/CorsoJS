
package Scuole;
public class Insegnante extends Persona {

    private int annoVincita;
    private scuole s;

    public Insegnante(int annoVincita, scuole s, String nome, String cognome) {
        super(nome, cognome);
        this.annoVincita = annoVincita;
        this.s = s;
    }

    public int getAnnoVincita() {
        return annoVincita;
    }

    public void setAnnoVincita(int annoVincita) {
        this.annoVincita = annoVincita;
    }

    public scuole getS() {
        return s;
    }

    public void setS(scuole s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Insegnante{" + "annoVincita=" + annoVincita + ", s=" + s + '}';
    }

}
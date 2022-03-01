
package Scuole;

public class Classe {
    private scuole s;
    private String nome;
    private Insegnante[] i;
    private int numAlunni;

    public Classe(scuole s, String nome, Insegnante[] i, int numAlunni) {
        this.s = s;
        this.nome = nome;
        this.i = i;
        this.numAlunni = numAlunni;
    }

    public scuole getS() {
        return s;
    }

    public void setS(scuole s) {
        this.s = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Insegnante[] getI() {
        return i;
    }

    public void setI(Insegnante[] i) {
        this.i = i;
    }

    public int getNumAlunni() {
        return numAlunni;
    }

    public void setNumAlunni(int numAlunni) {
        this.numAlunni = numAlunni;
    }

    @Override
    public String toString() {
        return "Classe{" + "s=" + s + ", nome=" + nome + ", i=" + i + ", numAlunni=" + numAlunni + '}';
    }
    
    
}
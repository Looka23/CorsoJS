package esamejava;
public class DocenteAssociato extends Docente {

    private int votoDiDottorato;
    private Contratto[] c;

    public DocenteAssociato(int votoDiDottorato, Contratto[] c, String nome, String cognome, int id, int eta) {
        super(nome, cognome, id, eta);
        this.votoDiDottorato = votoDiDottorato;
        this.c = c;
    }

    public int getVotoDiDottorato() {
        return votoDiDottorato;
    }

    public int getAnniContratti() {
        int anni = 0;
        for (int i = 0; i < c.length; i++) {
            anni += c[i].getDCL();
        }
        return anni;
    }

}
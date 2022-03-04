package esamejava;
public class UniversitàAssociati extends Università {
   
    private DocenteAssociato[] docentiAssociati;

    public UniversitàAssociati(DocenteAssociato[] docentiAssociati, Docente[] docenti) {
        super(docenti);
        this.docentiAssociati = docentiAssociati;
    }

    public DocenteAssociato bestRicercatore() {
        DocenteAssociato migliorDocente = null;
        int votoMassimo = 0;
        for (int i = 0; i < docentiAssociati.length; i++) {
            if (docentiAssociati[i].getVotoDiDottorato() > votoMassimo) {
                votoMassimo = docentiAssociati[i].getVotoDiDottorato();
                migliorDocente = docentiAssociati[i];
            } else if (docentiAssociati[i].getVotoDiDottorato() == votoMassimo) {
                if (docentiAssociati[i].getAnniContratti() > migliorDocente.getAnniContratti()) {
                    migliorDocente = docentiAssociati[i];
                } else if (docentiAssociati[i].getAnniContratti() == migliorDocente.getAnniContratti()) {
                    if (docentiAssociati[i].getEtà() < migliorDocente.getEtà()) {
                        migliorDocente = docentiAssociati[i];
                    }
                }
            }
        }
        return migliorDocente;
    }
}

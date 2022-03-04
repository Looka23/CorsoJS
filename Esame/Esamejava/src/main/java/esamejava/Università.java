package esamejava;
class Università {
    private Docente[] docenti;
    public Università(Docente[] d){
        docenti=new Docente[d.length];
        for(int i=0; i<d.length; i++)
           docenti[i]=new Docente(d[i]);
    }
    public int etàMinima(){
        int min=docenti[0].getEtà();
        for(int i=1; i<=docenti.length; i++)
            if (docenti[i].getEtà()<min)
                min=docenti[i].getEtà();
        return min;
    }
    
    public String[] trovaGiovani(){
        String[] risultato;
        int conta=0;
        for(int i=0; i<docenti.length; i++)
            if(docenti[i].getEtà()==etàMinima())
                conta++;
        risultato=new String[conta];
        conta=0;
        for(int i=0; i<docenti.length; i++)
            if(docenti[i].getEtà()==etàMinima()){
                risultato[i]=docenti[i].getCognome();
                conta++;
            }
        return risultato;
    }
}

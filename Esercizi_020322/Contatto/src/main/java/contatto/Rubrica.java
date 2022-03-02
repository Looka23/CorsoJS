package contatto;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Rubrica {
    private List <Contatto> contatti;
    public Rubrica(){
       this.contatti=new ArrayList<Contatto>();
}
    void aggiungiContatto(String nome, String cognome, String numeroT){
        this.contatti.add(new Contatto(nome, cognome, numeroT));
    }
    
    void rimuoviContatto(String nome, String cognome){
        boolean levato= false;
        Iterator<Contatto> pi = this.contatti.iterator();
        while(pi.hasNext() && !levato){
            Contatto b=pi.next();
            if(b.getNome().equals(nome) && b.getCognome().equals(cognome)){
                pi.remove();
                levato=true;
           }
        }
    }
    String cerca(String nome, String cognome){
        String numeroT= null;
        Iterator<Contatto> pi = this.contatti.iterator();
        while(pi.hasNext() && numeroT==null){
            Contatto b=pi.next();
            if(b.getNome().equals(nome)&&b.getCognome().equals(cognome)){
                numeroT=b.getNumero();
           }   
        }
        return numeroT;
    }
    
    
    @Override
    public String toString(){
        String yo = "Rubrica";
        yo += "\n";
        Iterator<Contatto> pi = this.contatti.iterator();
        while(pi.hasNext()){
            Contatto b=pi.next();
            yo += b.toString()+"\n";
        }
        return yo;
            
    }
}

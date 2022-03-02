package Articolo;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Catalogo<E extends Articolo> {
    private  List<E> catalogo;
     public Catalogo(){
       this.catalogo=new ArrayList<E>();
}
     void aggiungiArticolo(E arti){
         this.catalogo.add(arti);
     }
     
         List<E> getArticoliSP(double prezzo){
            List<E> articoli=new ArrayList<E>();
            Iterator<E> paua = this.catalogo.iterator();
            while(paua.hasNext()){
               E piu = paua.next();
               if(piu.getPrezzo()<prezzo){
               articoli.add(piu);
                     }
                  }
         return articoli;
    }
         
    @Override
    public String toString(){
        String yo = "Catalogo";
        yo += "\n";
        Iterator<E> paua = this.catalogo.iterator();
        while(paua.hasNext()){
            E b = paua.next();
            yo += b.toString()+"\n";
        }
        return yo;
            
    }
}
        


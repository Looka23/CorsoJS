package Articolo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProvaMobile {
    public static <T extends Mobile> List<T> scegliMobile(Catalogo <T> catalogo, double prezzo, double lunghezza, double altezza, double profondità){
        List<T> selezionati = new ArrayList<T>();
        List<T> selezionatiPP=catalogo.getArticoliSP(prezzo);
        Iterator<T> kek = selezionatiPP.iterator();
        while(kek.hasNext()){
            T pino=kek.next();
            if(pino.getLunghezza()<lunghezza && pino.getAltezza()<altezza && pino.getProfondità()<profondità){
                selezionati.add(pino);
                                }
                   }
        return selezionati;
      }
  }


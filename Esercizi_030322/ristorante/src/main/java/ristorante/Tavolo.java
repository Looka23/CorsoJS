package ristorante;
//import java.util.Scanner;
import java.util.ArrayList;
public class Tavolo {
    private int id, nCoperti, conto;
    private ArrayList lista;
    Tavolo(int i, int nCop){
        id=i; nCoperti=nCop; conto=0;
        ArrayList list=new ArrayList(0);
    }
    public void inserisci(ElementoG e){
        if(e.getPrezzo()!=0)
            lista.add(e);
    }
    
    private int calcolaConto(){
    int tot=0;
    for(int i=0; i<lista.size(); i++)
    tot+=((ElementoG)lista.get(i)).getPrezzo();
    return tot;
    }
    
    public int getId(){
        return id;
    }
    public int getNcop(){
        return nCoperti;
    }
    public int getConto(){
        conto=calcolaConto();
        return conto;
    }
    public String getLista(){
        String s="\n";
        for(int i=0; i<lista.size();i++){
            s+=((ElementoG)lista.get(i)).getNome();
            
        }
        return s;
    }
    @Override
    public String toString(){
        return getId()+":"+getNcop()+":"+getLista()+"\nconto:"+getConto();
    }
}

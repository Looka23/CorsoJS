package ristorante;
public class ElementoG {
    private String nome;
    private int prezzo;
    ElementoG(String id, int prz){
        nome=id;
        prezzo=prz;
    }
    public String getNome(){
        return nome;
    }
    public int getPrezzo(){
        return prezzo;
    }
}

package ristorante;
//import java.util.Scanner;
//import java.util.ArrayList;
public class Menu {
   private ElementoG piatti[];
   private ElementoG bevande[];
   Menu(){
       ElementoG p1= new ElementoG("Pesce", 7);
       ElementoG p2= new ElementoG("Carne", 8);
       ElementoG p3= new ElementoG("Spaghetti", 5);
       ElementoG p4= new ElementoG("Insalata", 3);
       ElementoG p5= new ElementoG("Pizza", 6);
       ElementoG p[]={p1,p2,p3,p4,p5};
       piatti=p;
       ElementoG b1= new ElementoG("Acqua", 1);
       ElementoG b2= new ElementoG("Vino", 3);
       ElementoG b3= new ElementoG("Birra", 2);
       ElementoG b[]={b1,b2,b3};
       bevande=b;
   }
   public ElementoG getPiatti(int w){
       return piatti[w];
   }
   public ElementoG getBevande(int w){
       return bevande[w];
   }
   public void MostraPiatti(){
    for(int i=0; i<piatti.length;i++)
        System.out.println(i+". "+piatti[i].getNome());
}
   public void MostraBevande(){
    for(int i=0; i<bevande.length;i++)
        System.out.println(i+". "+bevande[i].getNome());
}
}

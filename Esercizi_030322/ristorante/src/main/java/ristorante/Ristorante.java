package ristorante;
import java.util.Scanner;                   //LOGICAMENTE GIUSTO MA DA ERRORE;
import java.util.ArrayList;

public class Ristorante {
    public static void main(String args[]){
        int w, pre=0;
        char ch;
        String nome="";
        Tavolo t1=new Tavolo(1,3);
        Menu menu=new Menu();
        do{
            System.out.println("Bevanda, Piatto o Uscita");  
            System.out.println("Scegliere b/p/x");  
            Scanner pino=new Scanner(System.in);
            ch=pino.nextLine().charAt(0);
            if(ch=='p') menu.MostraPiatti();
            else if(ch=='b') menu.MostraBevande();
            else break;
            System.out.println("inserisci valore: ");
            w=pino.nextInt();
            if(ch=='p' || ch=='b'){
                if(ch=='p'){
                    nome=menu.getPiatti(w).getNome();
                    pre=menu.getPiatti(w).getPrezzo();
                }
                else{
                    nome=menu.getBevande(w).getNome();
                    pre=menu.getBevande(w).getPrezzo();
                }
                ElementoG e=new ElementoG(nome,pre);
                t1.inserisci(e);
            }
        }
        while(ch!='x');
        System.out.println(t1);
    }
}

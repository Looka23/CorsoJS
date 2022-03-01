//import java.util.Scanner; 
import javax.swing.*;  
//import javax.swing.event.*;

public class automobile {
    private String modello;
    public String colore;
    private String targa;
    public String nome, cognome, residenza;
    public String NC,NS, ferrari;

    
void verniciatura(){
    //Scanner yo = new Scanner(System.in); 
    JFrame pino;  
    pino=new JFrame(); 
    String t3="Nuovo colore macchina!";
    automobile mach= new automobile (); 
    NC=JOptionPane.showInputDialog(pino, t3, "Inserisci il nuovo colore");
    //NC = yo.nextLine(); 
    mach.setColore(NC);
    String w = mach.getColore();
    //System.out.println("Il colore precedente "+mach.getColore()+ " e' stato cambiato in "+NC);
    System.out.println("Il colore dell'automobile e' "+w);
}

void Piu(){
    //Scanner yo = new Scanner(System.in); 
    JFrame pino;  
    pino=new JFrame();
    String t1="Nuova targa ferrari!";
    NS=JOptionPane.showInputDialog(pino, t1, "Inserisci la targa");
    automobile mach= new automobile ();  
    //NS = yo.nextLine(); 
    //mach.setColore(NC);
    mach.setFerrari("Ferrari360GT"); 
    String l = mach.getFerrari();
    mach.setColore("rossa");
    String z = mach.getColore();
    System.out.println("La nuova macchina e' "+l+" , il colore e' "+z+" e la targa e' "+NS);
    
}

 void Persona() {
    JFrame pino;  
    /*Scanner yo = new Scanner(System.in); 
    automobile mach= new automobile ();*/
    pino=new JFrame();  
    String t2="Inserisci i dati della persona";
    nome=JOptionPane.showInputDialog(pino, t2, "Inserisci il nome");
    //mach.nome = yo.nextLine(); 
    cognome=JOptionPane.showInputDialog(pino,"Inserisci il cognome");
    //mach.cognome = yo.nextLine(); 
    residenza=JOptionPane.showInputDialog(pino,"Inserisci la residenza");
    //mach.residenza = yo.nextLine(); 
    
    System.out.println("Il nome e cognome del proprietario e' " +nome+ " " +cognome+ " e abita a " +residenza);
    
    
}
 
  public void setFerrari(String f) { 
        ferrari=f; 
    }

    
    public void setModello(String m) { 
        modello=m; 
    }
    
     public void setTarga(String t) { 
         targa=t; 
     }
    
      public void setColore(String c) { 
        colore=c; 
    }
      
 public String getModello(){ 
         return modello;
     
 }
 
    public String getTarga(){ 
         return targa;
     
 }
    
  public String getColore(){ 
         return colore;
     
 }   
    public String getFerrari() { 
       return ferrari;
       
    }
    

public static void main(String[] args) {
    //Scanner yo = new Scanner(System.in);
    automobile mach= new automobile ();
    mach.setModello("Pegeout");
    mach.setTarga("DV545OP"); 
    mach.setColore("nera"); 
    String p = mach.getModello();
    String q = mach.getTarga();
    //System.out.println("Inserisci il colore: ");
    //mach.colore = yo.nextLine(); 
    //System.out.println("Il modello dell'automobile e' "+mach.modello);
    mach.Persona();
    mach.verniciatura();
    System.out.println("Il modello dell'automobile e' "+p);
    System.out.println("La targa dell'automobile e' "+q);
    mach.Piu();
    
    

}
}
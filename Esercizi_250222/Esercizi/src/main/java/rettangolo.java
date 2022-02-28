import java.util.Scanner; 
//import java.util.*;

public class rettangolo {
       int lunghezza,altezza;
    public static void main(String[] args) {
        Scanner ping = new Scanner(System.in); 
        rettangolo rett= new rettangolo();
        System.out.println("Inserisci l'altezza: ");
        rett.altezza = ping.nextInt(); 
        System.out.println("Inserisci la lunghezza: ");
        rett.lunghezza = ping.nextInt(); 
        rett.Perimetro();
        rett.Area();
    }
    void Perimetro(){
          int perimetro;
          perimetro=2*(this.lunghezza+this.altezza);
          System.out.println("Il perimetro e': " +perimetro);
}
    
    void Area(){
          int area;
          area=(this.lunghezza*this.altezza);
          System.out.println("Il perimetro e': " +area);
}
}

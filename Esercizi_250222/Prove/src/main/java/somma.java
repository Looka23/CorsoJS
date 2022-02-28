import java.util.Scanner; 


class somma {
  public static void main(String[] args) {
    double x, y, sum;
    Scanner zach = new Scanner(System.in); 
    System.out.println("Inserisci un numero:");
    x = zach.nextDouble(); 

    System.out.println("Inserisci un altro numero:");
    y = zach.nextDouble(); 

    sum = x + y; 
    System.out.println("La somma e' : " + sum); 
    System.exit(0);
  }
} 
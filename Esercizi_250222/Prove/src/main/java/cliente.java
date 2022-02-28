import java.util.Scanner; 

public class cliente {
  String Nome;
  String Residenza;

  public cliente(String Residence, String name) {
    Nome = Residence;
    Residenza = name;
  }

  public static void main(String[] args) {
    cliente pino = new cliente("Luca", "Roma");
    System.out.println(pino.Residenza + " " + pino.Nome);
  }
}

import java.util.Scanner; 
public class dispari {
    String x,NS;
     public static void main(String[] args) {
         Scanner luca = new Scanner(System.in); 
         dispari str= new dispari();
         System.out.println("Inserisci una stringa: ");        
         str.x = luca.nextLine(); 
         str.ciao();
     }
     void ciao(){
             NS="";
             char[] ch = new char[this.x.length()];
             for (int i = 0; i < this.x.length(); i++) {
                ch[i] = this.x.charAt(i);
                if(i%2==0){
                   //System.out.println(ch[i]); 
                   char v=Character.toUpperCase(ch[i]);
                   NS=NS+v;
                }
                else {
                    NS=NS+ch[i];
                }
         }
             System.out.println("La stringa e': "+NS);   
     }
}

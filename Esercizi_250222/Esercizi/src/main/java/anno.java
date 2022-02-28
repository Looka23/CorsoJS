import java.util.Scanner; 
public class anno {
    int anno;
    public static void main(String[] args) {
        Scanner pang = new Scanner(System.in); 
        anno year= new anno();
        System.out.println("Inserisci un numero: ");
        year.anno = pang.nextInt(); 
        year.porto();
    }
    void porto(){
        int bis=this.anno;
        if(bis%4==0){
            if(bis%100!=0 || bis%400==0){
            System.out.println("L'anno " +bis+" e' bisestile");
        }
        else{
            System.out.println("L'anno " +bis+" non e' bisestile");
            }
        }
        else{
            System.out.println("L'anno " +bis+" non e' bisestile");
            }
}
}
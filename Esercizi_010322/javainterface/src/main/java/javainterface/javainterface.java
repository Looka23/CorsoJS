package javainterface;
public class javainterface {
    
    class liquidi{
    public static void main(String[] args) { //errori nella definizione di l1,l2,b1,b2 //logicamente giusto
     claudio l1,l2,b1,b2;
     l1 = new lucio(1,"birra",1);
     l2 = new lucio(2,"the",2);
     b1 = new barbara(3,"the",10);
     b2 = new barbara(4,"the",15);
     claudio N[]= new claudio[5];
     N[0]=l1; N[1]=l2; N[2]=b1; N[3]=b2;
     N[4]=new barbara(5,"birra",5);
     System.out.println("prima del filtro");
     for(int i=0; i<N.length; i++){
         System.out.println(N[i]);
     }
     System.out.println("è l1 maggiore di l2?" +l1.confronta(l2));
     System.out.println("è b1 maggiore di b2?" +l1.confronta(b2));
     ugo u= new ugo();
     N=u.filtra(N, l2);
      System.out.println("dopo il filtra");
      for(int i=0; i<N.length; i++){
         System.out.println(N[i]);
     }
             }
}
    
    interface CMP {public int confronta(claudio x);}
    
    abstract class claudio implements CMP{ //contenitori
        protected int ID;
        abstract String getn();
        claudio(int codice){
            ID=codice;
        }
       
        int getID() {
            return ID;
        }

        //@Override
        public String toString() {
        String s="id:";
        s+=ID;
        return s;
    }

}
    class lucio extends claudio{ //lattine
        private String nome;
        private int quantità;
        lucio(int cod, String s, int q){
            super(cod);
            quantità=q;
            nome=s;}
            String getn(){
               return nome;
        }
        @Override
        public String toString() {
        String s;
        s=super.toString()+"nome: "+nome+ " qua: "+quantità;
        return s;
        }
        @Override
        public int confronta (claudio x){
            if (x instanceof lucio){
                return (this.quantità-((lucio)x).quantità);
            }
            else return -1;
        }
    }
        
        class barbara extends claudio{ //bidoni
        private String nome;
        private int quantità;
        barbara(int cod, String s, int q){
            super(cod);
            quantità=q;
            nome=s;}
            String getn(){
               return nome;
        }
        @Override
        public String toString() {
        String s;
        s=super.toString()+"nome: "+nome+ " quo: "+quantità;
        return s;
        }
        @Override
        public int confronta (claudio x){
            if (x instanceof barbara){
                return (this.quantità-((barbara)x).quantità);
            }
            else return -1;
        }
    }
        
        class ugo{ //filtra
            claudio[] filtra(claudio[] N, claudio c){
                int w=0;
                for(int i=0; i<N.length; i++){
                   if((N[i].getn()).equals(c.getn())) {
                    N[i]=null;
                    w++;
                   }
                }
                int mn=N.length-w;
                w=0;
                claudio[] vettore= new claudio[mn];
                for(int i=0; i<N.length; i++)
                   if(N[i]!=null){
                       vettore[w]=N[i];
                       w++;
                   }
            return vettore;
        }
        
        }  
        
    }
    
        //DA FINIRE


   

        
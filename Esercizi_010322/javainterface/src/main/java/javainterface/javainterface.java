package javainterface;
public class javainterface {
    
    class liquidi{
    public static void main(String[] args) { //interface da finire
     claudio L1;
     claudio L2;
     claudio B1;
     claudio B2;
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

        @Override
        public String toString() {
        String s="id:";
        s+=ID;
        return s;
    }

}
    class lucio extends claudio{ //lattine
        private final String nome;
        private final int quantità;
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
        s=super.toString()+"nome: "+nome+ " quo: "+quantità;
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


   

        
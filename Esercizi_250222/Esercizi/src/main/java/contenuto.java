class contenuto {
  public static void main(String[] args) {
    String testo = "Forza Roma";
    String str1 = "Roma";
    String str2 = "Lazie";

    // check if name is present in txt
    // using contains()
    boolean risultato = testo.contains(str1);
    if(risultato) {
      System.out.println(str1 + " e' presente nella stringa iniziale.");
    }
    else {
      System.out.println(str1 + " non e' presente nella stringa iniziale.");
    }

    risultato = testo.contains(str2);
    if(risultato) {
      System.out.println(str2 + " e' presente nella stringa iniziale.");
    }
    else {
      System.out.println(str2 + " non e' presente nella stringa iniziale.");
    }
  }
}
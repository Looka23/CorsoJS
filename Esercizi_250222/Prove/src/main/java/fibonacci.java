class fibonacci {
  public static void main(String[] args) {

    int n = 8, primoTermine = 0, secondoTermine=  1;
    System.out.println("La serie di Fibonacci fino al termine: " + n);

    for (int i = 1; i <= n; ++i) {
      System.out.print(primoTermine + ", ");

      int nextTermine = primoTermine + secondoTermine;
      primoTermine = secondoTermine;
      secondoTermine = nextTermine;
    }
  }
}
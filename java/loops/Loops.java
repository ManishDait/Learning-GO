public class Loops {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    System.out.println("");

    int j = 0;
    do {
      System.out.println(j+1);
    } while(j > 0);

    int k = 5;
    while (k >= 0) {
      System.out.println(k--);
    }
  }
}

public class Variables {
  public static void main(String[] args) {
    byte _8bitNum = 127;
    short _16bitNum = 32767;
    int _32bitNum = 2147483647;
    long _64bitNum = 100000000000L;

    System.out.printf("%d %d %d %d\n", _8bitNum, _16bitNum, _32bitNum, _64bitNum);

    char _charA = 'A';
    char _charB = 65;

    System.out.printf("%c %c%n", _charA, _charB);

    float $decimalNum = 3.44444444444F;
    double $doubleDecNum = 45.34343434343;

    System.out.printf("%f %f%n", $decimalNum, $doubleDecNum);

    boolean isTrue = true;
    System.out.printf("%b%n", isTrue);

    String str = "Some String";

    System.out.printf("%s%n", str);
  }
}


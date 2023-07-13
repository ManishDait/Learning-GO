public class IfElse {
  public static void main(String[] args) {
    int a = 20;
    int b = 30;
    int c = 10;

    if(a > b) {
      System.out.println("A is greater");
    }
    System.out.println("B is greater");

    /*
     if (a > c) {
       System.out.println("A is greater");
       return;
     }
     System.out.println("C is greater");
     System.out.println("If <if> condition true and has return at end the below statement not execute.");
    */

    // If Else
    if (a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }

    // If Else-If If
    if (a == 20) {
      System.out.println(a);
    } else if(a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }

    // Nested If Else
    if (a > b) {
      if (a > c) {
        System.out.println(a);
      } else {
        System.out.println(c);
      }
    } else {
      if (b > c) {
        System.out.println(b);
      } else {
        System.out.println(c);
      }
    }

   // Ternary Operator
   int temp = a > b ? a : b;
   System.out.println(temp > c ? temp : c);
  }
}

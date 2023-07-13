public class Switch {
  public static void main(String[] args) {
    int option = 2;

    switch (option) {
      case 1:
        System.out.println("OPtion 1");
        break;
      // if break is not written at end it will execute all the remaining cases after valid one.

      case 2:
        System.out.println("Option 2");
        break;

      case 3:
        System.out.println("OPtion 3");
        break;

      default:
        System.out.println("Invalid Value");
    }

    // Simplified Syntax
    switch (option) {
      case 1 -> System.out.println("Option 1");
      case 2 -> System.out.println("Option 2");
      case 3 -> System.out.println("Option 3");
      default -> System.out.println("Invalid Value");
    }

    // Nested Switch
    int year = 2;
    char c = 'E';

    switch (c) {
      case 'E':
        System.out.println("Electrical");
        switch (year) {
          case 1:
            System.out.println("1nd Year");
            break;
          case 2:
            System.out.println("2nd Year");
            break;
          case 3:
            System.out.println("3rd Year");
            break;
          case 4:
            System.out.println("4th Year");
            break;
          default:
            System.out.println("Invalid");
        }
        break;

      case 'C':
        System.out.println("Computer");
        switch (year) {
          case 1 ->  System.out.println("1nd Year");
          case 2 ->  System.out.println("2nd Year");
          case 3 ->  System.out.println("3rd Year");
          case 4 ->  System.out.println("4th Year");
          default ->  System.out.println("Invalid");
        }
        break;

      default:

        System.out.println("Invalid");

    }
  }
}

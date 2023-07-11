class FormatedText{
  public static void main(String[] args){
    String name = "Jhon Doe";
    int age = 34;

    System.out.println("Age of " + name + " is " + age);
    /*
        printf() help to easily format the string.
        %s -> String
        %d -> int
        %f -> float
        %c -> char
        %b -> boolean
     */

    System.out.printf("Age of %s is %d%n", name, age);
  }
}

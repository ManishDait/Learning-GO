package main

import "fmt"

func main() {
  fmt.Println("Learning GO..");
  fmt.Println("This will work");
  // fmt.Println(This will not work);

  // Print() does not insert a new line at the end of the output.
  fmt.Print("Hi");
  fmt.Print(" What are you doing?")

  fmt.Print();
  fmt.Println();
}

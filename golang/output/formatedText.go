package main

import "fmt"

func main() {
  var name string = "Jhon Doe"
  var age int = 34

  fmt.Println("Age of", name, "is", age)
 //  fmt.Println("Age of " + name + " is " + age) ->  it will work if age is of type string.

  fmt.Printf("Age of %s is %d\n", name, age)
}

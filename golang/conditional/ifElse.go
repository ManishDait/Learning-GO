package main

import "fmt"

func main() {
  var a int = 30
  var b int = 45
  var c int = 23

  if a > b {
    fmt.Println("A", a)
  }
  fmt.Println("B", b)
  fmt.Println("C", c)

  /*
    due to  <return> the blocks after if doesnot work if condition is true;
    if a > c {
      fmt.Println("A", a)
      return
    }
    fmt.Println("B", b);
    fmt.Println("C", c);
  */

  // If Else
  if a > b {
    fmt.Println(a);
  } else {
    fmt.Println(b, c)
  }
  fmt.Println("Some code")

  // If Else-If Else
  if a > b {
    fmt.Println(a)
  } else if b > c {
    fmt.Println(b)
  } else {
    fmt.Println(c);
  }

  // Nested If Else
  if a > b {
   if a > c {
     fmt.Println(a)
   } else {
     fmt.Println(c)
   }
  } else {
    if b > c {
      fmt.Println(b)
    } else {
      fmt.Println(c)
    }
  }

  /*
    Absent in Go
    Do not work
    Ternary Oprater
    t := a > b ? a : b
    fmt.Println(t > c ? t : c)
  */
}

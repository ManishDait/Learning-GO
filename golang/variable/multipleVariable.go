package main

import "fmt"

func main() {
  var a, b, c int = 2, 3, 4

  fmt.Printf("%d %d %d\n", a, b, c)

  var x, y = 34, true
  fmt.Printf("%d %t\n", x, y)

  p, q, r := 12, 34.5, "Hello"
  fmt.Println(p)
  fmt.Println(q)
  fmt.Println(r)
}

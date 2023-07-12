package main

import "fmt"

func main() {
  var _8bitNum int8 = 127
  var _16bitNum int16 = 32767
  var _32bitNum int32 = 2147483647
  var _64bitNum int64 = 10000000000000

  fmt.Printf("%d %d %d %d\n", _8bitNum, _16bitNum, _32bitNum, _64bitNum)

  var _charA rune = 'A'

  fmt.Printf("%c \n", _charA)

  var isTrue bool = true
  fmt.Println(isTrue)

  var name string = "Jhon"
  name = "Kate"
  fmt.Println(name)

  var infer = "Hello"
  fmt.Println(infer)

  x := 23
  fmt.Println(x)

}

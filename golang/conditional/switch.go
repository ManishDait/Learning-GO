package main

import "fmt"

func main() {
  a := 2

  switch a {
    case 1:
      fmt.Println("Option 1")
      break
    case 2:
      fmt.Println("Option 2")
      break
    case 3:
      fmt.Println("Option 3")
      break
    default:
      fmt.Println("Invalid Value")
  }

  // Nested Switch
  b := 'E'
  y := 1

  switch b {
    case 'E':
      fmt.Println("Electricl")
      switch y {
        case 1:
          fmt.Println("1st Year")
          break
        case 2:
          fmt.Println("2nd Year")
          break
        case 3:
          fmt.Println("3rd Year")
          break
        case 4:
          fmt.Println("4th Year")
          break
        default:
          fmt.Println("Invalid Year")
      }
      break

    case 'C':
      fmt.Println("Computer")
      switch y {
        case 1:
          fmt.Println("1st Year")
          break
        case 2:
          fmt.Println("2nd Year")
          break
        case 3:
          fmt.Println("3rd Year")
          break
        case 4:
          fmt.Println("4th Year")
          break
        default:
          fmt.Println("Invalid Year")
      }
      break

    default:
      fmt.Println("Invalid Branch")
  }
}

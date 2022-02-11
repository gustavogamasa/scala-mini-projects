package scalaStuff

object Stuff{


    // Switch on steroids

  val aNumber = 44
  val ordinal = aNumber match{
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => aNumber + "th"
  }

  // Case class deconstruction

  case class Person(name: String, age: Int)
  val bob = Person("Bob", 34)

  val BobGreeting = bob match{
    case Person(n, a) => s"Hi, my name is $n and I am $a years old"
  }


  // List extractors

  val numberList = List(1,2,3,42)

  val mustHaveThree = numberList match{
    case List(_, _, 3, somethingElse) => s"List has 3rd element as 3, so the 4th element is $somethingElse"
  }

  // List Haskell-like prepending

  val startsWithOne = numberList match{
    case 1 :: tail => s"list starts with one, tail is $tail"

  }
  

def main(args: Array[String]){
} // main

} //object Stuff
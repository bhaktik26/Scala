package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x : Int = 33
  println(x)

  //x = 2
  // VALS ARE IMMUTABLE, CANT REASSIGN VALUE

  // compiler can infer types

  val aString : String = "hello"

  // need to write L at end to indicate integer is long
  val aLong: Long = 13322535747L
  val aFloat: Float = 2.0F
  val aDouble: Double = 3.14

  // variables, they can be reassigned
  var aVariable : Int = 4
  aVariable = 8 // side effects

}

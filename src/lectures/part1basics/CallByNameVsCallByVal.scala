package lectures.part1basics

object CallByNameVsCallByVal extends App {
  def calledByValue(n: Long): Unit = {
    println("called by value " + n)
    println("called by value " + n)
  }

  // => delays the evaluation of the argument passed
  def calledByName(n: => Long): Unit = {
    // value is evaluated each time in the function
    println("called by name " + n)
    println("called by name " + n)
  }

  // this computes the value and passes it
  calledByValue(System.nanoTime())

  // this passes the argument as it is
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  // y is never evaluated
  def printFirst(x: Int, y: => Int) = println(x)

  // gives stack overflow error
  // printFirst(infinite(), 34)

  // this works as by name delays evaluation
  printFirst(34, infinite())


}

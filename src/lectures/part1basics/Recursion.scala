package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int = {
    if(n<=1) 1
    else {
      println("Computing factorial of " + n + " and I need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Factorial of " + n + " is " + result)
      result
    }
  }

  // if n is large we will get stack overflow error
  println(factorial(10))

  def anotherFactorial(n: BigInt): BigInt = {
    @tailrec
    def factHelper(t: BigInt, accumulator: BigInt): BigInt =
      if(t<=1) accumulator
      else factHelper(t-1, t*accumulator) // tail recursion - use recursive call as the last expression, in same stack frame value is replaced
    // for last expression stack frame is preserved
    factHelper(n,1)
  }

  println(anotherFactorial(5000))
  // WHEN U NEED LOOPS USE TAIL RECURSION

  // Concatenate a string n times using recursion
  @tailrec
  def concatString(aString: String, n: Int, accumulator: String): String =
    if(n<=0) accumulator
    else concatString(aString, n-1, aString+accumulator)

  println(concatString("hi",3,""))

  // is prime no tail recursive

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isPrimeStill: Boolean): Boolean =
      if(!isPrimeStill) false
      else if(t<=1) true
      else isPrimeTailRec(t-1, n % t != 0 && isPrimeStill)
    isPrimeTailRec(n/2, true)
  }

  println(isPrime(2003))
  println(isPrime(25))

  // fibonacci
  def fibonacci(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i>=n) last
      else fiboTailRec(i+1,last + nextToLast,last)
    if(n<=2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacci(6))

  def myFibonacci(n: Int): Int = {
    def myFiboTailRec(i: Int, a: Int, b: Int): Int =
      if(i<=2) b
      else myFiboTailRec(i-1, b, a + b)
      myFiboTailRec(n,1,1)
  }

  println(myFibonacci(8))


}

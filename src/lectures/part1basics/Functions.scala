package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hi", 2))

  def aParameterLessFn(): Int = 42
  println(aParameterLessFn())
  println(aParameterLessFn) // warning

  def aRepeatedFunction(word: String, no: Int): String = {
    if(no == 1) word
    else word + aRepeatedFunction(word, no - 1)
  }

  println(aRepeatedFunction("hi", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION
  // recursive functions need type, types of other funcs can be inferred by the compiler

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n - 1)
  }

  // write a function which accepts name and age and prints a line
  def printNameAge(name: String, age: Int): Unit = println("Hi, my name is" + name + " and I am " + age + " years old")

  println(printNameAge("bk", 20))

  // Factorial function
  def factorial(n: Int): Int = {
    if(n==1 || n==2) n
    else n * factorial(n-1)
  }

  println(factorial(5))

  // fibonacci function - f(1) = 1, f(2) = 2, f(n) = f(n-1) + f(n-2)
  def fibonacci(n: Int): Int = {
    if(n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  println(fibonacci(8))

  // Tests if a number is prime
  def checkPrime(n: Int): Boolean = {
    def isPrimeUntil(t:Int): Boolean = {
      if(t<=1) true
      else n%t !=0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }

  println(checkPrime(37))

}

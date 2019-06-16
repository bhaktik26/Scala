package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"
  // string methods are same as java
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.length)

  // Scala's utilities
  val aNumberString = "32"
  val aNumber = aNumberString.toInt

  // prepending and appending operators
  println('a' +: aNumberString :+ 'z')

  println(str.reverse)

  println(str.take(2))

  // Scala specify String interpolators

  // S-interpolators
  val name = "David"
  val age = 20
  val greeting = s"Hello, I am $name and I am $age years old."
  val anotherGreeting = s"Hello, I am $name and I will be turning ${age+1} years old."
  println(anotherGreeting)

  // F interpolators - formatted string
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per min"
  println(myth)

  // raw interpolator - use for escape characters
  println(raw"This is a \n newline")

  val escaped = "This is a \n newline"
  println(raw"$escaped")



}

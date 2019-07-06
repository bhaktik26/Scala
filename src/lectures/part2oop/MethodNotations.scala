package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def +(person: Person): String = s"${this.name} hangs out with ${person.name}"

    def unary_! : String = s"$name, what the heck?!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    def +(nickname: String): String = s"${this.name}" + " (" + nickname + ")"

    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def learns(topic: String): String = s"$name learns $topic"

    def learnsScala(): String = this learns "Scala"

    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation or operator notation(syntactic sugar), for methods with single argument

  // "operators" in scala
  val tom = new Person("Tom", "Fight club")
  println(mary + tom)

  // we can name methods with names as +, % & or whatever, complete freedom for method names

  println(1 + 2)
  println(1.+(2))
  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?

  // prefix notation
  val x = -1 // both r equivalent
  val y = -1.unary_-
  // unary_prefix only works with + - ~ !

  println(!mary)
  println(mary.unary_!) // both r equivalent

  // postfix notation( methods that do not have any params)
  println(mary.isAlive)
  //println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) // equivalent, object called like method so compiler searches for apply method

  /*
   overload the + operator
   mary + "the rockstar" => new person "Mary (the rockstar)"
   */
  println(mary + "the rockstar")

  /*
  add an age to the Person class
  add a unary + operator => new person with the age + 1
  +mary => mary with the age incremented
   */
  println((+mary).age)

  /*
  Add a learns method in Person class => Mary learns <param>
  Add a learnsScala method, call learns method with Scala
  use it in postfix notation
   */
  println(mary.learnsScala())
  println(mary learnsScala)

  /*
  overload the apply method
  mary.apply(2) => mary watched inception 2 times
   */
  println(mary(2))

}

package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangoutWith(person: Person): String = s"${this.name} hangs out with ${person.name}"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation or operator notation, for methods with single argument

  // "operators" in scala
  val tom = new Person("Tom", "Fight club")
  println(mary hangoutWith tom)

  // we can name methods with names as +, % & or whatever, complete freedom for method names

  println(1 + 2)
  println(1.+(2))

}

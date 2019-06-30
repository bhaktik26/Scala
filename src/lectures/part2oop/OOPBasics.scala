package lectures.part2oop

object OOPBasics extends App {
  val person = new Person("John", 26)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
}

// constructor, we can specify a default value
class Person(name: String, val age: Int = 0) {
  // field
  val x = 2
  // expression
  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says, Hi $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)

  // an auxiliary constructor can call other primary or secondary constructor, used for default params
  def this() = this("abc")

}

// class parameters are NOT FIELDS

/*
Novel and a Writer
Writer - first name, surname and year
 - method fullname

 Novel - name, year of release, author
  - authorAge
  - isWrittenBy(author)
  - copy(new year of release) - new instance of Novel
 */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName(): String = firstName + surname
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge(): Int = yearOfRelease - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
}
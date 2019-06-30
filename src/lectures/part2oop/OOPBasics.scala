package lectures.part2oop

object OOPBasics extends App {
  val person = new Person("John", 26)
  println(person.age)
  println(person.x)
  person.greet("Daniel")

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  val imposter = new Writer("Charles", "Dickens", 1812)
  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))
  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
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
  def fullName(): String = firstName + " " + surname
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge(): Int = yearOfRelease - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
}

/*
Counter class
 - receives an int value
 - method current count
 - method to increment/decrement => new Counter
 - overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {
  def inc = new Counter(count + 1) // immutability
  def dec = new Counter(count - 1)

  //  def inc(amount: Int) = new Counter(count + amount)
  //  def dec(amount: Int) = new Counter(count - amount)
  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)
}
package lectures.part2oop

object CaseClasses extends App {
  case class Person(name: String, age: Int)
  // 1. class params are fields
  val jim = new Person("jim", 34)
  println(jim.name)

  // 2. sensible toString
  // println(instance) = println(instance.toString) // syntactic sugar
  println(jim)
  println(jim.toString)

  // 3. equals and hashcode implemented out of the box
  val jim2 = new Person("jim", 34)
  println(jim == jim2)
}

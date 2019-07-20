package lectures.part2oop

object Objects {

  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY ("static")
  // objects offer something similar
  // objects can have vals, vars or method defs, but no params
  object Person { // type + its only instance
    // static or class level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(name: String) {
    // instance-level functionality
  }

  // COMPANIONS

  // Scala applications = Scala object with
  // def main(args: Array[String]): Unit

  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    // Scala object = singleton instance
    val mary = Person
    val john = Person
    println(mary == john)

    val person1 = new Person("Person1")
    val person2 = new Person("Person2")
    println(person1 == person2)

    val bobbie = Person(person1, person2)
  }

}

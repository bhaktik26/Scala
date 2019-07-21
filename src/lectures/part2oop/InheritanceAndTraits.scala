package lectures.part2oop

object InheritanceAndTraits extends App {

  // single class inheritance
  class Animal {
    val creatureType = "wild"

    def eat = println("nomnom")
  }

  class Cat extends Animal {
    override def eat = {
      super.eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.eat

  // constructors
  class Person(name: String, age: Int) {
    // auxiliary constructor
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType = "domestic"
    override def eat: Unit = println("crunch,crunch")
  }

  val dog = new Dog("domestic")
  dog.eat
  println(dog.creatureType)

  // type substitution - Polymorphism
  val unknownAnimal = new Dog("K9")
  unknownAnimal.eat

  // overloading vs overriding
  // super
  // preventing overrides - final
  // 1 - use final on members
  // 2 - use final on class (prevent class from being extended)
  // 3 - seal the class (extend classes in only THIS FILE, prevent extension from other files) -> sealed keyword
}

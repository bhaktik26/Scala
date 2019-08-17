package lectures.part2oop

object Generics extends App {

  // generic class
  class MyList[A] {
    //use the type A
  }

  class MyMap[Key, Value] {
  }

  val listOfStrings = new MyList[String]
  val listOfIntegers = new MyList[Int]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes, List[Cat] extends List[Animal] = covariance
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog)

  // 2. no, invariance
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! Contravariance
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]
}

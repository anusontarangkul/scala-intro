package playground

object Playground extends App {

  // scala does not have class-level functionality
  object Person { // type and only instance
    // "static"/"class" - level functionaltiy
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
//    def apply(mother: Person, father: Person): Person = new Person ("Bobbie")
  }

  class Person {
    //  instance-level functionality
  }

  // companions (same object and class in same scope)

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = singleton instance
  val mary = Person
  val john = Person
  println(mary == john)

//  val bobbie = Person(mary, john)
}

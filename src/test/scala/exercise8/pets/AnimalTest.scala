package exercise8.pets

import org.scalatest.FunSuite

class AnimalTest extends FunSuite {

  test("dog") {
    val animal = new Dog()

    assert("Woof!" == animal.say())
  }

  test("cat") {
    val animal = new Cat()

    assert("Mew" == animal.say())
  }
}

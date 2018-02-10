package exercise10.pets

import org.scalatest.FunSuite

class DogTest extends FunSuite {

  test("dogSay") {
    val dog = new Dog
    dog.say()
  }

}

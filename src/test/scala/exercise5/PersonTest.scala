package exercise5

import org.scalatest.FunSuite

class PersonTest extends FunSuite {

  test("negativeAges") {
    val person = new Person(-5)
    assert(0 == person.age)
  }

  test("positiveAges") {
    val person = new Person(5)
    assert(5 == person.age)
  }

}

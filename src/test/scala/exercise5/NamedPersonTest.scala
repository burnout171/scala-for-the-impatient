package exercise5

import org.scalatest.FunSuite

class NamedPersonTest extends FunSuite {

  test("checkCreation") {
    val person = new NamedPerson("Pavel Likin")
    assert("Pavel" == person.name)
    assert("Likin" == person.surname)
  }

}

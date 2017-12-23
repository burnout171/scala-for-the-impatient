package exercise6

import org.scalatest.FunSuite

class ReverseTest extends FunSuite {

  test("printArguments") {
    val reverse = new Reverse()
    reverse.main(Array("Hello", "World"))
    assert("World Hello" == reverse.reversed)
  }

}

package exercise10.pets

import org.scalatest.FunSuite

class CatTest extends FunSuite {

  test("catSay") {
    val cat = new Cat
    cat.say()
  }

}

package exercise8.creature

import org.scalatest.FunSuite

class CreatureTest extends FunSuite {

  test("ant") {
    val ant = new Ant()

    assert(ant.range == ant.env.length)
  }

  test("ant2") {
    val ant = new Ant2()

    assert(0 == ant.env.length)
  }

}

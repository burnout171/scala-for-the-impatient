package exercise11

import org.scalatest.FunSuite

class MoneyTest extends FunSuite {

  test("sum") {
    val first = new Money(1, 75)
    val second = new Money(0, 50)

    assert(new Money(2, 25) == first + second)
  }

  test("minus") {
    val first = new Money(1, 75)
    val second = new Money(0, 125)

    assert(new Money(0, 50) == first - second)
  }

  test("greater") {
    val first = new Money(1, 75)
    val second = new Money(1, 80)

    assert(second > first)
  }

}

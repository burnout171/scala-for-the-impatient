package exercise11

import org.scalatest.FunSuite

class FractionTest extends FunSuite {

  private val first = new Fraction(1, 3)
  private val second = new Fraction(1, 2)

  test("sum") {
    assert(new Fraction(5, 6) == first + second)
  }

  test("subtraction") {
    assert(new Fraction(1, -6) == first - second)
  }

  test("multiplication") {
    assert(new Fraction(1, 6) == first * second)
  }

  test("division") {
    assert(new Fraction(1, 1) == first / second)
  }

}

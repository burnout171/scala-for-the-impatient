import java.time.LocalDate

import org.scalatest.FunSuite

class Exercise2Test extends FunSuite {

  val productOfHello = 9415087488L
  val hello = "Hello"

  test("signumPositive") {
    assert(0 < Exercise2.signum(1))
  }

  test("signumNegative") {
    assert(0 > Exercise2.signum(-1))
  }

  test("signumZero") {
    assert(0 == Exercise2.signum(0))
  }

  test("productOfHello") {
    assert(productOfHello == Exercise2.product(hello))
  }

  test("defaultProduct") {
    assert(productOfHello == Exercise2.productWithoutLoop(hello))
  }

  test("recursionProductOfHello") {
    assert(productOfHello == Exercise2.productRecursion(hello))
  }

  test("exponentiation") {
    assert(0.5 == Exercise2.exponentiation(2, -1))
    assert(1 == Exercise2.exponentiation(2, 0))
    assert(2 == Exercise2.exponentiation(2, 1))
    assert(4 == Exercise2.exponentiation(2, 2))
    assert(8 == Exercise2.exponentiation(2, 3))
  }

  test("dateStringInterpolation") {
    val year = 2017
    val month = 11
    val day = 11
    assert(LocalDate.of(year, month, day) == Exercise2.interpolateDate(year, month, day))
  }
}

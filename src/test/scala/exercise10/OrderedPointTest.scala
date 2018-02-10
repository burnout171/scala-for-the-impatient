package exercise10

import org.scalatest.FunSuite

class OrderedPointTest extends FunSuite {

  test("equal") {
    val first = new OrderedPoint
    val second = new OrderedPoint
    assert(0 == first.compare(second))
  }

  test("greaterThan") {
    val first = new OrderedPoint(1, 1)
    val second = new OrderedPoint
    assert(1 == first.compare(second))
  }

  test("lessThan") {
    val first = new OrderedPoint
    val second = new OrderedPoint(1, 1)
    assert(-1 == first.compare(second))
  }
}

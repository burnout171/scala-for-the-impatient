package exercise5

import org.scalatest.FunSuite

class TimeAfterMidnightTest extends FunSuite {

  test("before") {
    val first = new TimeAfterMidnight(17, 6)
    val second = new TimeAfterMidnight(17, 10)
    assert(first.before(second))
  }

  test("after") {
    val first = new TimeAfterMidnight(17, 10)
    val second = new TimeAfterMidnight(17, 6)
    assert(!first.before(second))
  }

}

package exercise5

import org.scalatest.FunSuite

class TimeTest extends FunSuite {

  test("hoursLessThan0") {
    val time = new Time(-1, 25)
    assert(23 == time.hours)
  }

  test("hoursGreaterThan24") {
    val time = new Time(24, 25)
    assert(0 == time.hours)
  }

  test("minutesLessThan0") {
    val time = new Time(17, -1)
    assert(16 == time.hours)
    assert(59 == time.minutes)
  }

  test("minutesGreaterThan60") {
    val time = new Time(17, 60)
    assert(18 == time.hours)
    assert(0 == time.minutes)
  }

  test("before") {
    val first = new Time(17, 6)
    val second = new Time(17, 10)
    assert(first.before(second))
  }

  test("after") {
    val first = new Time(17, 10)
    val second = new Time(17, 6)
    assert(!first.before(second))
  }

}

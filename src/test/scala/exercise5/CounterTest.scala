package exercise5

import org.scalatest.FunSuite

class CounterTest extends FunSuite {

  test("incrementCounter") {
    val counter = new Counter
    counter.increment()
    assert(1 == counter.current)
  }

  test("incrementMaxValue") {
    val counter = new Counter(Int.MaxValue)
    counter.increment()
    assert(Int.MaxValue == counter.current)
  }

}

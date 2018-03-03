package exercise12

import org.scalatest.FunSuite

class Exercise12Test extends FunSuite {

  test("values") {
    assert(11 == Exercise12.values(x => x * x, -5, 5).size)
  }

  test("reduceLeft") {
    val arr = Array(20, 15, 27)

    assert(27 == Exercise12.findMax(arr))
  }

  test("factorial") {
    assert(1 == Exercise12.factorial(0))
    assert(6 == Exercise12.factorial(3))
  }

  test("factorialWithFold") {
    assert(1 == Exercise12.factorial(0))
    assert(6 == Exercise12.factorial(3))
  }

  test("largestValue") {
    assert(25 == Exercise12.largestValue(x => 10 * x - x * x, 1 to 10))
  }

  test("largestValuePosition") {
    assert(5 == Exercise12.largestValuePosition(x => 10 * x - x * x, 1 to 10))
  }

  test("adjustToPair") {
    assert(42 == Exercise12.adjustToPair(_ * _)((6, 7)))
  }

  test("basicCorresponds") {
    val words = Array("a", "ab", "abc")
    val lengths = Array(1, 2 ,3)
    assert(words.corresponds(lengths)(_.length == _))
    assert(!words.corresponds(Array(5))(_.length == _))
  }

  test("ownCorresponds") {
    val words = Array("a", "ab", "abc")
    val lengths = Array(1, 2 ,3)
    assert(Exercise12.corresponds(words, lengths, (x: String, y: Int) => x.length == y))
    assert(!Exercise12.corresponds(words, Array(5), (x: String, y: Int) => x.length == y))
  }

  test("unless") {
    assert(() == Exercise12.unless(condition = true)("will not be returned"))
    assert("will be returned" == Exercise12.unless(condition = false)("will be returned"))
  }
}

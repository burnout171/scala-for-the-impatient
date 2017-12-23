package exercise6

import org.scalatest.FunSuite

class CardSuitsTest extends FunSuite {

  test("checkNotEmpty") {
    for (value <- CardSuits.values) println(value)
    assert(4 == CardSuits.values.size)
  }

  test("isRed") {
    assert(CardSuits.isRed(CardSuits.diamonds))
    assert(CardSuits.isRed(CardSuits.hearts))
  }

  test("notRed") {
    assert(!CardSuits.isRed(CardSuits.spades))
    assert(!CardSuits.isRed(CardSuits.clubs))
  }
}

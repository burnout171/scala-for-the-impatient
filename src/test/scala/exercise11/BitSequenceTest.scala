package exercise11

import org.scalatest.FunSuite

class BitSequenceTest extends FunSuite {

  test("apply") {
    val sequence = new BitSequence(1)

    sequence.apply(1)

    assert(1 == sequence.value)
  }

  test("update") {
    val sequence = new BitSequence(1)

    sequence.update(1, 1)

    assert(3 == sequence.value)
  }

}

package exercise6

import org.scalatest.FunSuite

class RGBCornerColorsTest extends FunSuite {

  test("checkNotEmpty") {
    for (value <- RGBCornerColors.values) println(value.id + ": " + value)
    assert(8 == RGBCornerColors.values.size)
  }

}

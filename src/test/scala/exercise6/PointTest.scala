package exercise6

import org.scalatest.FunSuite

class PointTest extends FunSuite {

  test("createPointWithoutNew") {
    val point = Point(1, 1)
    assert(Point(1, 1) == point)
  }

}

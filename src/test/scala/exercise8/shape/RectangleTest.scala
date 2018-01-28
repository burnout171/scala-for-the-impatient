package exercise8.shape

import exercise8.point.Point
import org.scalatest.FunSuite

class RectangleTest extends FunSuite {

  val height = 10
  val wight = 6

  test("centerPoint") {
    val upperLeft = new Point(1, 1)
    val rectangle = new Rectangle(upperLeft, height, wight)
    val expected = new Point(upperLeft.x + height / 2, upperLeft.y + wight / 2)

    print(expected)
    assert(expected == rectangle.centerPoint())
  }

}

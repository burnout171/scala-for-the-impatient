package exercise10

import org.scalatest.FunSuite

class RectangleLikeTest extends FunSuite{

  test("translate") {
    val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    egg.translate(10, -10)
    assert(egg.getX == 15)
    assert(egg.getY == 0)
  }

  test("grow") {
    val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    egg.grow(10, 20)
    assert(egg.getWidth == 30)
    assert(egg.getHeight == 50)
  }
}

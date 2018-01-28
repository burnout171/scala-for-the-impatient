package exercise8.shape

import exercise8.point.Point

class Rectangle(val upperLeft: Point, val width: Double, val height: Double) extends Shape {
  override def centerPoint(): Point = new Point(upperLeft.x + width / 2, upperLeft.y + height / 2)
}

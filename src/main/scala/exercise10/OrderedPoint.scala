package exercise10

import java.awt.Point

class OrderedPoint(x:Int = 0, y:Int = 0) extends Point(x, y) with Ordered[Point] {
  override def compare(that: Point): Int = {
    if (this.getX == that.getX && this.getY == that.getY) 0
    else if (this.getX < that.getX || this.getY < that.getY) -1
    else 1
  }
}

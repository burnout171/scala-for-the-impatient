package exercise8

import exercise8.point.Point

class Square(cornerPoint: Point, width: Int)
  extends java.awt.Rectangle(cornerPoint.x.intValue(), cornerPoint.y.intValue(), width, width) {

  def this(width: Int) {
    this(new Point(0, 0), width)
  }

  def this() {
    this(0)
  }
}

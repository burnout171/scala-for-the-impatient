package exercise10

import java.awt.geom.Ellipse2D

trait RectangleLike {
  this: Ellipse2D =>
    def translate(dx: Double, dy: Double): Unit = {
      setFrame(getX + dx, getY + dy, getWidth, getHeight)
    }

    def grow(dw: Double, dh: Double): Unit = {
      setFrame(getX, getY, getWidth + dw, getHeight + dh)
    }
}

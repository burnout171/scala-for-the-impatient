package exercise10.properties

import java.awt.Point

import org.scalatest.FunSuite

class PrintListenerTest extends FunSuite {

  test("propertyListener") {
    val point = new Point with PropertyChangeSupportTrait
    point.addPropertyListener("setLocation", new PrintListener)
    point.setLocation(0, 1)
    assert(new Point(0, 1) == point.getLocation)
  }

}

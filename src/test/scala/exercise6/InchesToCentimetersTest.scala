package exercise6

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class InchesToCentimetersTest extends FunSuite {

  private val delta = 0.001

  test("inchesToCentimeters") {
    val gallons = 10
    assert(25.4 +- delta === InchesToCentimeters.convert(gallons))
  }

}

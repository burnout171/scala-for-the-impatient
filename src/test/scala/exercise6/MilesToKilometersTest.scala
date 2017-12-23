package exercise6

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class MilesToKilometersTest extends FunSuite {

  private val delta = 0.001

  test("milesToKilometersTest") {
    val gallons = 10
    assert(16.0934 +- delta === MilesToKilometers.convert(gallons))
  }

}

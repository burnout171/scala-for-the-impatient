package exercise6

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class ConversionsTest extends FunSuite {

  private val delta = 0.001

  test("inchesToCentimeters") {
    val inches = 10
    assert(25.4 +- delta === Conversions.inchesToCentimeters(inches))
  }

  test("gallonsToLiters") {
    val gallons = 10
    assert(37.8541 +- delta === Conversions.gallonsToLiters(gallons))
  }

  test("milesToKilometers") {
    val miles = 10
    assert(16.0934 +- delta === Conversions.milesToKilometers(miles))
  }

}

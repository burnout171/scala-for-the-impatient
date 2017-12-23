package exercise6

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class GallonsToLitersTest extends FunSuite {

  private val delta = 0.001

  test("gallonsToLiters") {
    val gallons = 10
    assert(37.8541 +- delta === GallonsToLiters.convert(gallons))
  }

}

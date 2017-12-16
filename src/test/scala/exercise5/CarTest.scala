package exercise5

import org.scalatest.FunSuite

class CarTest extends FunSuite {

  test("manufacturerAndModel") {
    val car = new Car("Hyundai", "Creta")
    assert("Hyundai" == car.manufacturer)
    assert("Creta" == car.modelName)
    assert(-1 == car.year)
    assert("" == car.license)
  }

  test("allParameters") {
    val car = new Car("Hyundai", "Creta", 2016, "license")
    assert("Hyundai" == car.manufacturer)
    assert("Creta" == car.modelName)
    assert(2016 == car.year)
    assert("license" == car.license)
  }

}

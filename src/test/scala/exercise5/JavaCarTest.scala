package exercise5

import org.scalatest.FunSuite

class JavaCarTest extends FunSuite {

  test("manufacturerAndModel") {
    val car = new JavaCar("Hyundai", "Creta")
    assert("Hyundai" == car.getManufacturer)
    assert("Creta" == car.getModelName)
    assert(-1 == car.getYear)
    assert("" == car.getLicense)
  }

  test("allParameters") {
    val car = new JavaCar("Hyundai", "Creta", 2016, "license")
    assert("Hyundai" == car.getManufacturer)
    assert("Creta" == car.getModelName)
    assert(2016 == car.getYear)
    assert("license" == car.getLicense)
  }

}

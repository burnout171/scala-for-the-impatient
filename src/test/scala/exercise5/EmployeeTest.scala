package exercise5

import org.scalatest.FunSuite

class EmployeeTest extends FunSuite {

  test("explicitFields") {
    val employee = new Employee
    assert("John Q. Public" == employee.name)
    assert(0.0 == employee.salary)
  }

}

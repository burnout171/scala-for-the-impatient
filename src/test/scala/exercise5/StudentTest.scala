package exercise5

import org.scalatest.FunSuite

class StudentTest extends FunSuite {

  test("callGetters") {
    val student = new Student(1, "name")
    assert(student.id == student.getId)
    assert(student.name == student.getName)
  }
}

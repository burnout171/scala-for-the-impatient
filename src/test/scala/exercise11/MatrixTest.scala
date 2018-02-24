package exercise11

import org.scalatest.FunSuite

class MatrixTest extends FunSuite {

  test("sum") {
    val m1 = new Matrix(2, 2)
    fillMatrix(m1)
    val m2 = new Matrix(2, 2)
    fillMatrix(m2)
    var expected = new Matrix(2, 2)
    fillMatrix(expected)
    expected *= 2

    assert(expected == m1 + m2)
  }

  test("minus") {
    val m1 = new Matrix(2, 2)
    fillMatrix(m1)
    val m2 = new Matrix(2, 2)
    fillMatrix(m2)
    val expected = new Matrix(2, 2)
    expected(0, 0) = 0
    expected(0, 1) = 0
    expected(1, 0) = 0
    expected(1, 1) = 0

    assert(expected == m1 - m2)
  }

  test("scalarMultiply") {
    val m1 = new Matrix(2, 2)
    fillMatrix(m1)
    val expected = new Matrix(2, 2)
    expected(0, 0) = 2
    expected(0, 1) = 4
    expected(1, 0) = 6
    expected(1, 1) = 8

    assert(expected == m1 * 2)
  }

  test("multiply") {
    val m1 = new Matrix(2, 2)
    fillMatrix(m1)
    val m2 = new Matrix(2, 2)
    fillMatrix(m2)

    val expected = new Matrix(2, 2)
    expected(0, 0) = 7
    expected(0, 1) = 10
    expected(1, 0) = 15
    expected(1, 1) = 22

    assert(expected == m1 * m2)
  }

  private def fillMatrix(matrix: Matrix): Unit = {
    matrix(0, 0) = 1
    matrix(0, 1) = 2
    matrix(1, 0) = 3
    matrix(1, 1) = 4
  }

}

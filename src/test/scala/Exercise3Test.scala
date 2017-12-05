import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class Exercise3Test extends FunSuite {

  test("randomIntArray") {
    val size = 5
    val a = Exercise3.randomIntegersArray(size)
    assert(size == a.length)
    a.foreach(i => assert(i >= 0 && i < size))
  }

  test("adjacentSwapOfEvenSize") {
    val arr = Array(1, 2)
    val swapped = Exercise3.adjacentSwap(arr)
    assert(Array(2, 1) sameElements swapped)
  }

  test("adjacentSwapOfOddSize") {
    val arr = Array(1, 2, 3)
    val swapped = Exercise3.adjacentSwap(arr)
    assert(Array(2, 1, 3) sameElements swapped)
  }

  test("adjacentSwapWithYieldOfEvenSize") {
    val arr = Array(1, 2)
    val swapped = Exercise3.adjacentSwapYield(arr)
    assert(Array(2, 1) sameElements  swapped)
  }

  test("adjacentSwapWithYieldOfOddSize") {
    val arr = Array(1, 2, 3)
    val swapped = Exercise3.adjacentSwapYield(arr)
    assert(Array(2, 1, 3) sameElements swapped)
  }

  test("positiveToNegativeSort") {
    val arr = Array(0, -1, 1)
    var sorted = Exercise3.positiveToNegativeOriginalSort(arr)
    assert(Array(1, 0, -1) sameElements sorted)
  }

  test("doubleArrayAverage") {
    val arr = Array(1.1, 2.2, 3.3, 4.4)
    val average = Exercise3.computeAverage(arr)
    assert(2.75 == average)
  }

  test("rearrange") {
    val arr = Array(1, 2, 3, 4, 5)
    val rearranged = Exercise3.rearrange(arr)
    assert(Array(5, 4, 3, 2, 1) sameElements rearranged)
  }

  test("rearrangeArrayBuffer") {
    val buffer = ArrayBuffer(1, 2, 3, 4, 5)
    val rearranged = Exercise3.rearrange(buffer)
    assert(ArrayBuffer(5, 4, 3, 2, 1) == rearranged)
  }

  test("removeDuplicates") {
    val arr = Array(1, 1, 2, 2)
    val withoutDuplicates = Exercise3.removeDuplicates(arr)
    assert(Array(1, 2) sameElements withoutDuplicates)
  }

  test("removeNegativeElementsExceptFirst") {
    val buffer = ArrayBuffer(1, 2, -1, 4, -2, -4)
    val withoutNegative = Exercise3.removeNegativeElementsExceptFirst(buffer)
    assert(ArrayBuffer(1, 2, -1, 4) == withoutNegative)
  }

  test("getAmericaTimezones") {
    val timeZones = Exercise3.availableAmericaTimezones()
    println(timeZones.mkString("\n"))
    assert(timeZones.length > 0)
  }

  test("flavors") {
    val buffer = Exercise3.datatransfer()
    println(buffer)
    assert(buffer.nonEmpty)
  }
}

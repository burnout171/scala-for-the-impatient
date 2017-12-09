import org.scalatest.FunSuite

class Exercise4Test extends FunSuite {

  test("tenProcentDiscount") {
    val gizmos = Map("staff_1" -> 100, "staff_2" -> 200)
    val discounted = Exercise4.setTenPercentDiscount(gizmos)
    assert(Map("staff_1" -> 90, "staff_2" -> 180) == discounted)
  }

  test("countWordsFromFileMutableMap") {
    val words = Exercise4.wordsCounter("alice.txt", Exercise4.wordsCounterMutableMap)
    checkWords(words)
  }

  test("countWordsFromFileImmutableMap") {
    val words = Exercise4.wordsCounter("alice.txt", Exercise4.wordsCounterImmutableMap)
    checkWords(words)
  }

  test("countWordsFromFileSortedMap") {
    val words = Exercise4.wordsCounter("alice.txt", Exercise4.wordsCounterSortedMap)
    checkWords(words)
  }

  test("countWordsFromFileTreeMap") {
    val words = Exercise4.wordsCounter("alice.txt", Exercise4.wordsCounterSortedJavaMap)
    checkWords(words)
  }

  test("weekdaysMapCorrectlyVisited") {
    val weekdays = Exercise4.weekdaysMap()
    assert(weekdays == (for(d <- weekdays) yield d))
  }

  test("systemPropertiesTable") {
    val table = Exercise4.systemPropertiesTable()
    println(table)
    assert(table.nonEmpty)
  }

  test("minmax") {
    val array = Array(1, 2, 3, 4, 5)
    val minmax = Exercise4.minmax(array)
    assert(minmax._1 == 1)
    assert(minmax._2 == 5)
  }

  test("lteqgt") {
    val array = Array(1, 2, 3, 4, 5)
    val minmax = Exercise4.lteqgt(array, 3)
    assert(minmax._1 == 2)
    assert(minmax._2 == 1)
    assert(minmax._3 == 2)
  }

  test("zipping") {
    val words = Array("one", "two", "three")
    val counters = Array(1, 2, 3)
    val zipped = Exercise4.zipping(words, counters)
    println(zipped)
    assert(zipped("one") == 1)
    assert(zipped("two") == 2)
    assert(zipped("three") == 3)
  }

  private def checkWords(words : scala.collection.Map[String, Int]) = {
    words.foreach(println)
    assert(words.nonEmpty)
  }

}

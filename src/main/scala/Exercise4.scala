import scala.io.Source

object Exercise4 extends App {

  def setTenPercentDiscount(gizmos : Map[String, Int]) : Map[String, Double] = {
    for ((k, v) <- gizmos) yield (k, v * 0.9)
  }

  private def mutableCounter(text: String, words: scala.collection.mutable.Map[String, Int]) : scala.collection.Map[String, Int] = {
    for (word <- text.split("\\W+")) {
      words(word) = words.getOrElse(word, 0) + 1
    }
    words
  }

  def wordsCounterMutableMap(text : String) : scala.collection.Map[String, Int] = {
    val words = new scala.collection.mutable.HashMap[String, Int]
    mutableCounter(text, words)
  }

  def wordsCounterSortedMap(text : String) : scala.collection.Map[String, Int] = {
    val words = new scala.collection.mutable.TreeMap[String, Int]
    mutableCounter(text, words)
  }

  def wordsCounterSortedJavaMap(text : String) : scala.collection.Map[String, Int] = {
    val words = new java.util.TreeMap[String, Int]()
    for (word <- text.split("\\W+")) {
      var counter : Int = words.getOrDefault(word, 0)
      counter += 1
      words.put(word, counter)
    }
    scala.collection.JavaConverters.mapAsScalaMap(words)
  }

  def wordsCounterImmutableMap(text : String) : scala.collection.Map[String, Int] = {
    var words : scala.collection.immutable.Map[String, Int] = Map()
    for (word <- text.split("\\W+")) {
      var counter : Int = words.getOrElse(word, 0)
      counter += 1
      words += (word -> counter)
    }
    words
  }

  def wordsCounter(file: String, counter: String => scala.collection.Map[String, Int]) : scala.collection.Map[String, Int] = {
    val bufferedSource = Source.fromResource(file)
    try {
      counter(bufferedSource.getLines.mkString)
    } finally {
      bufferedSource.close
    }
  }

  def weekdaysMap() : scala.collection.Map[String, Int] = {
    scala.collection.mutable.LinkedHashMap(
      "MONDAY" -> java.util.Calendar.MONDAY,
      "TUESDAY" -> java.util.Calendar.TUESDAY,
      "WEDNESDAY" -> java.util.Calendar.WEDNESDAY,
      "THURSDAY" -> java.util.Calendar.THURSDAY,
      "FRIDAY" -> java.util.Calendar.FRIDAY,
      "SATURDAY" -> java.util.Calendar.SATURDAY,
      "SUNDAY" -> java.util.Calendar.SUNDAY
    )
  }

  def systemPropertiesTable() : String = {
    val properties : scala.collection.Map[String, String] =
      scala.collection.JavaConverters.propertiesAsScalaMap(System.getProperties)
    val maxLine = properties.keys.maxBy(_.length).length
    var table = new StringBuilder
    for ((k, v) <- properties) {
      table ++= k + (" " * (maxLine - k.length)) + " | " + v + "\n"
    }
    table.toString
  }

  def minmax(values : Array[Int]) : Tuple2[Int, Int] = {
    (values.min, values.max)
  }

  def lteqgt(values : Array[Int], v: Int) : Tuple3[Int, Int, Int] =  {
    (values.count(_ < v), values.count(_ == v),  values.count(_ > v))
  }

  def zipping(words : Array[String], counters : Array[Int]) : scala.collection.Map[String, Int] = {
    words.zip(counters).toMap
  }
}

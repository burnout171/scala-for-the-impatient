import java.io._

import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.util.matching.Regex.MatchIterator

object Exercise9 extends App {

  @SerialVersionUID(42L) class Person(val name: String) extends Serializable {
    private val friends = new ArrayBuffer[Person]
    def addFriend(p: Person) {friends += p}
    def isFriend(p: Person) = friends.contains(p)

    def canEqual(other: Any): Boolean = other.isInstanceOf[Person]

    override def equals(other: Any): Boolean = other match {
      case that: Person =>
        (that canEqual this) &&
          friends == that.friends &&
          name == that.name
      case _ => false
    }

    override def hashCode(): Int = {
      val state = Seq(friends, name)
      state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
    }
  }

  def reverseFileLines(fileName: String): String = {
    val lines = Source.fromResource(fileName).getLines()
    lines.toArray.reverse.mkString("\n")
  }

  def tabReplacer(fileName: String, column: Int): String = {
    val symbols = Source.fromResource(fileName).mkString
    symbols.replace("\t", " " * column)
    // writeToFile(symbols, fileName)
    symbols
  }

  def wordsFilter(fileName: String, length: Int): MatchIterator = {
    f"\\w{$length,}".r.findAllIn(Source.fromResource(fileName).mkString)
  }

  def fileAverage(fileName: String): Double = {
    val tokens = Source.fromResource(fileName).mkString.split("""\s+""")
    val numbers = tokens.map(_.toDouble)
    numbers.sum / numbers.length
  }

  def fileMax(fileName: String): Double = {
    val tokens = Source.fromResource(fileName).mkString.split("""\s+""")
    tokens.map(_.toDouble).max
  }

  def fileMin(fileName: String): Double = {
    val tokens = Source.fromResource(fileName).mkString.split("""\s+""")
    tokens.map(_.toDouble).min
  }

  def powersOf2(): String = {
    (0 to 20).map(Math.pow(2, _)).map(i => f"$i \t\t ${1/i}\n").mkString
  }

  def isQuotedString(text: String): Boolean = {
    "\"".r.findAllIn(text).hasNext
  }

  def filterFloatingNumbers(fileName: String): Array[String] = {
    Source.fromResource(fileName).mkString.split("""\s+""").filter("""^\d+?\.\d+$""".r.findFirstIn(_).isEmpty)
  }

  def imgSrcFinder(url: String): Array[String] = {
    val pattern = """(?is)<\s*img[^>]*src\s*=\s*['"\s]*([^'"]+)['"\s]*[^>]*>""".r
    val result = for (m <- pattern.findAllMatchIn(Source.fromURL(url, "UTF-8").mkString)) yield m.group(1)
    result.toArray
  }

  def countClassFiles(file: File): Long = {
    val list = file.listFiles()
    list.count(_.toString.endsWith(".class")) + list.filter(_.isDirectory).map(countClassFiles).sum
  }

  def personToFile(person: Person, fileName: String): Unit = {
    val out = new ObjectOutputStream(new FileOutputStream(fileName))
    out.writeObject(person)
    out.close()
  }

  def readPerson(fileName: String): Person = {
    val in = new ObjectInputStream(new FileInputStream(fileName))
    val person = in.readObject().asInstanceOf[Person]
    in.close()
    person
  }

  def writeToFile(text: String, fileName: String): Unit = {
    val writer = new PrintWriter(fileName)
    writer.println(text)
    writer.close()
  }
}

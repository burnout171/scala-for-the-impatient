import java.io.File

import Exercise9.Person
import org.scalatest.FunSuite

class Exercise9Test extends FunSuite {

  private val alice = "alice.txt"
  private val floatingNumbers = "floatingNumbers.txt"
  private val numbers = "numbers.txt"

  test("reverseFileLines") {
    val reversed = Exercise9.reverseFileLines(alice)
    println(reversed)
  }

  test("replaceTabs") {
    val text = Exercise9.tabReplacer(alice, 4)
    assert(!text.contains('\t'))
  }

  test("12SymbolsWordsPrinter") {
    val words = Exercise9.wordsFilter(alice, 12)
    words.foreach(println(_))
  }

  test("fileAverage") {
    assert(2.5 == Exercise9.fileAverage(floatingNumbers))
  }

  test("fileMax") {
    assert(4.0 == Exercise9.fileMax(floatingNumbers))
  }

  test("fileMix") {
    assert(1.0 == Exercise9.fileMin(floatingNumbers))
  }

  test("powersOf2") {
    val text = Exercise9.powersOf2()
    Exercise9.writeToFile(text, "target/test.txt")
  }

  test("findQuotedString") {
    assert(Exercise9.isQuotedString("\"Quoted\""))
    assert(!Exercise9.isQuotedString("Without quotes"))
  }

  test("filterFloating") {
    assert(Exercise9.filterFloatingNumbers(floatingNumbers).isEmpty)
    assert(!Exercise9.filterFloatingNumbers(numbers).isEmpty)
  }

  test("imgSrcFind") {
    val images = Exercise9.imgSrcFinder("http://horstmann.com")
    images.foreach(println(_))
    assert(images.length > 0)
  }

  test("countClassFiles") {
    assert(0 == Exercise9.countClassFiles(new File("src")))
    assert(Exercise9.countClassFiles(new File("target")) > 0)
  }

  test("personToFile") {
    val dir = "target/person.txt"
    val person = new Person("test")
    Exercise9.personToFile(person, dir)
    assert(person == Exercise9.readPerson(dir))
  }
}

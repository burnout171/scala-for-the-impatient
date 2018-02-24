package exercise11

import org.scalatest.FunSuite

class TableTest extends FunSuite {

  test("createTable") {
    val table = new Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
    println(table.toString)
    assert("<table><tr>\n<td>Java</td>\n<td>Scala</td>\n</tr><tr>\n<td>Gosling</td>\n<td>Odersky</td>\n</tr><tr>\n<td>JVM</td>\n<td>JVM, .NET</td>\n</tr></table>" == table.toString)
  }
}

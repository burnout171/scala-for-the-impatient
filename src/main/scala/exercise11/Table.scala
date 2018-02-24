package exercise11

import scala.collection.mutable.ArrayBuffer

class Table {
  private val chunks = new ArrayBuffer[String]

  def |(chunk: String) = {
    chunks += "<td>%s</td>\n".format(chunk)
    this
  }

  def ||(chunk: String) = {
    chunks += "</tr><tr>\n<td>%s</td>\n".format(chunk)
    this
  }

  override def toString = "<table><tr>\n%s</tr></table>".format(chunks.mkString)
}

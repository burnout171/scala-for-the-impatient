package exercise10

import java.io.FileInputStream

import org.scalatest.FunSuite

class IterableInputStreamTest extends FunSuite {

  test("iterator") {
    val iterableStream = new IterableInputStream(new FileInputStream("src/main/resources/alice.txt"))
    for (byte <- iterableStream) print(byte.toChar)
  }

}

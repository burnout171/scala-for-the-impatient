package exercise10

import java.io.FileInputStream

import org.scalatest.FunSuite

class BufferedReader extends FunSuite {

  test("read") {
    val bufferedReader = new FileInputStream("src/main/resources/alice.txt") with Buffering
    val buffer = new Array[Byte](8192)
    val bytes = bufferedReader.available()
    bufferedReader.read(buffer)
    bufferedReader.read(buffer)
    assert(bytes - (8192 * 2) == bufferedReader.available())
  }
}

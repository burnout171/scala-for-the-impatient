package exercise10

import java.io.InputStream

class IterableInputStream(stream: InputStream) extends InputStream with Iterable[Byte] {

  override def read(): Int = stream.read()

  override def iterator: Iterator[Byte] = {
    new Iterator[Byte] {
      override def hasNext: Boolean = stream.available() > 0
      override def next(): Byte = read().toByte
    }
  }
}

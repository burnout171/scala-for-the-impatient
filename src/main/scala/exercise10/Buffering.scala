package exercise10

import java.io.{BufferedInputStream, InputStream}


trait Buffering extends ConsoleLogger {
  this: InputStream =>
    val reader = new BufferedInputStream(this)
    override def read(bytes: Array[Byte]): Int = {
      log("Available: %s bytes".format(this.available()))
      reader.read(bytes)
    }
}

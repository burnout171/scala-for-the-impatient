package exercise10.crypto

import exercise10.ConsoleLogger

trait CryptoLogger extends ConsoleLogger {

  val key = 3

  override def log(msg: String): Unit = {
    val shifted = msg.map(_ + key).map(_.toChar).mkString
    super.log(shifted)
  }

}

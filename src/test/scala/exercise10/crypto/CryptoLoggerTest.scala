package exercise10.crypto

import org.scalatest.FunSuite

class CryptoLoggerTest extends FunSuite {

  test("shift3") {
    val logger = new CryptoLoggerImpl
    logger.print("a")
  }

  test("shift-3") {
    val logger = new {override val key = -3} with CryptoLoggerImpl
    logger.print("a")
  }
}

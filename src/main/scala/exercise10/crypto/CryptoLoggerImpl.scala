package exercise10.crypto

class CryptoLoggerImpl extends CryptoLogger {

  def print(msg: String): Unit = {
    log(msg)
  }

}

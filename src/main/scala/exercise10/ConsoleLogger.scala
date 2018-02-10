package exercise10

trait ConsoleLogger extends Logger {

  def log(msg: String): Unit = {
    println(msg)
  }

}

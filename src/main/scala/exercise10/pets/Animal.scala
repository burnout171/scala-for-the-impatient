package exercise10.pets

import exercise10.ConsoleLogger

trait Animal extends ConsoleLogger {

  val message: String

  def say(): Unit = {
    log(message)
  }
}

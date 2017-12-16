package exercise5

class BankAccount (private var balance: Double = 0.0) {

  def deposit(deposit: Double): Unit = {
    if (deposit > 0)
      balance += deposit
  }

  def withdraw(withdraw: Double): Unit = {
    if (balance - withdraw > 0)
      balance -= withdraw
  }

  def value: Double = balance

}

package exercise8.account

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  override def deposit(amount: Double): Double = {
    if (amount == 1) super.deposit(amount)
    currentBalance
  }

  override def withdraw(amount: Double): Double = {
    if (amount == 1) super.withdraw(amount)
    currentBalance
  }
}

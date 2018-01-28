package exercise8.account

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  private var counter = 0

  def earnMonthlyInterest(): Unit = {
    deposit(counter * 0.01)
    counter = 0
  }

  override def deposit(amount: Double): Double = {
    charge()
    super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    charge()
    super.withdraw(amount)
  }

  private def charge(): Unit = {
    counter += 1
    if (counter > 3) super.withdraw(1)
  }
}

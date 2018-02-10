package exercise10.account

import org.scalatest.FunSuite

class SavingsAccountTest extends FunSuite {

  test("withdraw") {
    val account = new SavingsAccount
    account.withdraw(100)
    assert(0 == account.balance)
  }

}

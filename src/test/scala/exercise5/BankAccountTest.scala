package exercise5

import org.scalatest.FunSuite

class BankAccountTest extends FunSuite {

  test("deposit") {
    val account = new BankAccount
    account.deposit(100)
    assert(100 == account.value)
  }

  test("depositNegative") {
    val account = new BankAccount
    account.deposit(-100)
    assert(0 == account.value)
  }

  test("withdraw") {
    val account = new BankAccount(100)
    account.withdraw(50)
    assert(50 == account.value)
  }

  test("withdrawMoreThanAllowed") {
    val account = new BankAccount(100)
    account.withdraw(200)
    assert(100 == account.value)
  }

}

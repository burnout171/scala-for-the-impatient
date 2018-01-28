package exercise8.account

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class CheckingAccountTest extends FunSuite with BeforeAndAfterEach {

  private val one = 1
  private val two = 2
  private val balance = 100

  private var account: CheckingAccount = _

  override def beforeEach() {
    account = new CheckingAccount(balance)
  }

  test("deposit") {
    assert(balance + one == account.deposit(one))
  }

  test("depositMoreThanOne") {
    assert(balance == account.deposit(two))
  }

  test("withdraw") {
    assert(balance - one == account.withdraw(one))
  }

  test("withdrawMoreThanOne") {
    assert(balance == account.withdraw(two))
  }
}

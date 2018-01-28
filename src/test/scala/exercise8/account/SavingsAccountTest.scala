package exercise8.account

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class SavingsAccountTest extends FunSuite with BeforeAndAfterEach {

  private val one = 1
  private val two = 2
  private val balance = 100

  private var account: SavingsAccount = _

  override def beforeEach() {
    account = new SavingsAccount(balance)
  }

  test("earn") {
    val expected = balance + one + (1 * 0.01)
    account.deposit(one)

    account.earnMonthlyInterest()

    assert(expected == account.currentBalance)
  }

  test("threeOperationIfFree") {
    account.deposit(one)
    account.deposit(one)
    account.deposit(one)

    assert(balance + 3 == account.currentBalance)
  }

  test("fourthOperationIsPaid") {
    account.deposit(one)
    account.deposit(one)
    account.deposit(one)
    account.deposit(one)

    assert(balance + 3 == account.currentBalance)
  }
}

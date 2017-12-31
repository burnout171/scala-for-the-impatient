package exercise7

import org.scalatest.FunSuite

class KeeperTest extends FunSuite {

  private val password = "secret"

  test("correctPassword") {
    val keeper = new Keeper
    keeper.main(Array(password))
    assert(password == keeper.password)
  }

  test("incorrectPassword") {
    val keeper = new Keeper
    keeper.main(Array("test"))
    assert(keeper.password.isEmpty)
  }

}

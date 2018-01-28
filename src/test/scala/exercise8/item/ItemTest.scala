package exercise8.item

import org.scalatest.FunSuite

class ItemTest extends FunSuite {

  private val price = 1.0
  private val description = "description"

  test("simpleItem") {
    val item = new SimpleItem(price, description)

    assert(price == item.price)
    assert(description == item.description)
  }

  test("bundle") {
    val first = new SimpleItem(price, "first")
    val second = new SimpleItem(price * 2, "second")
    val bundle = new Bundle()
    bundle.add(first)
    bundle.add(second)

    assert(first.price + second.price == bundle.price())
    assert(s"${first.description}, ${second.description}" == bundle.description())
  }
}

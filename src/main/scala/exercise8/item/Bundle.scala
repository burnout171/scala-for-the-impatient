package exercise8.item

import scala.collection.mutable.ArrayBuffer

class Bundle extends Item {

  private val items = ArrayBuffer[Item]()

  override def price(): Double = {
    items.map(_.price()).sum
  }

  override def description(): String = {
    items.map(_.description()).mkString(", ")
  }

  def add(item: Item): Unit = {
    items += item
  }
}

package exercise11

class BitSequence(var value: Long) {

  def update(bit: Long, position: Int): Unit = {
    value |= bit << position % 64
  }

  def apply(bit: Long): Long = {
    value & (1 << bit)
  }

}

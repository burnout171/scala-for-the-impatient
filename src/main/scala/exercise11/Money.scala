package exercise11

class Money (d: Int, c: Int) {

  private val dollars = d + (c / 100)
  private val cents = c % 100

  def -(that: Money): Money = {
    new Money(this.dollars - that.dollars, this.cents - that.cents)
  }

  def +(that: Money): Money = {
    new Money(this.dollars + that.dollars, this.cents + that.cents)
  }

  def ==(that: Money): Boolean = {
    this.dollars == that.dollars && this.cents == that.cents
  }

  def >(that:Money): Boolean = {
    this.dollars >= that.dollars && this.cents > that.cents
  }
}

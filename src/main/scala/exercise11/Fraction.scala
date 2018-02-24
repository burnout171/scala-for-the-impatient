package exercise11

class Fraction(n: Int, d: Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

  def sign(a: Int): Int  = if (a > 0) 1 else if (a < 0) - 1 else 0
  def gcd(a: Int, b: Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)

  def +(that: Fraction): Fraction = {
    new Fraction(this.num * that.den + that.num * this.den, this.den * that.den)
  }

  def -(that: Fraction): Fraction = {
    new Fraction(this.num * that.den - that.num * this.den, this.den * that.den)
  }

  def *(that: Fraction): Fraction = {
    new Fraction(this.num * that.num, this.den * that.den)
  }

  def /(that: Fraction): Fraction = {
    new Fraction(this.num / that.num, this.den / that.den)
  }

  override def toString = s"$num/$den"


  def canEqual(other: Any): Boolean = other.isInstanceOf[Fraction]

  override def equals(other: Any): Boolean = other match {
    case that: Fraction =>
      (that canEqual this) &&
        num == that.num &&
        den == that.den
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(num, den)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

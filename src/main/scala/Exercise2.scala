import java.time.LocalDate

object Exercise2 extends App {

  implicit class DateInterpolation(val sc: StringContext) extends AnyVal {
    def date(args: Any*) : LocalDate = {
      if (args.size < 3) throw new RuntimeException("Illegal number of arguments")
      LocalDate.of(args(0).asInstanceOf[Int], args(1).asInstanceOf[Int], args(2).asInstanceOf[Int])
    }
  }

  def signum(n: Int): Int = {
    if (n > 0) 1
    else if (n < 0) -1
    else 0
  }

  def loop(): Unit = {
    for (n <- Range(10, 0, -1)) println(n)
  }

  def countdown(n: Int): Unit = {
    for (i <- Range(n, 0, -1)) println(i)
  }

  def product(str: String): Long = {
    var result: Long = 1
    for (c <- str) result *= c
    result
  }

  def productWithoutLoop(str: String): Long = {
    str.map(BigInt(_)).product.toLong
  }

  def productRecursion(str: String): Long = {
    if (str.length == 1) return str.head
    str.head * productRecursion(str.tail)
  }

  def exponentiation(num: Int, exp: Int): Double = {
    if (exp == 0) 1
    else if (exp > 0)
      if (exp % 2 == 0) exponentiation(num, exp / 2) * exponentiation(num, exp / 2)
      else num * exponentiation(num, exp - 1)
    else 1 / exponentiation(num, -exp)
  }

  def interpolateDate(year: Int, month: Int, day: Int): LocalDate = {
    date"$year-$month-$day"
  }
}
package exercise12

object Exercise12 extends App {

  def values(fun: (Int) => Int, low: Int, high: Int) = low.to(high).map(x =>(x, fun(x)))

  def findMax(arr: Array[Int]) = arr.reduceLeft(_ max _)

  def factorial(num: Int) = if (num == 0) 1 else 1.to(num).reduceLeft(_ * _)

  def factorialWithFold(num: Int) = 1.to(num).foldLeft(1)(_ * _)

  def largestValue(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(fun).max

  def largestValuePosition(fun: (Int) => Int, inputs: Seq[Int]) =
    inputs.map(x => (x, fun(x))).reduceLeft((x, y) => if (x._2 > y._2) x else y)._1

  def adjustToPair(fun: (Int, Int) => Int) = (x: (Int, Int)) => fun(x._1, x._2)

  def corresponds(words: Seq[String], lengths: Seq[Int], fun: (String, Int) => Boolean) =
    (words zip lengths).map(x => fun(x._1, x._2)).reduceLeft(_ & _)

  def unless(condition: => Boolean)(toExecute: => String) = if (!condition) toExecute
}

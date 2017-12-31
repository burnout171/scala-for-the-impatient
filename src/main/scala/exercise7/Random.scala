package exercise7.random

// The package object is needed to avoid JVM limitation.
package object Random {
  private val a = 1664525
  private val b = 1013904223
  private val n = 32
  private val const = math.pow(2, n)

  private var previous: Double = 0

  def nextInt(): Int = {
    nextDouble().toInt
  }

  def nextDouble(): Double = {
    previous = (previous * a + b) % const
    previous
  }

  def setSeed(seed: Int) : Unit = {
    previous = seed
  }
}

package exercise7.random

import org.scalatest.FunSuite

class RandomTest extends FunSuite {

  Random.setSeed(9999)

  test("nextDouble") {
    val rand = Random.nextDouble()
    println(rand)
    assert(rand.isInstanceOf[Double])
  }

  test("nextInt") {
    val rand = Random.nextInt()
    println(rand)
    assert(rand.isInstanceOf[Int])
  }

}

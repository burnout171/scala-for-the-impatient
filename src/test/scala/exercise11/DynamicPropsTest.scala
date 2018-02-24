package exercise11

import org.scalatest.FunSuite

class DynamicPropsTest extends FunSuite {

  test("") {
    val sysProperties = new DynamicProps(System.getProperties)
    val expected = System.getProperties.get("java.home")

    assert(expected == sysProperties.java.home.toString)
  }

}

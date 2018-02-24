package exercise11

import org.scalatest.FunSuite

class PathComponentsTest extends FunSuite {

  test("unapply") {
    val PathComponents(path, name) = "/home/user/test.txt"

    assert("/home/user" == path)
    assert("test.txt" == name)
  }

  test("unapplySeq") {
    val path = PathComponents.unapplySeq("/home/user/test.txt")
    val seq = path.getOrElse(throw new RuntimeException())

    assert(Array("home", "user", "test.txt") sameElements seq)
  }
}

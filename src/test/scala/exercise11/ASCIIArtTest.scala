package exercise11

import org.scalatest.FunSuite

class ASCIIArtTest extends FunSuite {

  val x = new ASCIIArt(
    """ /\_/\
( ' ' )
(  -  )
 | | |
(__|__)""")

  val y = new ASCIIArt(
    """   -----
 / Hello \
<  Scala |
 \ Coder /
   -----""")

  test("horizontal") {
    println(x + y)
  }

  test("vertically") {
    println(x ^ y)
  }
}

package exercise6

class Reverse extends App {
  val reversed = if (args != null) args.reverse.mkString(" ")
  println(reversed)
}

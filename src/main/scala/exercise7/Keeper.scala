package exercise7

class Keeper extends App {

  val name : String = System.getenv("user.name")
  var password = ""

  if (args.length > 0 && args(0).eq("secret")) {
    println("Hello, " + name)
    password = "secret"
  }
  else System.err.println("Wrong password!")

}

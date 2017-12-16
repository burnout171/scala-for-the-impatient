package exercise5

class NamedPerson(val fullName: String) {

  val name: String = fullName.split(" ")(0)
  val surname: String = fullName.split(" ")(1)
}

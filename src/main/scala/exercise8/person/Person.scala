package exercise8.person

/**
  * public class exercise8.person.Person {
  *   private final java.lang.String name;
  *
  *   public java.lang.String name();
  *   public java.lang.String toString();
  *   public exercise8.person.Person(java.lang.String);
  * }
  */
class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}

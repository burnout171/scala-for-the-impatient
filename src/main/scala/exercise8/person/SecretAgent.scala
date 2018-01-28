package exercise8.person

/**
  * public class exercise8.person.SecretAgent extends exercise8.person.Person {
  *   private final java.lang.String name;
  *   private final java.lang.String toString;
  *
  *   public java.lang.String name();
  *   public java.lang.String toString();
  *   public exercise8.person.SecretAgent(java.lang.String);
  * }
  */
class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret"
  override val toString = "secret"
}

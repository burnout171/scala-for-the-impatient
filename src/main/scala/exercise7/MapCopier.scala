package exercise7

object MapCopier {

  import java.util.{HashMap => JavaHashMap}

  import scala.collection.mutable.{HashMap => ScalaHashMap}

  def copy(javaMap: JavaHashMap[String, String]): ScalaHashMap[String, String] = {
    val scalaMap = new ScalaHashMap[String, String]()
    javaMap.forEach((key, value) => scalaMap.put(key, value))
    scalaMap
  }

}

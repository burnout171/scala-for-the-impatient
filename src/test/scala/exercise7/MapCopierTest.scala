package exercise7

import org.scalatest.FunSuite

class MapCopierTest extends FunSuite {

  test("copyJavaToScalaMap") {
    import java.util.{HashMap => JavaHashMap}

    val javaMap = new JavaHashMap[String, String]()
    javaMap.put("key", "value")

    var scalaMap = MapCopier.copy(javaMap)

    javaMap.forEach((key, value) => assert(value == scalaMap.get(key).orNull))
  }

}

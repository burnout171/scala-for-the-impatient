package exercise5

import scala.beans.BeanProperty

class Student(@BeanProperty val id: Long, @BeanProperty val name: String) {

}

package exercise7

// All these packages are available through package exercise7.
package com.horstmann.impatient {
  object Person {
    val name = "horstmann"

    private var rate: Double = 0

    // Method is only accessible through child packages of com.
    // Basically it has no sense since com is root package.
    private[com] def giveRaise(rate: Double): Unit = {
      this.rate += rate
    }
  }
}

package com {
  package horstmann {
    package impatient {
      // Could access to Person without import
      class Employee(val name: String = Person.name) {
        println(name)
        if (Person.name == name) Person.giveRaise(10)
      }
    }
  }
}

package com.horstmann.impatient.test {
  import exercise7.com.horstmann.impatient.Person

  // Import is needed to get access to Person
  class Employee(val name: String = Person.name) {
    println(name)
    if (Person.name == name) Person.giveRaise(10)
  }

  package test {

    // Brings all packages from java and javax.
    // It would be better to add only packages you need to avoid name conflicts.
  }

  // All scala classes with the same name as in java.lang will override previous one.

}
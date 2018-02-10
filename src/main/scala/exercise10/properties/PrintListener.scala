package exercise10.properties

import java.beans.{PropertyChangeEvent, PropertyChangeListener}

class PrintListener extends PropertyChangeListener {
  override def propertyChange(evt: PropertyChangeEvent): Unit = println(evt)
}

package exercise10.properties

import java.awt.Point
import java.beans.{PropertyChangeListener, PropertyChangeSupport}

trait PropertyChangeSupportTrait {
  this:Point =>
    val propertyChangeSupport = new PropertyChangeSupport(this)

    def addPropertyListener(listener: PropertyChangeListener): Unit = {
      propertyChangeSupport.addPropertyChangeListener(listener)
    }

    def addPropertyListener(name: String, listener: PropertyChangeListener): Unit = {
      propertyChangeSupport.addPropertyChangeListener(name, listener)
    }

    def removePropertyListener(listener: PropertyChangeListener): Unit = {
      propertyChangeSupport.removePropertyChangeListener(listener)
    }

    def removePropertyListener(name: String, listener: PropertyChangeListener): Unit = {
      propertyChangeSupport.removePropertyChangeListener(name, listener)
    }

    override def setLocation(x: Int, y: Int): Unit = {
      propertyChangeSupport.firePropertyChange("setLocation", getLocation, (x.toDouble, y.toDouble))
      this.setLocation(x.toDouble, y.toDouble)
    }
}

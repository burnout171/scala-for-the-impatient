package exercise11

import scala.language.dynamics

class DynamicProps(val props: java.util.Properties) extends Dynamic {
  def updateDynamic(name: String)(value: String) {
    props.setProperty(new PartialPath(props, name).toString, value)
  }
  def selectDynamic(name: String): PartialPath = new PartialPath(props, name)
}

class PartialPath(val props: java.util.Properties, val path: String) extends Dynamic {
  def selectDynamic(name: String): PartialPath = {
    new PartialPath(props, s"$path.$name")
  }

  override def toString: String = props.getProperty(path)
}

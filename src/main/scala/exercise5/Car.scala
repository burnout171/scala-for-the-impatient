package exercise5

class Car(val manufacturer: String, val modelName: String) {

  private var _year = -1
  var license = ""

  def this(manufacturer: String, modelName: String, year: Int) {
    this(manufacturer, modelName)
    this._year = year
  }

  def this(manufacturer: String, modelName: String, license: String) {
    this(manufacturer, modelName)
    this.license = license
  }

  def this(manufacturer: String, modelName: String, year: Int, license: String) {
    this(manufacturer, modelName, year)
    this.license = license
    this._year = year
  }

  def year: Int = _year
}

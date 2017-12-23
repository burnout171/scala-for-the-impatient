package exercise6

object MilesToKilometers extends UnitConversion {
  override def convert(value: Double): Double = Conversions.milesToKilometers(value)
}

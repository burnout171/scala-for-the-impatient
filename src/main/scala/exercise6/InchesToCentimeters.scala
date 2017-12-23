package exercise6

object InchesToCentimeters extends UnitConversion {
  override def convert(value: Double): Double = Conversions.inchesToCentimeters(value)
}

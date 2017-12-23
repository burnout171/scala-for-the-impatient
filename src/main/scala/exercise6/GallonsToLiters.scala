package exercise6

object GallonsToLiters extends UnitConversion {
  override def convert(value: Double): Double = Conversions.gallonsToLiters(value)
}

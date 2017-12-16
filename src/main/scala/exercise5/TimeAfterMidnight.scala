package exercise5

class TimeAfterMidnight(private val hrs: Int = 0, private val min: Int = 0) extends Time(hrs, min) {

  private val _minutesAfterMidnight = super.hours * 60 + super.minutes

  def before(other: TimeAfterMidnight): Boolean = {
    _minutesAfterMidnight < other.minutesAfterMidnight
  }

  def minutesAfterMidnight: Int = _minutesAfterMidnight

}

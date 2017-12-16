package exercise5

class Time(private var hrs: Int = 0, private var min: Int = 0) {

  private val _minutes = min match {
    case i: Int if i % 60 == 0 => hrs += i / 60; 0
    case i: Int if i < 0 => hrs += (i / 60 - 1); 60 + i % 60
    case i: Int if i > 59 => hrs += i / 60; i % 60
    case _ => min
  }

  private val _hours = hrs match {
    case i: Int if i < 0 => 24 + i % 24
    case i: Int if i > 23 => i % 24
    case _ => hrs
  }


  def before (other: Time): Boolean = {
    _hours < other.hours || _hours == other.hours && _minutes < other.minutes
  }

  def hours: Int = _hours
  def minutes: Int = _minutes

}

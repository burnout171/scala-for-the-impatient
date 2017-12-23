package exercise6

object CardSuits extends Enumeration {
  val spades: CardSuits.Value   = Value("\u2660")
  val diamonds: CardSuits.Value = Value("\u2666")
  val hearts: CardSuits.Value   = Value("\u2665")
  val clubs: CardSuits.Value    = Value("\u2663")

  def isRed(suit: CardSuits.Value): Boolean = {
    suit == diamonds || suit == hearts
  }
}
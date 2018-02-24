package exercise11

class ASCIIArt (val art: String) {

  def +(that: ASCIIArt): ASCIIArt = {
    new ASCIIArt(art.split("\n").zip(that.art.split("\n")).map(x => x._1 + x._2).mkString("\n"))
  }

  def ^(that: ASCIIArt): ASCIIArt = {
    new ASCIIArt(that.art + "\n" + this.art)
  }

  override def toString = art
}

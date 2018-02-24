package exercise11

object PathComponents {
  def unapply(path: String): Option[(String, String)] = {
    val pos = path.lastIndexOf("/")
    if (pos == -1) Option.empty else Option.apply(( path.substring(0, pos), path.substring(pos + 1) ))
  }

  def unapplySeq(path: String): Option[Seq[String]] = {
    if (path.startsWith("/")) Option.apply(path.substring(1).split("/"))
    else Option.apply(path.split("/"))
  }
}

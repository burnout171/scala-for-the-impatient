package exercise6

object RGBCornerColors extends Enumeration {

  val black: RGBCornerColors.Value   = Value(0x000000, "0,0,0")
  val blue: RGBCornerColors.Value    = Value(0x0000ff, "0,0,1")
  val red: RGBCornerColors.Value     = Value(0xff0000, "1,0,0")
  val magenta: RGBCornerColors.Value = Value(0xff00ff, "1,0,1")
  val green: RGBCornerColors.Value   = Value(0x00ff00, "0,1,0")
  val cyan: RGBCornerColors.Value    = Value(0x00ffff, "0,1,1")
  val yellow: RGBCornerColors.Value  = Value(0xffff00, "1,1,0")
  val white: RGBCornerColors.Value   = Value(0xffffff, "1,1,1")

}

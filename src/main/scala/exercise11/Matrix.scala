package exercise11

class Matrix(private val m: Int, private val n: Int) {

  private val matrix = Array.ofDim[Int](m, n)

  def update(x: Int, y: Int, value: Int): Unit = matrix(x)(y) = value
  def apply(x: Int, y: Int): Int = matrix(x)(y)

  def +(that: Matrix): Matrix = {
    val result = new Matrix(m, n)
    for (i <- 0 until m; j <- 0 until n) {
      result(i, j) = this.matrix(i)(j) + that.matrix(i)(j)
    }
    result
  }

  def -(that: Matrix): Matrix = {
    this + (that * -1)
  }

  def *(num: Int): Matrix = {
    val result = new Matrix(m, n)
    for (i <- 0 until m; j <- 0 until n) {
      result(i, j) = this.matrix(i)(j) * num
    }
    result
  }

  def *(that: Matrix): Matrix = {
    val result = new Matrix(m, n)
    for (i <- 0 until m; j <- 0 until n) {
      result(i, j) = prod(that, i, j)
    }
    result
  }

  private def prod(that: Matrix, i: Int, j: Int) = {
    (for (k <- 0 until n) yield matrix(i)(k) * that.matrix(k)(j)).sum
  }

  override def toString: String = matrix.map(_.mkString(" ")).mkString("\n")

  def canEqual(other: Any): Boolean = other.isInstanceOf[Matrix]

  override def equals(other: Any): Boolean = other match {
    case that: Matrix =>
      (that canEqual this) &&
        (matrix.deep == that.matrix.deep) &&
        m == that.m &&
        n == that.n
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(matrix, m, n)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

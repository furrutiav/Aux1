object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
  }
  private def Cos(x: Double = 1): Double = {
    x * x
  }
  private val y1: Double = Cos(-1)
  private val y2: Double = Cos(2)
  println(y1, y2)
}
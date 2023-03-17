class hello_world {
  def print(): Unit = {
    println("Hola")
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    new hello_world().print()
  }

}


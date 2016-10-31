import scala.io.Source.fromFile
import java.util._

//val iter: Iterator[String] =
 // fromFile("Call-by-name.scala").getLines()

lazy val firstLazy = {
  println("first lazy")
  1
}

lazy val secondLazy = {
  println("second lazy")
  2
}

def add(a: Int, b: Int) = {
  a + b
}

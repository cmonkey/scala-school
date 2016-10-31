case class Sample(a: String, b: String , c:String , d: String , e: String)

def showContent(x: Any) =
  x match {
    case Sample(a, b, c, d, e) =>
    s"Sample $a.$b.$c.$d.$e"
    case (a,b,c,d,e) =>
    s"tuple $a,$b,$c,$d,$e"
    case head::second::rest =>
    s"list head:$head second:$second rest:$rest"
  }

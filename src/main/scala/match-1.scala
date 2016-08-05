val times = 1

times match {
  case 1 => "one"
  case 2 => "two"
  case _ => "some other number"
}

times match {
 case i if i == 1 => "one"
 case i if i == 2 => "two"
 case _ => "some other number"
}

def bigger(o: Any): Any = {
  o match {
    case i: Int if i < 0 => i - 1
    case i: Int => i + 1
    case d: Double if d < 0.0 => d - 0.1
    case d: Double => d + 0.1
    case text: String => text + "s"
  }
}

/*
def calcType(calc: Calculator) = calc match {
  case _ if calc.brand == "HP" && calc.model == "20B" => "financial"
  case _ if calc.brand == "HP" && calc.model == "48G" => "scientific"
  case _ if calc.brand == "HP" && calc.model == "30B" => "business"
  case _ => "unknown"
}
*/

case class Calculator(brand: String, model: String)

val hp20b = Calculator("HP", "20b")


/*
try{
  remoteCalculatorService.add(1,2)
}catch{
 case e: ServerIsDownException => log.error(e, "the remote calculator service is unavailable, should have kept your trusty HP")
}finally{
 remoteCalculatorService.close()
}
*/

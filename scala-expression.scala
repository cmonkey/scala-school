var n = 1 + 1

val two = 1 + 1

var name = "steve"

name = "marius"

def addOne(m: Int): Int = m + 1

val three = addOne(2)

def three2() = 1 + 2

three2

three2

(x: Int) => x + 1

val addOne2 = (x: Int) => x + 1

addOne2(1)

def timesTwo(i: Int) : Int = {
    println("hello world")

    i * 2
}

timesTwo(10)

{i : Int =>
 print("hello world")
 i * 2
 }

 def adder(m: Int, n: Int) = m + n

 val add2 = adder(2, _ :Int)

 add2(3)

 def multiply(m: Int)(n: Int): Int = m * n

 multiply(2)(3)

 val timesTwo2 = multiply(2) _ 

 timesTwo2(3)

 (adder _).curried

 def capitalizeAll(args: String*) = {
  args.map{ arg => 
  arg.capitalize}
 }

 capitalizeAll("rarity", "applejack")

 class Calculator{
 val brand: String = "HP"
 def add(m: Int, n: Int): Int = m + n
 }

 val calc = new Calculator

 calc.add(1,2)

// TODO field error
 //calc.brand
 //
 

 class Calculator2(brand: String){
 val color: String =  if (brand == "TI"){
 "blue"
 }else if (brand == "HP"){
 "black"
 }else{
 "white"
 }

 def add(m: Int, n: Int): Int = m + n
 }

 val calc2 = new Calculator2("HP")

// calc2.color

class C{
    var acc = 0
    def minc = { acc += 1}
    val finc = { () => acc += 1}
}

val c = new C

c.minc

c.finc()

class SclientifcCalculator(brand: String) extends Calculator2(brand){
   def log(m: Double, base: Double) = math.log(m) / math.log(base)
}

class EventMoreSclientificCalculator(brand: String) extends SclientifcCalculator(brand){
 def log(m: Int): Double = log(m, math.exp(1))
}


abstract class Shape{
  def getArea(): Int
}


class Circle(r: Int) extends Shape{
  def getArea(): Int = { r * r * 3}
}

//val s = new Shape


val c1 = new Circle(2)

trait Car{
  val brand: String
}

trait Shiny{
 val shineRefraction: Int
}

class BMW extends Car{
 val brand = "BMW"
}

class BMW2 extends Car with Shiny{
  val brand = "BMW"

  val shineRefraction = 12
}

trait Cache[K, V]{
  def get(key: K) : V
  def put(key: K, value: V)
  def delete(key: K)
}




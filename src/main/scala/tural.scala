val a = 1
println(s"${a + 1}")

printf("Now you have %.16f problems.", Math.nextAfter(2.0,3))


//to until by toList

//abs max min

// reverse capitalize toInt

// filter map

def add(x: Int, y: Int): Int = {

  x + y

}

println(add(3,4))

def add1(x:Int, y:Int) = {
  x + y
}

println(add1(3,4))

def add2(x: Int, y: Int) = x + y

println(add2(3, 4))


val add3 = (x: Int, y: Int) => x + y

def proxymethod(f: Int => Int) = {
  f(1)
}

val call = proxymethod(x => x + 1)


def swap(x: String, y: String) = (y, x)

val (a1, b1) = swap("x:String", "y:String")

var x, y, z = 0

var (a2, b2,c,d,python, java) = (1,2,3,true, false, "no!")

// white for if
// (0 until 10).sum

val condition = false

condition match {
  //case "1" => 1
  //case "2" => 2
  case true => 1
  case _ => 8
}

val array1 = Array(1, 2,3)
val array2 = Array("a", 2, true)

val concatenated = "prepend" +: (array1 ++ array2) :+ "append"

val personArray = Array(("Alice", 1), ("Bob", 2), ("Carol", 3))

val x1 = 1
val y1 = "1"

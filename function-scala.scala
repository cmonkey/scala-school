def add(a: Int, b: Int) = a + b

var a = 1

def addA(b: Int) = a + b

def addP(a: Int, b: Int) = {
  
  println(s"a:$a b:$b")
  a + b
}

val r = scala.util.Random

def randInt() = r.nextInt()

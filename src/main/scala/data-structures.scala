val numbers = List(1, 2, 3, 4)

val set = Set(1,1,2)

val hostPort = ("localhost", 80)

hostPort match {
  case ("localhsot", port) => println(port)
  case (host, port) => println(host+port)
}

Map(1 -> Map("foo" -> "bar"))

trait Option[T]{
   def isDefined: Boolean
   def get: T
   def getOrElse(t: T): T
}


val numbers1 = Map("one" -> 1, "two" -> 2)

numbers1.get("two")

numbers1.get("three")

numbers.map((i: Int) => i * 2)

def timesTwo1(i: Int): Int = i * 2

numbers.map(timesTwo1 _)

numbers.foreach((i: Int) => i * 2)

val doubled = numbers.foreach((i: Int) => i * 2)

numbers.filter((i: Int) => i % 2 == 0)

def isEven(i: Int): Boolean = i %2 == 0


numbers.filter(isEven _)

List(1, 2, 3).zip(List("a", "b", "c"))

val numbers2 = List(1,2 ,3,4,5,6,7,8,9,10)

numbers2.partition(_ % 2 == 0)

numbers2.find((i: Int) => i > 5)

numbers2.drop(5)

numbers2.dropWhile(_ % 2 != 0)

numbers2.foldLeft(0)((m: Int, n: Int) => m + n)

numbers2.foldLeft(0) {
  (m: Int, n: Int) => println("m:" + m + " n: " + n);
  m + n
}

numbers2.foldRight(0){
  (m: Int, n: Int) => println("m: " + m + " n: " + n);
  m + n
}

List(List(1, 2), List(3, 4)).flatten

val nestedNumbers = List(List(1,2), List(3, 4))

nestedNumbers.flatMap(x => x.map(_ * 2))

nestedNumbers.map((x: List[Int]) => x.map(_ * 2)).flatten

def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
  numbers.foldRight(List[Int]()){
    (x: Int, xs: List[Int]) =>
      fn(x) :: xs
  }
}

ourMap(numbers2, timesTwo1(_))

val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)

extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)

extensions.filter({case (name, extension) => extension < 200})


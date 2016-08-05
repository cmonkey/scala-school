class Foo{}

object FooMaker{
  def apply() = new Foo
}

val newFoo = FooMaker()

class Bar{
  def apply() = 0
}

val bar = new Bar

bar()

object Timer{
 var count = 0
 def currentCount(): Long = {
  count += 1
  count
 }
}

Timer.currentCount()

class Bar2(foo: String)

object Bar2{
  def apply(foo: String) = new Bar2(foo)
}

/*
object addOne extends Function1(Int){
 def apply(m: Int): Int = m + 1
}

addOne(1)
*/



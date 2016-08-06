2 :: 1 :: "bar" :: "foo" :: Nil

def drop1[A](l:List[A]) = l.tail

drop1(List(1,2,3))

def toList[A](a: A) = List(a)

//def foo[A,B] (f: A => List[A], b: B) = f(b)

//def foo[A](f: A => List[A], i: Int) = f(i)
//

//{x => x}

def id[T] (x: T) = x

val x = id(322)

val x1 = id("hey")

val x2 = id(Array(1,2,3,4))

class Covariant[+A]

val cv: Covariant[AnyRef] =  new Covariant[String]

//val cv: Covariant[String] = new Covariant[AnyRef]

class Contravariant[-A]

val ct: Contravariant[String] = new Contravariant[AnyRef]

//val fail: Contravariant[AnyRef] = new Contravariant[String]

class Animal {
   val sound = "rustle"
}

class Bird extends Animal{
  override
  val sound = "call"
}

class Chicken extends Bird{
  override
  val sound = "cluck"
}

//val getTweet: (Bird => String) = //TODO

val getTweet: (Bird => String ) = ((a: Animal) => a.sound)

val hatch: (() => Bird) = (() => new Chicken)


//def cacophony[T](things: Seq[T]) = things map (_.sound)

def biophony[T <: Animal] (things: Seq[T]) = things map (_.sound)

biophony(Seq(new Chicken, new Bird))

val flock = List(new Bird, new Bird)

new Chicken :: flock

new Animal :: flock

def count[A](l: List[A]) = l.size

def count2(l: List[_]) = l.size

def count3(l: List[T forSome {type T}]) = l.size

def drop2(l: List[_]) = l.tail

def drop3(l: List[T forSome {type T}]) = l.tail

def hashcodes(l: Seq[_ <: AnyRef]) = l map (_.hashCode)


//hashcodes(Seq(1,2,3))

hashcodes(Seq("one", "two","three"))

class Rational (n: Int, d: Int){

  // precondition
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  var numer: Int = n / g
  var denom: Int = d / g

  // auxiliary constructor, 

  def this(n: Int) = this(n, 1)

  override def toString = n + "/" + d;

  def add(other: Rational): Rational =
    new Rational(numer * other.denom + other.numer * denom, denom * other.denom)

  def -(other: Rational): Rational =
    new Rational(numer * other.denom - other.numer * denom, denom * other.denom)

  def -(i: Int):Rational =
    new Rational(numer - i * denom, denom)

  def *(other: Rational):Rational=
    new Rational(numer * other.numer, denom * other.denom)

  def lessThan(other: Rational): Rational =
    this.numer * other.denom < other.numer - this.denom

  def max(other: Rational): Rational =
    if (lessThan(other)) other else this

  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)

}

var x = new Rational(1, 3)
var y = new Rational(5, 7)

println(x add y)
println(x * y)
println(x - 1)

implicit def inttoRational(x: Int) = new Rational(x)
println(1 - x)

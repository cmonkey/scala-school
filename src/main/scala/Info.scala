var x = 0
val y = 1

//(2.0).unary_-

//x indexOf 'o'

val xs = "Hello, World"

xs.toLowerCase


class Rational (n: Int, d: Int){
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  var numer: Int = n / g
  var denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString = n + "/" + d;

  def add(other: Rational): Rational =
    new Rational(numer * other.denom + other.numer * other.denom)

  def -(other: Rational): Rational =
    new Rational(numer * other.denom - other.numer * denom, denom * other.denom)

  def -(i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def *(other: Rational):Rational =
    new Rational(numer * other.numer, denom * other.denom)

  def lessThan(other: Rational): Boolean =
    this.numer * other.denom < other.numer * this.denom
  def max(other: Rational): Rational =
    if(lessThan(other)) other else this

  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)
}

var rx = new Rational(1, 3);
var ry = new Rational(5, 7);

println(rx add ry)
println(rx * ry)
println(rx - 1)

implicit def intToRational(x: Int) = new Rational(x)

println(1 - rx)

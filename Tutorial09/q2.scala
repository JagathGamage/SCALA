class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero.")
  
  private val gcdVal = gcd(n.abs, d.abs)
  val numerator: Int = n / gcdVal
  val denominator: Int = d / gcdVal
  
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  
  def neg: Rational = new Rational(-numerator, denominator)
  
  def -(other: Rational): Rational = {
    new Rational(
      numerator * other.denominator - other.numerator * denominator,
      denominator * other.denominator
    )
  }
  
  override def toString: String =
    if (denominator == 1) numerator.toString else s"$numerator/$denominator"
}

// Example usage
val x = new Rational(3, 4)
val y = new Rational(5, 8)
val z = new Rational(2, 7)

val result = x - y - z
println(s"x - y - z = $result")  // Output: x - y - z = 33/56

object t5q2 {
  def main(args: Array[String]): Unit = {
    primeSeq(20,2)
  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case x => GCD(x, a % x)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p) => true
    case x if GCD(p, x) > 1 => false
    case x => prime(p, x + 1)
  }
  def primeSeq(n:Int,l:Int): Unit = {

    if(l==n){
      return false
    }
    else if(prime(l)){
      println(l)
    }
    primeSeq(n, l+1)


  }
}

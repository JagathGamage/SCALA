object t5q6 {
  def main(args: Array[String]): Unit = {
    fibonacci(35,0,1)
  }
  def fibonacci(n:Int,a:Int,b:Int): Unit = {

    if(b>=n) {
      return 0
    }
    if(a==0)
      println(a)
    println(b)
    fibonacci(n,b,a+b)
  }
}

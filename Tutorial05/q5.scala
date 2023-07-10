object t5q5 {
  def main(args: Array[String]): Unit = {
    println(sumEven(9,2))
  }
  def sumEven(n:Int,l:Int): Int = {
    if(l>=n)
    {
      return 0
    }

    l+sumEven(n,l+2)



  }
}

object t8q1 {
  def main(args: Array[String]): Unit = {
    println(interest(350000).round)
  }
  val interest=(a:Int)=>if(a<20000)  a*0.02 else if(a<200000) a*0.04 else if(a<2000000) a*0.035 else a*0.06;

}

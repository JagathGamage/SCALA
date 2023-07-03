object t4q1 {
  def main(args: Array[String]): Unit = {
    println("Interest= ",interest(30000));
  }
  def interest(amount:Int):Double=amount match {
    case x if x<20000=>amount*0.02
    case x if x<200000=>amount*0.035
    case x if x<2000000=>amount*0.04
    case  x if x>2000000=>amount*0.065
  }
}

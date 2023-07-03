import scala.io.StdIn.readInt

object t4q2 {
    def main(args: Array[String]): Unit = {
      println("Enter number");
      var number=readInt();
      println(num(number))
    }

  def num(amount: Int): String = amount match {
    case x if x <=0 => "Negative or Zero is input"
    case x if x%2==0 => "Even Number"
    case x if x%2!=0 =>"Odd Number"
  }
}

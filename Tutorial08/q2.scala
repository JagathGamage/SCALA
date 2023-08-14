object t8q2 {
 def main(args: Array[String]): Unit = {
  println("Enter a number:")
  val number=scala.io.StdIn.readInt()
  println(matching(number))
 }
 val matching=(a:Int)=>if(a<=0) "Negative/Zero" else a%2 match {
  case 0=>"Even number is given"
  case _=>"Odd number is given"
 }

}

object t8q3 {
  def main(args: Array[String]): Unit = {
    println(formatNames(toLower,"JAGATH"))
    println(formatNames(toUpper,"jagath"))
  }
  val toUpper=(word:String)=>word.toUpperCase
  val toLower=(word:String)=>word.toLowerCase

  val formatNames=(f:(String)=>String,name:String)=>f(name)
}

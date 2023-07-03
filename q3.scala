object t4q3 {
     def main(args:Array[String]): Unit = {
       println(formatNames("Bob")(toUpper(_)))
       println(formatNames("JAGATH")(toLower(_)))

     }
  def toUpper(s:String): String = {
      s.toUpperCase()
  }

  def toLower(s: String): String = {
    s.toLowerCase()
  }
  def formatNames(name:String)(func:String=>String):String={
    func(name)
  }
}

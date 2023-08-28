object t10q1 {
  def calculateAverage(temperaturesCelsius: List[Int]): Double = {
    val temperaturesFahrenheit = temperaturesCelsius.map(c => (c * 9/5) + 32)
    val totalFahrenheit = temperaturesFahrenheit.reduce((a, b) => a + b)
    val averageFahrenheit = totalFahrenheit / temperaturesCelsius.length
    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    val temperaturesCelsius = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage((temperaturesCelsius))
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}

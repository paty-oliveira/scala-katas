object BerlinClockKata {
  val redLamp = "R"
  val offLamp = "O"
  val yellowLamp = "Y"

  def convertToBerlinTime(time: String): Array[String] = {
    val parsedTime: Array[Int] = parseTime(time)

    val hours: Int = parsedTime(0)
    val minutes: Int = parsedTime(1)
    val second: Int = parsedTime(2)

    Array(
      seconds(second),
      topHours(hours),
      bottomHours(hours),
      topMinutes(minutes),
      bottomMinutes(minutes)
    )
  }

  def parseTime(time: String): Array[Int] = {
    time.split(":").map(_.toInt)
  }

  def onOrOff(lamps: Int, onLamp: Int, lampColor: String = redLamp): String = {
    lampColor * onLamp + offLamp * (lamps - onLamp)
  }

  def seconds(number: Int): String = {
    number % 2 match {
      case 0 => yellowLamp
      case _ => offLamp
    }
  }

  def topHours(number: Int): String = {
    number / 5 match {
      case i if i > 0 => onOrOff(4, number / 5)
      case _ => "OOOO"
    }
  }

  def bottomHours(number: Int): String = {
    number % 5 match {
      case i if i > 0 => onOrOff(4, number % 5)
      case _ => "OOOO"
    }
  }

  def topMinutes(number: Int): String = {
    var status = ""
    val numberLamps = number / 5

    for (i <- 1 to 11){
      if (i <= numberLamps){
        status += redOrYellowLamp(i)
      }
      else {
        status += offLamp
      }
    }
    status
  }

  def bottomMinutes(number: Int): String = {
    number % 5 match {
      case i if i > 0 => onOrOff(4, number % 5, yellowLamp)
      case _ => "OOOO"
    }
  }

  def redOrYellowLamp(lampNumber: Int): String = {
    lampNumber % 3 match {
      case 0 => redLamp
      case _ => yellowLamp
    }
  }
}

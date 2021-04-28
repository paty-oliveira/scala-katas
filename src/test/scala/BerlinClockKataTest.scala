import org.scalatest.funsuite.AnyFunSuite

class BerlinClockKataTest extends AnyFunSuite{

  test("Should return a result array with 13, 17 and 1 elements"){
    val inputTime = "13:17:01"
    val expectedResult = Array(13, 17, 1)

    BerlinClockKata.parseTime(inputTime) sameElements expectedResult
  }

  test("Seconds lamp should have 1 lamp"){
    var inputSeconds = 2
    var expectedResult = 1

    BerlinClockKata.seconds(inputSeconds) lengthCompare expectedResult
  }

  test("Seconds lamp should blink on/off every two seconds"){
    var inputSeconds = 0
    var expectedResult = "Y"
    assert(BerlinClockKata.seconds(inputSeconds) == expectedResult)

    inputSeconds = 1
    expectedResult = "O"
    assert(BerlinClockKata.seconds(inputSeconds) == expectedResult)

    inputSeconds = 20
    expectedResult = "Y"
    assert(BerlinClockKata.seconds(inputSeconds) == expectedResult)

    inputSeconds = 59
    expectedResult = "O"
    assert(BerlinClockKata.seconds(inputSeconds) == expectedResult)
  }

  test("Top hours should have 4 lamps"){
    val inputHours = 7
    val expectedResult = 4

    BerlinClockKata.topHours(inputHours) lengthCompare expectedResult
  }

  test("Should light a red lamp for every 5 hours"){
    var inputTopHours = 0
    var expectedResult = "OOOO"
    assert(BerlinClockKata.topHours(inputTopHours) == expectedResult)

    inputTopHours = 13
    expectedResult = "RROO"
    assert(BerlinClockKata.topHours(inputTopHours) == expectedResult)

    inputTopHours = 23
    expectedResult = "RRRR"
    assert(BerlinClockKata.topHours(inputTopHours) == expectedResult)

    inputTopHours = 24
    expectedResult = "RRRR"
    assert(BerlinClockKata.topHours(inputTopHours) == expectedResult)
  }

  test("Bottom hours should have 4 lamps"){
    val inputHours = 5
    val expectedResult = 4

    BerlinClockKata.bottomHours(inputHours) lengthCompare expectedResult
  }

  test("Should light a red lamp fo every hour left from top hours"){
    var inputBottomHours = 0
    var expectedResult = "OOOO"
    assert(BerlinClockKata.bottomHours(inputBottomHours) == expectedResult)

    inputBottomHours = 13
    expectedResult = "RRRO"
    assert(BerlinClockKata.bottomHours(inputBottomHours) == expectedResult)

    inputBottomHours = 23
    expectedResult = "RRRO"
    assert(BerlinClockKata.bottomHours(inputBottomHours) == expectedResult)

    inputBottomHours = 24
    expectedResult = "RRRR"
    assert(BerlinClockKata.bottomHours(inputBottomHours) == expectedResult)
  }

  test("Top minutes should have 11 lamps"){
    val inputMinutes = 34
    val expectedResult = 11

    BerlinClockKata.topMinutes(inputMinutes) lengthCompare expectedResult
  }

  test("Should light a yellow lamp for every 5 minutos from top minutes"){
    var inputTopMinutes = 0
    var expectedResult = "OOOOOOOOOOO"
    assert(BerlinClockKata.topMinutes(inputTopMinutes) == expectedResult)

    inputTopMinutes = 17
    expectedResult = "YYROOOOOOOO"
    assert(BerlinClockKata.topMinutes(inputTopMinutes) == expectedResult)

    inputTopMinutes = 59
    expectedResult = "YYRYYRYYRYY"
    assert(BerlinClockKata.topMinutes(inputTopMinutes) == expectedResult)
  }

  test("Bottom minutes should have 4 lamps"){
    val inputMinutes = 0
    val expectedResult = 4

    BerlinClockKata.bottomMinutes(inputMinutes) lengthCompare expectedResult
  }

  test("Should light a yellow lamp for very minute left from top minutes"){
    var inputBottomMinutes = 0
    var expectedResult = "OOOO"
    assert(BerlinClockKata.bottomMinutes(inputBottomMinutes) == expectedResult)

    inputBottomMinutes = 17
    expectedResult = "YYOO"
    assert(BerlinClockKata.bottomMinutes(inputBottomMinutes) == expectedResult)

    inputBottomMinutes = 59
    expectedResult = "YYYY"
    assert(BerlinClockKata.bottomMinutes(inputBottomMinutes) == expectedResult)
  }

  test("Berlin Clock should result in array with 5 elements"){
    val time = "13:17:01"
    val expectedResult = 5

    BerlinClockKata.convertToBerlinTime(time) lengthCompare expectedResult
  }

  test("Should result in correct seconds, hours and minutes"){
    val time = "16:37:16"
    val berlinTime = BerlinClockKata.convertToBerlinTime(time)
    val expectedResult = Array("Y", "RRRO", "ROOO", "YYRYYRYOOOO", "YYOO")

    berlinTime sameElements expectedResult
  }
}

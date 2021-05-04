import org.scalatest.funsuite.AnyFunSuite

class TennisGameKataTest extends AnyFunSuite{
  val player1 = new Player("Patricia")
  val player2 = new Player("Tiago")

  test("Should return the name of the players"){
    var expectedResult = "Patricia"
    assert(player1.getName == expectedResult)

    expectedResult = "Tiago"
    assert(player2.getName == expectedResult)
  }

  test("Should return the number of points of players"){
    val expectedResult = 0
    assert(player1.getPoints == expectedResult)
    assert(player2.getPoints == expectedResult)
  }

  test("Should return the score of player1"){
    player1.winBall
    var expectedResult = 1
    assert(player1.getPoints == expectedResult)

    player1.winBall
    expectedResult = 2
    assert(player1.getPoints == expectedResult)
  }

  test("Should return the score of player2"){
    player2.winBall
    var expectedResult = 1
    assert(player2.getPoints == expectedResult)

    player2.winBall
    expectedResult = 2
    assert(player2.getPoints == expectedResult)

    player2.winBall
    expectedResult = 3
    assert(player2.getPoints == expectedResult)
  }
}

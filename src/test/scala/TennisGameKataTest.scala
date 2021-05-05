import org.scalatest.funsuite.AnyFunSuite

class TennisGameKataTest extends AnyFunSuite{

  test("Should return the name of the players"){
    val player1 = new Player("Patricia")
    val player2 = new Player("Tiago")

    var expectedResult = "Patricia"
    assert(player1.getName == expectedResult)

    expectedResult = "Tiago"
    assert(player2.getName == expectedResult)
  }

  test("Should return the number of points of players"){
    val player1 = new Player("Patricia")
    val player2 = new Player("Tiago")

    val expectedResult = 0
    assert(player1.getPoints == expectedResult)
    assert(player2.getPoints == expectedResult)
  }

  test("Should return the score of player1"){
    val player1 = new Player("Patricia")
    player1.winBall

    var expectedResult = 1
    assert(player1.getPoints == expectedResult)

    player1.winBall
    expectedResult = 2
    assert(player1.getPoints == expectedResult)
  }

  test("Should return the score of player2"){
    val player2 = new Player("Tiago")
    var expectedResult = 1

    player2.winBall
    assert(player2.getPoints == expectedResult)

    expectedResult = 2
    player2.winBall
    assert(player2.getPoints == expectedResult)

    expectedResult = 3
    player2.winBall
    assert(player2.getPoints == expectedResult)
  }

  test("Should return the (love, love) as score of the game"){
    val player1 = new Player("Patricia")
    val player2 = new Player("Tiago")
    val game = new TennisGame(player1, player2)
    val expectedResult = ("love", "love")

    assert(game.score == expectedResult)
  }

  test("Should return (love, fifteen) as score of the game"){
    val player1 = new Player("Patricia")
    val player2 = new Player("Tiago")
    val game = new TennisGame(player1, player2)
    val expectedResult = ("love", "fifteen")

    player2.winBall
    assert(game.score == expectedResult)
  }

  test("Should return (thirty, fifteen) as score of the game"){
    val player1 = new Player("Patricia")
    val player2 = new Player("Tiago")
    val game = new TennisGame(player1, player2)
    val expectedResult = ("thirty", "fifteen")

    player1.winBall
    player1.winBall
    player2.winBall
    assert(game.score == expectedResult)
  }

  test("Should return (forty, love) as score of the game"){
    val player1 = new Player("Patricia")
    val player2 = new Player("Tiago")
    val game = new TennisGame(player1, player2)
    val expectedResult = ("forty", "love")

    (1 to 3).foreach( x => player1.winBall)
    assert(game.score == expectedResult)
  }

  test("Should return Deuce to describe if at least three points have been scored," +
    "and the scores are equal"){
    val player1 = new Player("Patricia")
    val player2 = new Player("Tiago")
    val game = new TennisGame(player1, player2)
    val expectedResult = "deuce"

    (1 to 3).foreach(x => player1.winBall)
    (1 to 3).foreach(x => player2.winBall)
    assert(game.scoreCompare == expectedResult)
  }

  test("The player should have advantage when at least three points have been scored" +
    "and has a difference of one or more point than his opponent"
  ){
    val player1 = new Player("Patricia")
    val player2 = new Player("Tiago")
    val game = new TennisGame(player1, player2)
    val expectedResult = "advantage Tiago"

    (1 to 3).foreach(x => player1.winBall)
    (1 to 4).foreach(x => player2.winBall)
    assert(game.scoreCompare == expectedResult)
  }

  test("The game should be won by the first player to have won at least four points in " +
    "total and with at least two points more than the opponent "){
    val player1 = new Player("Patricia")
    val player2 = new Player("Tiago")
    val game = new TennisGame(player1, player2)
    val expectedResult = "Patricia won"

    (1 to 7).foreach(x => player1.winBall)
    (1 to 2).foreach(x => player2.winBall)
    assert(game.scoreCompare == expectedResult)
  }
}

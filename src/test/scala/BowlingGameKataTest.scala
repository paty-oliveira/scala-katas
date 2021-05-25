import org.scalatest.funsuite.AnyFunSuite

class BowlingGameKataTest extends AnyFunSuite {

  test("Bowling game without any pin knocked with score 0"){
    val game = new BowlingGame
    val expectedScore = 0

    (1 until 20).foreach(g => game.roll(0))

    assert(game.getScore == expectedScore)
  }


  test("The score should be 16 emulating a spare"){
    val game = new BowlingGame
    val expectedScore = 16

    game.roll(5)
    game.roll(5) //spare
    game.roll(3)

    assert(game.getScore == expectedScore)
  }

  test("The score should be 24 emulating a strike") {
    val game = new BowlingGame
    val expectedScore = 10

    game.roll(10)
    game.roll(3)
    game.roll(4)

    assert(game.getScore == expectedScore)
  }
}

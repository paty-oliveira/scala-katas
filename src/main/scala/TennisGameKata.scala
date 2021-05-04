object TennisGameKata {
}

class Player (val name: String) {

  val playerName: String = name
  var score: Int = 0

  def getName: String = {
    this.playerName
  }

  def getPoints: Int = {
    this.score
  }

  def winBall(): Unit = {
    this.score+=1
  }
}

class TennisGame(val playerName1: Player, val playerName2: Player) {

  val player1: Player = playerName1
  val player2: Player = playerName2

}

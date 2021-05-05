class TennisGame(val playerName1: Player, val playerName2: Player) {

  val player1: Player = playerName1
  val player2: Player = playerName2
  val pointsInformation: Map[Int, String] = Map(0 -> "love", 1 -> "fifteen", 2 -> "thirty", 3 -> "forty")

  def score: (String, String) = {
    (pointsInformation(this.player1.getPoints), pointsInformation(this.player2.getPoints))
  }

  def scoreCompare: String = {
    val playersInformation: Map[String, Int] = Map(this.player1.name -> this.player1.getPoints,
                                                  this.player2.name -> this.player2.getPoints)
    val leadPlayer = playersInformation.maxBy(_._2)._1
    var gameStatus = ""

    if (this.player1.getPoints >= 3 && this.player2.getPoints >= 3) {
      if (this.player1.getPoints == this.player2.getPoints) {
        gameStatus = "deuce"
      }
      if (scoreDifference(this.player1.getPoints, this.player2.getPoints) >= 1) {
        gameStatus = "advantage " + leadPlayer
      }
    }

    if (this.player1.getPoints >= 4 || this.player2.getPoints >= 4) {
      if (scoreDifference(this.player1.getPoints, this.player2.getPoints) >= 2) {
        gameStatus = leadPlayer + " won"
      }
    }
    gameStatus
  }

  def scoreDifference(player1Score: Int, player2Score: Int): Int ={
    Math.abs(player1Score - player2Score)
  }
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

  def winBall: Unit = {
    this.score+=1
  }
}
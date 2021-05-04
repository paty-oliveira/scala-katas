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

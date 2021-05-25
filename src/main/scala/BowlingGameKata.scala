class BowlingGame{

  var rolls: Array[Int] = new Array[Int](20)
  var currentRoll: Int = 0

  def roll(pins: Int): Unit = {
    this.rolls(this.currentRoll) = pins
    this.currentRoll += 1
  }

  def getScore: Int = {
    var score = 0
    var frameIndex = 0

    while (frameIndex < 10){
      if (isStrike(frameIndex)){
        score += 10 + strikeBonus(frameIndex)
        frameIndex += 2
      }

      else if (isSpare(frameIndex)){
        score += 10 + spareBonus(frameIndex)
        frameIndex += 2

      }else {
        score += sumBallsInFrame(frameIndex)
        frameIndex += 2
      }
    }
    score
  }

  def isSpare(frameIndex: Int): Boolean = {
    this.rolls(frameIndex) + this.rolls(frameIndex + 1) == 10
  }

  def isStrike(frameIndex: Int): Boolean = {
    this.rolls(frameIndex) == 10
  }

  def sumBallsInFrame(frameIndex: Int): Int = {
    this.rolls(frameIndex) + this.rolls(frameIndex + 1)
  }

  def spareBonus(frameIndex: Int): Int = {
    this.rolls(frameIndex + 2)
  }

  def strikeBonus(frameIndex: Int): Int = {
    this.rolls(frameIndex + 1) + this.rolls(frameIndex + 2)
  }
}

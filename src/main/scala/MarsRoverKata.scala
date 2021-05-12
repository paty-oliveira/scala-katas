class Point(val x: Int, val y: Int) {

  val coordinateX: Int = x
  val coordinateY: Int = y

  def getCoordinateX: Int = {
    this.coordinateX
  }

  def getCoordinateY: Int = {
    this.coordinateY
  }
}

class Rover(val coordinates: Point, val direction: String) {

  var coordinateX: Int = coordinates.getCoordinateX
  var coordinateY: Int = coordinates.getCoordinateY
  var orientation: String = direction

  def getXLocation: Int = {
    this.coordinateX
  }

  def getYLocation: Int = {
    this.coordinateY
  }

  def getDirection: String = {
    this.orientation
  }

  def sendCommands(command: String): Unit = {
    if (this.orientation == "E" && command == "f") this.coordinateX += 1
    if (this.orientation == "E" && command == "b") this.coordinateX -= 1
    if (this.orientation == "W" && command == "f") this.coordinateX += 1
    if (this.orientation == "W" && command == "b") this.coordinateX -= 1
    if (this.orientation == "N" && command == "f") this.coordinateY += 1
    if (this.orientation == "N" && command == "b") this.coordinateY -= 1
    if (this.orientation == "S" && command == "f") this.coordinateY += 1
    if (this.orientation == "S" && command == "b") this.coordinateY -= 1
    if (this.orientation == "N" && command == "l") this.orientation = "W"
  }
}

class Planet(val coordinates: Point) {

  val coordinateX: Int = coordinates.getCoordinateX
  val coordinateY: Int = coordinates.getCoordinateY

  def getXLocation: Int = {
    this.coordinateX
  }

  def getYLocation: Int = {
    this.coordinateY
  }
}

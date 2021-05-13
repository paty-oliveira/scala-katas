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

class Rover(val coordinates: Point, val direction: String, val planetCoordinates: Planet) {

  var coordinateX: Int = coordinates.getCoordinateX
  var coordinateY: Int = coordinates.getCoordinateY
  var orientation: String = direction
  val planet: Planet = planetCoordinates

  def getXLocation: Int = {
    this.coordinateX
  }

  def getYLocation: Int = {
    this.coordinateY
  }

  def getDirection: String = {
    this.orientation
  }

  def sendCommands(command: String): String = {
    val parsedCommands = command.toArray
    var message = "OK: "

    for (command <- parsedCommands) {
      if (this.orientation == "E" && command == 'f') this.coordinateX += 1
      if (this.orientation == "E" && command == 'b') this.coordinateX -= 1
      if (this.orientation == "W" && command == 'f') this.coordinateX += 1
      if (this.orientation == "W" && command == 'b') this.coordinateX -= 1
      if (this.orientation == "N" && command == 'f') this.coordinateY += 1
      if (this.orientation == "N" && command == 'b') this.coordinateY -= 1
      if (this.orientation == "S" && command == 'f') this.coordinateY += 1
      if (this.orientation == "S" && command == 'b') this.coordinateY -= 1
      if (this.orientation == "N" && command == 'l') this.orientation = "W"
      if (this.orientation == "N" && command == 'r') this.orientation = "E"
      if (this.orientation == "S" && command == 'l') this.orientation = "W"
      if (this.orientation == "S" && command == 'r') this.orientation = "E"
      if (this.orientation == "E" && command == 'l') this.orientation = "S"
      if (this.orientation == "E" && command == 'r') this.orientation = "N"
      if (this.orientation == "W" && command == 'l') this.orientation = "N"
      if (this.orientation == "W" && command == 'r') this.orientation = "S"
    }
    if (this.coordinateX <= planet.coordinateX || this.coordinateY <= planet.coordinateY){
      message = "NOK: " + command
      return message
    }
    message + command
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

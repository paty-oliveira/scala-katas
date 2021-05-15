class Point(val x: Int, val y: Int) {

  val coordinateX: Int = x
  val coordinateY: Int = y

  def getXCoordinate: Int = {
    this.coordinateX
  }

  def getYCoordinate: Int = {
    this.coordinateY
  }
}

class Rover(val coordinates: Point, val direction: String, val planetCoordinates: Planet) {

  var coordinateX: Int = coordinates.getXCoordinate
  var coordinateY: Int = coordinates.getYCoordinate
  var orientation: String = direction
  val planet: Planet = planetCoordinates
  val moveDirection: Map[(String, String), String] = Map(("N", "l") -> "W",
                                                        ("N", "r") -> "E",
                                                        ("S", "l") -> "W",
                                                        ("S", "r") -> "E",
                                                        ("W", "l") -> "N",
                                                        ("W", "r") -> "S",
                                                        ("E", "l") -> "S",
                                                        ("E", "r") -> "N")

  def getXCoordinate: Int = {
    this.coordinateX
  }

  def getYCoordinate: Int = {
    this.coordinateY
  }

  def getDirection: String = {
    this.orientation
  }

  def sendCommands(command: String): String = {
    var message = "OK: "

    for (command <- command.toArray) {
      command.toLower match {
        case 'f' => moveForward()
        case 'b' => moveBackward()
        case 'l' => moveLeft()
        case 'r' => moveRight()
      }
    }
    if (this.coordinateX <= this.planet.coordinateX || this.coordinateY <= this.planet.coordinateY){
      message = "NOK: " + command
      return message
    }
    message + command
    }

  def moveForward(): Unit = {
    this.orientation match {
      case "N" | "S" => this.coordinateY += 1
      case "W" | "E" => this.coordinateX += 1
    }
  }

  def moveBackward(): Unit = {
    this.orientation match {
      case "N" | "S" => this.coordinateY -= 1
      case "W" | "E" => this.coordinateX -= 1
    }
  }

  def moveLeft(): Unit = {
    this.orientation = moveDirection(this.orientation, "l")
  }

  def moveRight(): Unit = {
    this.orientation = moveDirection(this.orientation, "r")
  }
}

class Planet(val coordinates: Point) {

  val coordinateX: Int = coordinates.getXCoordinate
  val coordinateY: Int = coordinates.getYCoordinate

  def getXCoordinate: Int = {
    this.coordinateX
  }

  def getYCoordinate: Int = {
    this.coordinateY
  }
}

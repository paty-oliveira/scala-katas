import org.scalatest.funsuite.AnyFunSuite

class MarsRoverKataTest extends AnyFunSuite{

  test("Point can accept coordinate X and coordinate Y"){
    val p1 = new Point(2, 3)
    val coordinateX = 2
    val coordinateY = 3

    assert(p1.getCoordinateX == coordinateX)
    assert(p1.getCoordinateY == coordinateY)
  }

  test("Rover should accept the starting point and the direction"){
    val p1 = new Point(12, 42)
    val p2 = new Point(0, 0)
    val planet = new Planet(p2)
    val direction = "E"
    val rover = new Rover(p1, direction, planet)
    val expectedXCoordinate = 12
    val expectedYCoordinate = 42

    assert(rover.getXLocation == expectedXCoordinate)
    assert(rover.getYLocation == expectedYCoordinate)
    assert(rover.getDirection == direction)
  }

  test("Planet should define its size and orientation in space"){
    val p1 = new Point(5, 6)
    val planet = new Planet(p1)
    val expectedXCoordinate = 5
    val expectedYCoordinate = 6

    assert(planet.getXLocation == expectedXCoordinate)
    assert(planet.getYLocation == expectedYCoordinate)
  }

  test("The rover should be able to move forward in X axis"){
    val p1 = new Point(12, 42)
    val p2 = new Point(0, 0)
    val planet = new Planet(p2)
    var direction = "E"
    val rover = new Rover(p1, direction, planet)

    val expectedXCoordinate = 13
    val expectedYCoordinate = 42
    val command = "f"
    rover.sendCommands(command)

    assert(rover.getXLocation == expectedXCoordinate)
    assert(rover.getYLocation == expectedYCoordinate)

    direction = "W"
    val rover2 = new Rover(p1, direction, planet)
    rover2.sendCommands(command)

    assert(rover2.getXLocation == expectedXCoordinate)
    assert(rover2.getYLocation == expectedYCoordinate)
  }

  test("The rover should be able to move backward in X axis"){
    val p1 = new Point(12, 42)
    val p2 = new Point(0, 0)
    val planet = new Planet(p2)
    var direction = "E"
    val rover1 = new Rover(p1, direction, planet)

    val expectedXCoordinate = 11
    val expectedYCoordinate = 42
    val command = "b"
    rover1.sendCommands(command)

    assert(rover1.getXLocation == expectedXCoordinate)
    assert(rover1.getYLocation == expectedYCoordinate)

    direction = "W"
    val rover2 = new Rover(p1, direction, planet)
    rover2.sendCommands(command)

    assert(rover2.getXLocation == expectedXCoordinate)
    assert(rover2.getYLocation == expectedYCoordinate)

  }

  test("The rover should be able to move forward in Y axis"){
    val p1 = new Point(12, 42)
    val p2 = new Point(0, 0)
    val planet = new Planet(p2)
    var direction = "N"
    val rover1 = new Rover(p1, direction, planet)

    val expectedYCoordinate = 43
    val expectedXCoordinate = 12
    val command = "f"
    rover1.sendCommands(command)

    assert(rover1.getXLocation == expectedXCoordinate)
    assert(rover1.getYLocation == expectedYCoordinate)

    direction = "S"
    val rover2 = new Rover(p1, direction, planet)
    rover2.sendCommands(command)

    assert(rover2.getXLocation == expectedXCoordinate)
    assert(rover2.getYLocation == expectedYCoordinate)
  }

  test("The rover should be able to move backward in Y axis"){
    val p1 = new Point(12, 42)
    val p2 = new Point(0, 0)
    val planet = new Planet(p2)
    var direction = "N"
    val rover1 = new Rover(p1, direction, planet)

    val expectedYCoordinate = 41
    val expectedXCoordinate = 12
    val command = "b"
    rover1.sendCommands(command)

    assert(rover1.getXLocation == expectedXCoordinate)
    assert(rover1.getYLocation == expectedYCoordinate)

    direction = "S"
    val rover2 = new Rover(p1, direction, planet)
    rover2.sendCommands(command)

    assert(rover2.getXLocation == expectedXCoordinate)
    assert(rover2.getYLocation == expectedYCoordinate)
  }

  test("Should be able to receive an array of commands to change position and direction"){
    val p1 = new Point(12, 42)
    val p2 = new Point(0, 0)
    val planet = new Planet(p2)
    val direction = "E"
    val rover = new Rover(p1, direction, planet)
    val command = "flf"

    val expectedXCoordinate = 13
    val expectedYCoordinate = 43
    rover.sendCommands(command)

    assert(rover.getXLocation == expectedXCoordinate)
    assert(rover.getYLocation == expectedYCoordinate)
  }

  test("Should be able to receive an array of commands to change position"){
    val p1 = new Point(1, 1)
    val p2 = new Point(0, 0)
    val planet = new Planet(p2)
    val direction = "E"
    val rover = new Rover(p1, direction, planet)
    val command = "fff"

    val expectedXCoordinate = 4
    val expectedYCoordinate = 1
    rover.sendCommands(command)
    assert(rover.getXLocation == expectedXCoordinate)
    assert(rover.getYLocation == expectedYCoordinate)
  }

  test("Should be able to report NOK if no obstacle was found"){
    val p1 = new Point(1, 1)
    val p2 = new Point(3, 3)
    val planet = new Planet(p2)
    val direction = "E"
    val rover = new Rover(p1, direction, planet)
    val command = "fff"
    val expectedResponse = "NOK: fff"

    assert(rover.sendCommands(command) == expectedResponse)
  }

  test("Should be able to report OK if no obstacle was found"){
    val p1 = new Point(12, 42)
    val p2 = new Point(3, 3)
    val planet = new Planet(p2)
    val direction = "E"
    val rover = new Rover(p1, direction, planet)
    val command = "ffffff"
    val expectedResponse= "OK: ffffff"

    assert(rover.sendCommands(command) == expectedResponse)
  }
}

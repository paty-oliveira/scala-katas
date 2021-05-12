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
    val direction = "E"
    val rover = new Rover(p1, direction)
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
    var direction = "E"
    val rover = new Rover(p1, direction)

    val expectedXCoordinate = 13
    val expectedYCoordinate = 42
    val command = "f"
    rover.sendCommands(command)

    assert(rover.getXLocation == expectedXCoordinate)
    assert(rover.getYLocation == expectedYCoordinate)

    direction = "W"
    val rover2 = new Rover(p1, direction)
    rover2.sendCommands(command)

    assert(rover2.getXLocation == expectedXCoordinate)
    assert(rover2.getYLocation == expectedYCoordinate)
  }

  test("The rover should be able to move backward in X axis"){
    val p1 = new Point(12, 42)
    var direction = "E"
    val rover1 = new Rover(p1, direction)

    val expectedXCoordinate = 11
    val expectedYCoordinate = 42
    val command = "b"
    rover1.sendCommands(command)

    assert(rover1.getXLocation == expectedXCoordinate)
    assert(rover1.getYLocation == expectedYCoordinate)

    direction = "W"
    val rover2 = new Rover(p1, direction)
    rover2.sendCommands(command)

    assert(rover2.getXLocation == expectedXCoordinate)
    assert(rover2.getYLocation == expectedYCoordinate)

  }

  test("The rover should be able to move forward in Y axis"){
    val p1 = new Point(12, 42)
    var direction = "N"
    val rover1 = new Rover(p1, direction)

    val expectedYCoordinate = 43
    val expectedXCoordinate = 12
    val command = "f"
    rover1.sendCommands(command)

    assert(rover1.getXLocation == expectedXCoordinate)
    assert(rover1.getYLocation == expectedYCoordinate)

    direction = "S"
    val rover2 = new Rover(p1, direction)
    rover2.sendCommands(command)

    assert(rover2.getXLocation == expectedXCoordinate)
    assert(rover2.getYLocation == expectedYCoordinate)
  }

  test("The rover should be able to move backward in Y axis"){
    val p1 = new Point(12, 42)
    var direction = "N"
    val rover1 = new Rover(p1, direction)

    val expectedYCoordinate = 41
    val expectedXCoordinate = 12
    val command = "b"
    rover1.sendCommands(command)

    assert(rover1.getXLocation == expectedXCoordinate)
    assert(rover1.getYLocation == expectedYCoordinate)

    direction = "S"
    val rover2 = new Rover(p1, direction)
    rover2.sendCommands(command)

    assert(rover2.getXLocation == expectedXCoordinate)
    assert(rover2.getYLocation == expectedYCoordinate)
  }

  test("The rover should be able to turn left"){
    val p1 = new Point(12, 42)
    val direction = "N"
    val rover = new Rover(p1, direction)

    val expectedDirection = "W"
    val command = "l"
    rover.sendCommands(command)

    assert(rover.getDirection == expectedDirection)
  }
}

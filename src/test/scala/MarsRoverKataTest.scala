import org.scalatest.funsuite.AnyFunSuite

class MarsRoverKataTest extends AnyFunSuite{

  test("Point can accept coordinate X and coordinate Y"){
    val p1 = new Point(2, 3)
    val coordinateX = 2
    val coordinateY = 3

    assert(p1.getXCoordinate == coordinateX)
    assert(p1.getYCoordinate == coordinateY)
  }

  test("Rover should accept the starting point and the direction"){
    val p1 = new Point(12, 42)
    val p2 = new Point(0, 0)
    val planet = new Planet(p2)
    val direction = "E"
    val rover = new Rover(p1, direction, planet)
    val expectedXCoordinate = 12
    val expectedYCoordinate = 42

    assert(rover.getXCoordinate == expectedXCoordinate)
    assert(rover.getYCoordinate == expectedYCoordinate)
    assert(rover.getDirection == direction)
  }

  test("Planet should define its size and orientation in space"){
    val p1 = new Point(5, 6)
    val planet = new Planet(p1)
    val expectedXCoordinate = 5
    val expectedYCoordinate = 6

    assert(planet.getXCoordinate == expectedXCoordinate)
    assert(planet.getYCoordinate == expectedYCoordinate)
  }


  test("Rover should be able to move forward"){
    val p1 = new Point(1, 1)
    val p2 = new Point(3, 3)
    val planet = new Planet(p2)
    val direction = "S"
    val rover = new Rover(p1, direction, planet)

    val expectedXCoordinate = 1
    val expectedYCoordinate = 2
    rover.moveForward()

    assert(rover.getXCoordinate == expectedXCoordinate)
    assert(rover.getYCoordinate == expectedYCoordinate)
  }

  test("Rover should be able to move backward"){
    val p1 = new Point(10, 15)
    val p2 = new Point(3, 3)
    val planet = new Planet(p2)
    val direction = "W"
    val rover = new Rover(p1, direction, planet)

    val expectedXCoordinate = 9
    val expectedYCoordinate = 15
    rover.moveBackward()

    assert(rover.getXCoordinate == expectedXCoordinate)
    assert(rover.getYCoordinate == expectedYCoordinate)
  }

  test("Rover should be able to move left"){
    val p1 = new Point(10, 15)
    val p2 = new Point(3, 3)
    val planet = new Planet(p2)
    val direction = "W"
    val rover = new Rover(p1, direction, planet)

    val expectedDirection = "N"
    rover.moveLeft()

    assert(rover.getDirection == expectedDirection)
  }

  test("Rover should be able to move right"){
    val p1 = new Point(10, 15)
    val p2 = new Point(3, 3)
    val planet = new Planet(p2)
    val direction = "W"
    val rover = new Rover(p1, direction, planet)

    val expectedDirection = "S"
    rover.moveRight()

    assert(rover.getDirection == expectedDirection)
  }
  
  test("Rover should be able to receive an array of commands to change position"){
    val p1 = new Point(1, 1)
    val p2 = new Point(0, 0)
    val planet = new Planet(p2)
    val direction = "E"
    val rover = new Rover(p1, direction, planet)
    val command = "fff"

    val expectedXCoordinate = 4
    val expectedYCoordinate = 1
    rover.sendCommands(command)
    assert(rover.getXCoordinate == expectedXCoordinate)
    assert(rover.getYCoordinate == expectedYCoordinate)
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

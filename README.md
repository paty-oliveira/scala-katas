## Scala Tutorial Through Katas

A programming kata is an exercise which helps a programmer hone his skills through practice and repetition. 
A main goal of this katas is improve the Scala programming skills.

The implementation of these katas follows the methodology of **Test-Driven Development** (TDD) based on ScalaTest tool.

The list of katas was based on https://technologyconversations.com/2014/03/10/scala-tutorial-through-katas/

### Katas

- [Fizz Buzz](src/main/scala/FizzBuzzKata.scala)
  
  For a given natural number greater than zero return:
    - “fizz” if the number is dividable by 3
    - “buzz” if the number is dividable by 5
    - “fizzbuzz” if the number is dividable by 15
    - the same number if no other requirement is fulfilled
    

- [Berlin Clock](src/main/scala/BerlinClockKata.scala)
  
    The Berlin Clock is composed of four rows of lights and a yellow lamp on the top.
    - The top yellow light blinks every couple of seconds (on for even seconds, off for odd seconds). 
      
    - The top two rows represent hours. The lights on the top row represent five hours each, while the bottom row lamps
    represent one hour each.
    - The bottom two rows represent minutes. Again, each third-row lamp represents five minutes, so there are 11 of them.
    
    Each bottom row lamp represents one minute.
    
    The lamps are switched on from left to right. 
    - Y = Yellow
    - R = Red
    - O = Off
  

- [Prime Factors](src/main/scala/PrimeFactorsKata.scala)
  
    Compute the factors of a given natural number.


- [Tennis Game](src/main/scala/TennisGameKata.scala)
  
    Implement a simple tennis game.
    
  **Rules:**
  - Scores from zero to three points are described as "love", "fifteen", "thirty", and "forty".
  - If at least three points have been scored by each side and a player has one more point than
      his opponent, the score of the game is "advantage" for the player in the lead.
    
  - If at least three points have been scored by each player, and the score are equal, the score
      is "deuce".
    
  - A game is won by the first player when have at least four points in total, and at least two points
      more than the opponent.


- [String Permutations](src/main/scala/StringPermutationKata.scala)
  
  Create a program that returns all permutations of a given string.
  

- [Word Wrap](src/main/scala/WordWrapKata.scala)
  
  Implement a program that takes two arguments, a string and a column number.  
  
  - The function returns a string, but with line breaks inserted at just the right places to make sure that no line
  is longer than the column number.
    
  - Like a word processor, break the line by replacing the last space in a line with newline.
 
  - Solution can assume that no word is longer than the maximum number characters in a line.


- [Mars Rover](src/main/scala/MarsRoverKata.scala)
  
  Develop an API that moves a rover around on a grid.
  
  - You are given the initial starting point (x, y) of a rover and the direction (N, S, E, W) it is facing.
  
  - The rover receives a character array of commands.
  
  - Implement commands that move the rover forward/backward (f, b).
  
  - Implement commands that turn the rover left/right (l, r).
  
  - Implement wrapping from one edge of the grid to another.
  
  - Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an 
  obstacle, the roves moves up to the last possible point and reports the obstacle.
  


- [Bowling Game](src/main/scala/BowlingGameKata.scala)

  Count and sum the scores of a bowling game of one player. 

  Scoring rules in:

  - One point is scored for each pin that is knocked over, and when less than all ten pins are knocked down
  in two rolls in a frame, the frame is scored with the total number of pins knocked down.
    
  - When all ten pins are knocked down with either the first or second rolls of a frame, bonus pins are awarded 
    as follows:
      - **Strike:** when all ten pins are knocked down on the first roll, the frame receives ten pins plus a bonus 
    of pinfall on the next two rolls. A strike in the final frame receives two extra rolls for bonus pins.
  
      - **Spare:** when a second roll of a frame is needed to knock down all ten pins, the frame receives ten pins plus
    a bonus of pinfall in the next roll. A spare in the first two rolls in the final frame receives a third roll for
        bonus pins.



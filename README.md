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


- String Permutations
- Word Wrap
- Mars ROver
- Bowling Game
- Reverse Polish Notation


# Guess-A-Number

## Overview
"Guess A Number" is a simple console-based game developed in Java. The objective of the game is to guess a randomly generated number between 1 and 100. The player enters their guesses, and the computer provides hints whether the guess is too high, too low, or correct. The game continues until the player successfully guesses the correct number.

## Features
- **Random Number Generation:** The game generates a random number between 1 and 100 for each session using Java's `Random` class.
- **Input Validation:** The game checks if the player's input is a valid number and provides feedback if the input is invalid.
- **Hints and Feedback:** The game gives hints to the player by indicating if the guessed number is too high, too low, or correct.

## How to Play
1. **Start the Game:** Run the Java program. The game will prompt you to guess a number between 1 and 100.
2. **Enter a Guess:** Type your guess and press Enter. The game will respond with one of the following messages:
   - **Too high:** If your guess is higher than the target number.
   - **Too low:** If your guess is lower than the target number.
   - **You guessed it!:** If you correctly guess the target number.
3. **Invalid Input:** If you enter a non-numeric value, the game will prompt you to enter a valid number.
4. **Continue Guessing:** Keep guessing until you find the correct number. The game ends when you guess the correct number.

## Installation and Setup
To play the game, follow these steps:

1. **Clone the Repository:** Clone or download the repository containing the project files.
2. **Compile the Java File:** Use a Java compiler to compile the `GuessANumber.java` file.
   ```sh
   javac GuessANumber.java

## Requirements
- Java Development Kit (JDK) 8 or higher
- A console or terminal to run the Java program

## Project Structure
- `GuessANumber.java`: The main Java file containing the game's logic.

## Learning Objectives
This project is part of a Java Fundamentals course designed to teach the following concepts:

- Basic Java syntax and structure
- Console input and output handling
- Random number generation
- Loop structures (`while` loop)
- Conditional statements (`if`, `else if`, `else`)
- Input validation

## Future Improvements
- Implementing a graphical user interface (GUI)
- Adding difficulty levels (e.g., adjusting the range of numbers)
- Implementing a scoring system based on the number of attempts

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### Acknowledgments
This project is inspired by the traditional Guess A Number game and was developed as part of my learning at SoftUni from [Programming Fundamentals with Java](https://softuni.bg/trainings/3951/programming-fundamentals-with-java-january-2023).


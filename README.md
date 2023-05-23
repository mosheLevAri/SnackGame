# Snake Game

- The Snake Game is a simple console-based game where the player controls a snake to eat food and grow longer. The objective is to achieve the highest score possible without colliding with the walls or the snake's own body.

- The game is designed using Object-Oriented Programming (OOP) principles, allowing for easy extensibility and modularity. The game follows the SOLID principles, ensuring a clean and maintainable code structure.

- The Snake Game serves as a generic framework that can be easily adapted to create similar types of games, such as Pac-Man or other grid-based games. By leveraging the power of OOP and adhering to SOLID principles, developers can easily replace the game components, such as the snake and food, to create their own unique gaming experiences.

#### So, get ready to embark on a thrilling adventure with the Snake Game, where your strategic thinking and reflexes will be put to the test! Can you guide the snake to victory and achieve the highest score? Let's find out!

## How to Play

1. Use the following controls to navigate the snake:
   - `W` or `w`: Move the snake up
   - `S` or `s`: Move the snake down
   - `A` or `a`: Move the snake left
   - `D` or `d`: Move the snake right
   
   NOTE : After each navigation, press Enter to confirm the movement.

2. The snake will move continuously in the last chosen direction.

3. The snake can eat food that randomly appears on the board. Eating food increases the snake's length and score.

4. Avoid collisions with the walls or the snake's own body. Collisions will result in game over.

5. The game ends when the snake collides with the walls or itself. The final score will be displayed.

## Game Components

The Snake Game consists of the following components:

- `Snake`: Represents the snake controlled by the player. It moves on the game board and interacts with the food.
- `Food`: Represents the food that appears randomly on the game board. The snake can eat the food to grow longer.
- `SnakeBoard`: Manages the game board and tracks the state of the game. It handles collision detection and updates the game elements.
- `Controller`: Controls the flow of the game and handles user input.
- `Graphic`: Renders the game board and elements on the console.

## Game Rules

- The snake starts with a length of 1 and appears in the middle of the game board.
- The snake moves continuously in the last chosen direction.
- Eating food increases the snake's length and score.
- The game ends when the snake collides with the walls or itself.
- The score is based on the number of food items eaten.
- The longer the snake, the higher the score.

## Compilation and Execution

To compile and run the Snake Game, follow these steps:

1. Make sure you have Java Development Kit (JDK) installed on your system.

2. Open a terminal or command prompt and navigate to the project directory.

3. Compile the Java source files using the following command:

``` java 
javac BodyPart.java Controller.java Food.java IController.java IFood.java IGame.java IGraphic.java Main.java SnakeBoard.java Snake.java
```

4. Run the game using the following command:

``` java 
java Main
```

5. Follow the on-screen instructions to play the game.

## Contributions

Contributions to the Snake Game project are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.




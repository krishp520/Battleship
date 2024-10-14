# Battleship Console Game in Java

## Overview

Welcome to the **Battleship Console Game** implemented in Java! This project simulates the classic two-player board game "Battleship," where players place boats on a grid and try to sink each other's ships by guessing their locations. The game is designed to run on the console, allowing two players to compete against each other in a fun and strategic way.

This project was initially developed as part of an academic assignment for the course **CSCI 1110** at Dalhousie University.

## Game Rules

- **Players**: The game supports two players.
- **Boats**: Each player places a predefined number of boats on their grid. Boats vary in size and can be placed either horizontally or vertically.
- **Turns**: Players take turns firing shots at their opponent’s grid. The objective is to sink all the opponent’s boats.
- **Victory**: A player wins when all the opponent's boats have been sunk. The game also includes a bomb attack feature, which affects multiple cells at once!

## Features

- **Player Boards**: Each player has a grid where they place their boats.
- **Shooting**: Players take turns firing at each other's boards by providing row and column coordinates.
- **Bomb Feature**: Each player can use a bomb attack in the final turns, affecting a larger area of the grid.
- **Winner Declaration**: After all boats have been sunk, the game declares the winner or a draw if both players lose all their boats simultaneously.

## How to Play

1. **Game Setup**:
    - Players are prompted to enter the size of the grid (NxN).
    - Each player places their boats on the grid by specifying:
      - The starting row and column.
      - The size of the boat.
      - The direction (0 for horizontal, 1 for vertical).

2. **Taking Turns**:
    - Players take turns entering the coordinates (row and column) to shoot at the opponent’s grid.
    - A hit is marked with an 'X', while an untouched part of the grid remains as a '-'.

3. **Bomb Attack**:
    - In the final two shots, each player can place a bomb. The bomb impacts not only the target cell but also its surrounding cells horizontally, vertically, and diagonally.

4. **End Game**:
    - The game ends when one player has sunk all the opponent's boats, or in a draw if both players lose all their boats simultaneously.

## Example

Here’s an example of how the game board may look:


package ec.edu.espe.mazesimulator.controller;

import ec.edu.espe.mazesimulator.model.Maze;

import java.util.Random;

/**
 *
 * @author Luis Sagnay
 */
public class MazeController {
    private Maze maze;
    private IMazeGenerator mazeGenerator;
    private int entranceX, entranceY, exitX, exitY;

    public MazeController(Maze maze, IMazeGenerator mazeGenerator) {
        this.maze = maze;
        this.mazeGenerator = mazeGenerator;
        initializeMaze();
    }

    private void initializeMaze() {
        entranceX = 0;
        entranceY = getRandomNumber(maze.getHeight());
        exitX = maze.getWidth() - 1;
        exitY = getRandomNumber(maze.getHeight());
        maze.getRoom(entranceX, entranceY).openDoor(3);
    }

    private int getRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    public void createMaze() {
        mazeGenerator.generateMaze(maze.getMaze(), entranceX, entranceY, exitX, exitY);
    }

    public void printMaze() {
        for (int i = 0; i < maze.getHeight(); i++) {
            for (int j = 0; j < maze.getWidth(); j++) {
                if (j == entranceX && i == entranceY) {
                    System.out.print("S ");
                } else if (j == exitX && i == exitY) {
                    System.out.print("E ");
                } else {
                    System.out.print("+");
                    if (maze.getRoom(j, i).hasDoor(0)) System.out.print("--");
                    else System.out.print("  ");
                }
            }
            System.out.println("+");

            for (int j = 0; j < maze.getWidth(); j++) {
                if (j == 0 || maze.getRoom(j, i).hasDoor(3)) System.out.print("|");
                else System.out.print("  ");

                if (j == maze.getWidth() - 1) {
                    if (maze.getRoom(j, i).hasDoor(1)) System.out.println("|");
                    else System.out.println("  ");
                } else {
                    if (maze.getRoom(j, i).hasDoor(1)) System.out.print("|");
                    else System.out.print("  ");
                }
            }
        }

        for (int j = 0; j < maze.getWidth(); j++) {
            System.out.print("+--");
        }
        System.out.println("+");
    }
}

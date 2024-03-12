package ec.edu.espe.mazesimulator.view;

import ec.edu.espe.mazesimulator.controller.IMazeGenerator;
import ec.edu.espe.mazesimulator.controller.MazeController;
import ec.edu.espe.mazesimulator.controller.MazeGenerator;
import ec.edu.espe.mazesimulator.model.Maze;
import java.util.Scanner;

/**
 *
 * @author Luis Sagnay
 */
public class MazeSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the width of the Maze: ");
        int mazeWidth = scanner.nextInt();
        System.out.println("Enter the height of the Maze: ");
        int mazeHeight = scanner.nextInt();

        Maze maze = new Maze(mazeWidth, mazeHeight);
        IMazeGenerator mazeGenerator = new MazeGenerator();
        MazeController mazeController = new MazeController(maze, mazeGenerator);
        mazeController.createMaze();
        mazeController.printMaze();
    }
}


package ec.edu.espe.maze.view;

import ec.edu.espe.maze.controller.ControllerMaze;
import ec.edu.espe.maze.model.MazeCreate;

/**
 *
 * @author Juan Granda
 */
public class Maze {

    public static void main(String[] args) {
        MazeCreate maze = new MazeCreate(12,13);
        ControllerMaze print = new ControllerMaze();
        print.imprimirLaberinto();
        

    }
}

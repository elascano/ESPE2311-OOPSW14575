
package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Maze;

/**
 *
 * @author mateo
 */
public class ASCIIPrinter implements IMazeShower{

    @Override
    public void showMaze(Maze maze) {
        System.out.println("Maze result: \n" + maze.getMazeConstruction());
    }
    
}

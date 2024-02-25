package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Maze;

/**
 *
 * @author mateo
 */
public class MazeValidator {

    public static boolean validateMaze(Maze maze) {
        //Here the validator of one way shoould return a value
        if (maze.getMazeConstruction() != null || !maze.getMazeConstruction().equals("")) {
            return true;
        } else {
            return false;
        }
    }

}

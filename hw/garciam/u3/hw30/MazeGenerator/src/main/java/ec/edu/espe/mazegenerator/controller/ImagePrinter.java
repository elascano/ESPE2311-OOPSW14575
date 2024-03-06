
package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Maze;

/**
 *
 * @author mateo
 */
public class ImagePrinter implements IMazeShower{

    @Override
    public void showMaze(Maze maze) {
        System.out.println("Maze generated as :" + generateImage(maze.getMazeConstruction())); //TODO
    }
    
    private String generateImage(String maze){
        return "some path";
    }
    
}

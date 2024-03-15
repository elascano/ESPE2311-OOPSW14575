package ec.edu.espe.mazesimulator.controller;

import ec.edu.espe.mazesimulator.model.Room;

/**
 *
 * @author Luis Sagnay
 */
public interface IMazeGenerator {
    public void generateMaze(Room[][] maze, int entranceX, int entranceY, int exitX, int exitY);
}

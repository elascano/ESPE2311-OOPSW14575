package ec.edu.espe.mazegen.view;

import ec.edu.espe.mazegen.model.Maze;

public class MazegenMain {
    public static void main(String[] args) {
        Maze testMaze = new Maze(3, 3);
        System.out.println(testMaze.generateAsciiMaze());
    }
}

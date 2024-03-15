
package ec.edu.espe.maze.model;

import ec.edu.espe.maze.controller.ControllerMaze;

/**
 *
 * @author Juan Granda
 */
public class MazeCreate {
    private int N;
    private int M;
    private char[][] maze;

    public MazeCreate(int N, int M) {
        this.N = N;
        this.M = M;
        maze = new char[N][M];
        ControllerMaze maze = new ControllerMaze();
        maze.generateMaze(N, M);
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public char[][] getMaze() {
        return maze;
    }

    public void setMaze(char[][] maze) {
        this.maze = maze;
    }
    
    
}

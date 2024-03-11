package ec.edu.espe.mazesimulator.model;

/**
 *
 * @author Luis Sagnay
 */
public class Maze {
    private Room[][] maze;
    private int width;
    private int height;

    public Maze(Room[][] maze, int width, int height) {
        this.maze = maze;
        this.width = width;
        this.height = height;
    }

    public Maze(int width, int height) {
        maze = new Room[height][width];
        initializeMaze();
    }

    private void initializeMaze() {
        for (int i = 0; i < getMaze().length; i++) {
            for (int j = 0; j < getMaze()[0].length; j++) {
                getMaze()[i][j] = new Room();
            }
        }
    }

    public Room[][] getMaze() {
        return maze;
    }

    public int getHeight() {
        return getMaze().length;
    }

    public int getWidth() {
        return getMaze()[0].length;
    }

    public Room getRoom(int x, int y) {
        return getMaze()[y][x];
    }

    /**
     * @param maze the maze to set
     */
    public void setMaze(Room[][] maze) {
        this.maze = maze;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    
}

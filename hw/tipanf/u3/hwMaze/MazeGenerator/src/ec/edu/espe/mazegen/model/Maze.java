package ec.edu.espe.mazegen.model;

import ec.edu.espe.mazegen.controller.MazeGenerator;

/**
 *
 * @author Frederick
 */
public abstract class Maze {
    private int width;
    private int height;
    
    private Room[][] mazeMap;

    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        initializeMap();
    }
    
    private void initializeMap(){
        setMazeMap(new Room[getWidth()][getHeight()]);
        
        for(int j=0;j<getHeight();j++){
            for(int i=0;i<getWidth();i++){
                getMazeMap()[i][j] = new Room(i,j);
           }
        }
        
        MazeGenerator mzgen = new MazeGenerator();
        mzgen.generateMaze(mazeMap);
    }
    
    public abstract void displayMaze();

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the mazeMap
     */
    public Room[][] getMazeMap() {
        return mazeMap;
    }

    /**
     * @param mazeMap the mazeMap to set
     */
    public void setMazeMap(Room[][] mazeMap) {
        this.mazeMap = mazeMap;
    }
    
}

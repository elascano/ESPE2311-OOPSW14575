
package ec.espe.edu.maze.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Maze {
    private int row;
    private int column;
    private int numberOfDoors;
    private Square squares[][];

    public Maze(int column, int numberOfDoors) {
        this.column = column;
        this.numberOfDoors = numberOfDoors;
        squares = new Square[row][column];
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the column
     */
    public int getColumn() {
        return column;
    }

    /**
     * @param column the column to set
     */
    public void setColumn(int column) {
        this.column = column;
    }

    /**
     * @return the numberOfDoors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * @param numberOfDoors the numberOfDoors to set
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * @return the squares
     */
    public Square[][] getSquares() {
        return squares;
    }

    /**
     * @param squares the squares to set
     */
    public void setSquares(Square[][] squares) {
        this.squares = squares;
    }
    
    
    
}

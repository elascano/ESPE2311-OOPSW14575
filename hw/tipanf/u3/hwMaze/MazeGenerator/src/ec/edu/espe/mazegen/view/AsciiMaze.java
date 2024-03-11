package ec.edu.espe.mazegen.view;

import ec.edu.espe.mazegen.controller.MazeResolver;
import ec.edu.espe.mazegen.model.Maze;
import ec.edu.espe.mazegen.model.Room;
import ec.edu.espe.mazegen.model.Wall;

/**
 *
 * @author Frederick
 */
public class AsciiMaze extends Maze {

    private final String edge = "+";
    private final String verticalBorder = "|";
    private final String horizontalBorder = "---";
    private final String blankSpace = "   ";
    private final String solutionPath = " * ";
    private String cellType;
    
    public AsciiMaze(int width, int height) {
        super(width, height);
    }

    @Override
    public void displayMaze() {
        Room cell;
        Wall wall;
        
        for (int j = 0; j < this.getHeight(); j++) {
            for (int k = 0; k < 2; k++) {
                for (int i = 0; i < this.getWidth(); i++) {
                    cell = this.getMazeMap()[i][j];
                    cellType = cell.getType();
                    wall = cell.getWalls()[k];
                    
                    if(k==0){
                        printHorizontalWalls(wall,i);
                    } else if(k==1){
                        if(i == this.getWidth() - 1){
                            printWalls(wall);
                            wall = cell.getWalls()[3];
                            
                            printBorderWalls(wall);
                        }else{
                            printWalls(wall);
                        }
                    }
                    
                }
                System.out.println();
            }
            if (j == this.getHeight() - 1) {
                for (int i = 0; i < this.getWidth(); i++) {
                    cell = this.getMazeMap()[i][j];
                    cellType = cell.getType();
                    wall = cell.getWalls()[2];
                    printHorizontalWalls(wall,i);
                }
            }
        }
        System.out.println();
    }
    
    public void resolveMaze() {
        MazeResolver mzrs = new MazeResolver();
        mzrs.resolveMaze(getMazeMap());
    }
    
    private void printHorizontalWalls(Wall wall, int columnIndex){
        System.out.print(edge);
        printWalls(wall);
        if (columnIndex == this.getWidth() - 1) {
            System.out.print(edge);
        }
    }
    
    private void printWalls(Wall wall){
        
        if ("North".equals(wall.getDirection())) {
            showHorizontalBorder(wall);
        } else if ("West".equals(wall.getDirection())) {
            showVerticalBorder(wall);
        } else if ("South".equals(wall.getDirection())) {
            showHorizontalBorder(wall);
        } else if ("East".equals(wall.getDirection())) {
            showVerticalBorder(wall);
        }
    }
    
    private void printBorderWalls(Wall wall){
        if (!wall.getState()) {
            if (cellType.equals("path") || cellType.equals("start") || cellType.equals("end")) {
                System.out.print("E");
            }else{
                System.out.print(" ");
            }
        } else {
            if (cellType.equals("path") || cellType.equals("start") || cellType.equals("end")) {
                System.out.print(verticalBorder);
            }else{
                System.out.print(verticalBorder);
            }
        }
    }
    
    private void showVerticalBorder(Wall wall){
        if (!wall.getState()) {
            if (cellType.equals("path") || cellType.equals("end")) {
                System.out.print(" " + solutionPath);
            }else if(cellType.equals("start")) {
                System.out.print("S" + solutionPath);
            }else{
                System.out.print(" " + blankSpace);
            }
        } else {
            if (cellType.equals("path") || cellType.equals("start") || cellType.equals("end")) {
                System.out.print(verticalBorder + solutionPath);
            }else{
                System.out.print(verticalBorder + blankSpace);
            }
        }
    }
    
    private void showHorizontalBorder(Wall wall){
        if (!wall.getState()) {
            System.out.print(blankSpace);
        } else {
            System.out.print(horizontalBorder);
        }
    }
    
}

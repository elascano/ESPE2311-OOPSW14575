/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Maze.model;

/**
 *
 * @author EDWARICHSNAKE
 */
public abstract class Cell {
       int [][] cell;

    public Cell(int[][] cell) {
        this.cell = cell;
    }

    public int[][] getCell() {
        return cell;
    }

    public void setCell(int[][] cell) {
        this.cell = cell;
    }
       
}

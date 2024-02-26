
package ec.edu.espe.mazegenerator.model;

import ec.edu.espe.mazegenerator.controller.MazeValidator;

/**
 *
 * @author mateo
 */
public class Maze {
    private int N;
    private int M;
    private String MazeConstruction;
    private boolean mazeIsOk;

    public Maze(int N, int M, String MazeConstruction) {
        this.N = N;
        this.M = M;
        this.MazeConstruction = MazeConstruction;
        this.mazeIsOk = false;
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

    public String getMazeConstruction() {
        return MazeConstruction;
    }

    public void setMazeConstruction(String MazeConstruction) {
        this.MazeConstruction = MazeConstruction;
    }

    public boolean isMazeIsOk() {
        return mazeIsOk;
    }

    public void setMazeIsOk(boolean mazeIsOk) {
        this.mazeIsOk = mazeIsOk;
    }
    
    
    public void checkMaze(){
        this.setMazeIsOk(MazeValidator.validateMaze(this)); 
    }
    
    
    
}

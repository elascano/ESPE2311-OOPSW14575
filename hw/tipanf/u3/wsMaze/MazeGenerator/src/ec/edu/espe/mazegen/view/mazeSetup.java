package ec.edu.espe.mazegen.view;

/**
 *
 * @author Frederick
 */
public class mazeSetup {
    public static void main(String[] args){
        int x=8;
        int y=4;
        
        AsciiMaze maze = new AsciiMaze(x,y);
        maze.displayMaze();
        
        maze.resolveMaze();
        System.out.println("\n\n");
        
        maze.displayMaze();
        
        
    }
    
}

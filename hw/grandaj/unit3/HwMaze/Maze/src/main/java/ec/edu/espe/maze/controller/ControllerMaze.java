
package ec.edu.espe.maze.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Juan Granda
 */
public class ControllerMaze {
    private char[][] maze;
   public void generateMaze(int N,int M){
       for(int i = 0 ;i < N ; i++){
            for (int j = 0; j < M; j++) {
                maze[i][j] = '#';
            }           
       }
        generarRecursivo(1, 1);

        maze[0][1] = ' ';
        maze[N - 1][M - 2] = ' ';
       
   }

    private void generarRecursivo(int i, int j) {
        int N = 0;
        int M = 0;
        maze[i][j] = ' ';

        ArrayList<Character> direcciones = new ArrayList<>(Arrays.asList('N', 'S', 'E', 'O'));
        Collections.shuffle(direcciones);

        for (char direccion : direcciones) {
            switch (direccion) {
                case 'N':
                    if (i - 2 <= 0) continue;
                    if (maze[i - 2][j] != ' ') {
                        maze[i - 1][j] = ' ';
                        generarRecursivo(i - 2, j);
                    }
                    break;
                case 'S':
                    if (i + 2 >= N - 1) continue;
                    if (maze[i + 2][j] != ' ') {
                        maze[i + 1][j] = ' ';
                        generarRecursivo(i + 2, j);
                    }
                    break;
                case 'E':
                    if (j + 2 >= M - 1) continue;
                    if (maze[i][j + 2] != ' ') {
                        maze[i][j + 1] = ' ';
                        generarRecursivo(i, j + 2);
                    }
                    break;
                case 'O':
                    if (j - 2 <= 0) continue;
                    if (maze[i][j - 2] != ' ') {
                        maze[i][j - 1] = ' ';
                        generarRecursivo(i, j - 2);
                    }
                    break;
            }
        }
    }
    public void imprimirLaberinto() {
        int N = 0;
        int M = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
    
}

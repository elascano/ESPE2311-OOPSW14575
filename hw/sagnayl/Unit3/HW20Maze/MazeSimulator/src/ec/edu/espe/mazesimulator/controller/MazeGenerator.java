package ec.edu.espe.mazesimulator.controller;

import ec.edu.espe.mazesimulator.model.Room;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Luis Sagnay
 */
public class MazeGenerator implements IMazeGenerator{
    @Override
    public void generateMaze(Room[][] maze, int entranceX, int entranceY, int exitX, int exitY) {
        Stack<int[]> stack = new Stack<>();
        boolean[][] visited = new boolean[maze.length][maze[0].length];

        stack.push(new int[]{entranceX, entranceY});
        visited[entranceY][entranceX] = true;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];

            int[][] neighbors = {{x - 2, y}, {x + 2, y}, {x, y - 2}, {x, y + 2}};
            randomizeArray(neighbors);

            for (int[] neighbor : neighbors) {
                int nx = neighbor[0];
                int ny = neighbor[1];

                if (isValid(nx, ny, maze) && !visited[ny][nx]) {
                    maze[y][x].openDoor(getDirection(x, y, nx, ny));
                    maze[ny][nx].openDoor(getDirection(nx, ny, x, y));
                    stack.push(new int[]{nx, ny});
                    visited[ny][nx] = true;
                }
            }
        }

        maze[exitY][exitX].openDoor(1); 
    }

    private static boolean isValid(int x, int y, Room[][] maze) {
        return x >= 0 && x < maze[0].length && y >= 0 && y < maze.length;
    }

    private static int getDirection(int x1, int y1, int x2, int y2) {
        if (x1 < x2) return 1; // Right
        if (x1 > x2) return 3; // Left
        if (y1 < y2) return 2; // Down
        if (y1 > y2) return 0; // Up
        return -1;
    }

    private static void randomizeArray(int[][] position) {
        Random random = new Random();
        for (int i = position.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int[] temp = position[i];
            position[i] = position[index];
            position[index] = temp;
        }
    }
}

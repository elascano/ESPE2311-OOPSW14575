package ec.edu.espe.mazegen.utils;

import java.util.Random;

public class MatrixUtils {
    public static int[] getRandomOuterElement(int rows, int columns) {
        Random random = new Random();
        int randomRow = random.nextInt(rows + 1);
        int randomColumn;
        if (randomRow == 0 || randomRow == rows) {
            randomColumn = random.nextInt(columns + 1);
        } else {
            randomColumn = (random.nextBoolean()) ? 0 : columns;
        }
        return new int[]{randomRow, randomColumn};
    }
}

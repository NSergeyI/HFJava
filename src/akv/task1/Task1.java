package akv.task1;

import java.lang.reflect.Array;
import java.util.*;

abstract class Task1 {
    static boolean[][] matrixConnections;
    static boolean[][] modifyMatrixConnections;
    ArrayList<Integer> connections;

    static int zombieCluster(String[] zombies) {
        addToMatrix(zombies);
        findConnections();

        /*
         * Write your code here.
         */
        return 1;

    }

    static void addToMatrix(String[] zombies) {
        matrixConnections = new boolean[zombies.length][zombies.length];
        for (int row = 0; row < zombies.length; row++) {
            for (int colums = 0; colums < zombies.length; colums++) {
                if (zombies[row].charAt(row) == '1') {
                    matrixConnections[row][colums] = true;
                } else {
                    matrixConnections[row][colums] = false;
                }
            }
        }
    }

    static void findConnections() {
        modifyMatrixConnections = new boolean[matrixConnections.length][matrixConnections.length];
        for (int row = 0; row < modifyMatrixConnections.length; row++) {
            for (int colums = 0; colums < modifyMatrixConnections.length; colums++) {
                if (matrixConnections[row][colums]){
                    modifyMatrixConnections[row][colums] = true;
                }
            }
        }
    }


}

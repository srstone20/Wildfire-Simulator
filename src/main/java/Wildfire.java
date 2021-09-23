// Author: Samuel Stone

import java.util.Scanner;
import java.io.*;

public class Wildfire {
    String[][] map;

    public Wildfire () {
        this("defaultMap.txt");
    }
    
    public Wildfire(String mapFile) {
        // copy the map from .txt file to a 2d array
        try {
            Scanner scan = new Scanner(new File(mapFile));
            int numRows = scan.nextInt();
            int numColumns = scan.nextInt();
            map = new String[numColumns][numRows];
            for (int row = 0; row < map[0].length; row++) {
                for (int column = 0; column < map.length; column++) {
                    map[column][row] = scan.next();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print(e.getMessage());
        }
    }

    public void startFire(int row, int column) {
        if (column < 0 || row < 0 || map[column][row].equals("W")) {
            return;
        }

        map[column][row] = "F";

        spreadUp(column, row);
        spreadDown(column, row);
        spreadLeft(column, row);
        spreadRight(column, row);

    }

    public void spreadDown(int column, int row) {
        if (row - 1 == -1 || map[column][row - 1].equals("W") || map[column][row - 1].equals("F")) {
            return;
        }
        startFire(row - 1, column);
    }

    public void spreadUp(int column, int row) {
        if (row + 1 == map[0].length || map[column][row + 1].equals("W") || map[column][row + 1].equals("F")) {
            return;
        }
        startFire( row + 1, column);
    }

    public void spreadLeft(int column, int row) {
        if (column - 1 == -1 || map[column - 1][row].equals("W") || map[column - 1][row].equals("F")) {
            return;
        }
        startFire( row, column - 1);
    }

    public void spreadRight(int column, int row) {
        if (column + 1 == map.length || map[column + 1][row].equals("W") || map[column + 1][row].equals("F")) {
            return;
        }
        startFire(row, column + 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < map[0].length; row++) {
            for (int column = 0; column < map.length; column++) {
                sb.append(map[column][row] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
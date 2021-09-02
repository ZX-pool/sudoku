package com;

public class Main {

    public static void main(String[] args) {
        // write your code here


        int intermediateGrid1[][] = {
                {0, 0, 0, 4, 0, 0, 2, 0, 9},
                {0, 0, 0, 8, 0, 0, 0, 7, 0},
                {6, 9, 1, 0, 5, 0, 0, 0, 0},
                {4, 3, 0, 0, 0, 0, 0, 0, 5},
                {0, 0, 8, 1, 0, 5, 3, 0, 0},
                {5, 0, 0, 0, 0, 0, 0, 8, 7},
                {0, 0, 0, 0, 4, 0, 9, 2, 8},
                {0, 8, 0, 0, 0, 1, 0, 0, 0},
                {3, 0, 5, 0, 0, 8, 0, 0, 0}
        };

        int intermediateGrid2[][] = {
                {0, 0, 3, 0, 0, 2, 7, 0, 0},
                {0, 0, 0, 0, 0, 0, 6, 8, 1},
                {0, 8, 0, 0, 7, 5, 0, 0, 0},
                {9, 3, 0, 0, 0, 0, 0, 6, 0},
                {0, 0, 0, 3, 2, 9, 0, 0, 0},
                {0, 5, 0, 0, 0, 0, 0, 2, 9},
                {0, 0, 0, 9, 8, 0, 0, 1, 0},
                {5, 4, 8, 0, 0, 0, 0, 0, 0},
                {0, 0, 6, 5, 0, 0, 2, 0, 0}
        };

        int hardGrid1[][] = {
                {0, 0, 0, 9, 0, 0, 0, 1, 0},
                {0, 0, 4, 0, 0, 8, 6, 0, 0},
                {5, 0, 0, 0, 7, 0, 0, 0, 2},
                {8, 0, 0, 7, 1, 0, 3, 4, 0},
                {0, 0, 0, 3, 0, 5, 0, 0, 0},
                {0, 1, 3, 0, 8, 9, 0, 0, 6},
                {3, 0, 0, 0, 6, 0, 0, 0, 5},
                {0, 0, 1, 5, 0, 0, 7, 0, 0},
                {0, 7, 0, 0, 0, 3, 0, 0, 0}
        };
        int hardGrid2[][] = {
                {0, 0, 5, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 6, 0, 5, 0, 0, 0},
                {7, 6, 0, 9, 0, 0, 0, 2, 0},
                {3, 0, 0, 0, 4, 0, 0, 0, 5},
                {0, 5, 9, 0, 3, 0, 2, 4, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 2, 0, 6, 3},
                {0, 0, 0, 3, 0, 7, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 8, 0, 0}
        };
        int hardGrid3[][] = {
                {0, 0, 0, 0, 0, 0, 0, 3, 5},
                {0, 0, 5, 8, 0, 0, 0, 9, 0},
                {9, 0, 3, 1, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 8, 0, 7},
                {0, 4, 0, 3, 0, 2, 0, 6, 0},
                {5, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 2, 8, 3, 0, 4},
                {0, 9, 0, 0, 0, 1, 2, 0, 0},
                {1, 2, 0, 0, 0, 0, 0, 0, 0}
        };

        int countZeros = 0;

        Grid grid = new Grid(hardGrid3);

        System.out.println(" Count Zeros first = " + grid.countZerosInGrid());
        grid.showGrid();

        while (grid.countZerosInGrid() > 0) {
            countZeros = grid.countZerosInGrid();
            grid.testAllRow();
            grid.testAllColumn();
            grid.testAllSquare();
            grid.testAllRowAdvanced();
            grid.testAllColumnAdvanced();
            System.out.println(" zeros = " + grid.countZerosInGrid());
            grid.showGrid();
            if (countZeros == grid.countZerosInGrid()) {
                System.out.println("\nno result !!!! zeros = " + countZeros);
                break;
            }
        }

        grid.testGrid();


    }
}

package com;

public class Grid {

    private int inputGrid[][];

    public Grid(int inputGrid[][]) {
        this.inputGrid = inputGrid;
    }

    public void showGrid() {
        System.out.println("------------------------------------------------\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(inputGrid[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------\n");
    }


    public void changeGrid(int row, int column, int number) {
        inputGrid[row][column] = number;
    }

    int countZerosInGrid() {
        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (inputGrid[i][j] == 0) {
                    count++;
                }

            }
        }
        return count;
    }

    public int[] getRow(int numberRow) {
        int[] row = new int[9];
        for (int j = 0; j < 9; j++) {
            row[j] = inputGrid[numberRow][j];
            //   System.out.println(j + "  " + row[j]);
        }
        return row;

    }

    public int[] getColumn(int numberColumn) {
        int[] column = new int[9];
        for (int i = 0; i < 9; i++) {
            column[i] = inputGrid[i][numberColumn];
            //   System.out.println(j + "  " + row[j]);
        }
        return column;

    }

    public int[] getSquare(int numberSquare) {
        int[] square = new int[9];
        switch (numberSquare) {
            case 0: {
                square[0] = inputGrid[0][0];
                square[1] = inputGrid[0][1];
                square[2] = inputGrid[0][2];
                square[3] = inputGrid[1][0];
                square[4] = inputGrid[1][1];
                square[5] = inputGrid[1][2];
                square[6] = inputGrid[2][0];
                square[7] = inputGrid[2][1];
                square[8] = inputGrid[2][2];
                break;
            }
            case 1: {
                square[0] = inputGrid[0][3];
                square[1] = inputGrid[0][4];
                square[2] = inputGrid[0][5];
                square[3] = inputGrid[1][3];
                square[4] = inputGrid[1][4];
                square[5] = inputGrid[1][5];
                square[6] = inputGrid[2][3];
                square[7] = inputGrid[2][4];
                square[8] = inputGrid[2][5];
                break;
            }
            case 2: {
                square[0] = inputGrid[0][6];
                square[1] = inputGrid[0][7];
                square[2] = inputGrid[0][8];
                square[3] = inputGrid[1][6];
                square[4] = inputGrid[1][7];
                square[5] = inputGrid[1][8];
                square[6] = inputGrid[2][6];
                square[7] = inputGrid[2][7];
                square[8] = inputGrid[2][8];
                break;
            }
            case 3: {
                square[0] = inputGrid[3][0];
                square[1] = inputGrid[3][1];
                square[2] = inputGrid[3][2];
                square[3] = inputGrid[4][0];
                square[4] = inputGrid[4][1];
                square[5] = inputGrid[4][2];
                square[6] = inputGrid[5][0];
                square[7] = inputGrid[5][1];
                square[8] = inputGrid[5][2];
                break;
            }
            case 4: {
                square[0] = inputGrid[3][3];
                square[1] = inputGrid[3][4];
                square[2] = inputGrid[3][5];
                square[3] = inputGrid[4][3];
                square[4] = inputGrid[4][4];
                square[5] = inputGrid[4][5];
                square[6] = inputGrid[5][3];
                square[7] = inputGrid[5][4];
                square[8] = inputGrid[5][5];
                break;
            }
            case 5: {
                square[0] = inputGrid[3][6];
                square[1] = inputGrid[3][7];
                square[2] = inputGrid[3][8];
                square[3] = inputGrid[4][6];
                square[4] = inputGrid[4][7];
                square[5] = inputGrid[4][8];
                square[6] = inputGrid[5][6];
                square[7] = inputGrid[5][7];
                square[8] = inputGrid[5][8];
                break;
            }
            case 6: {
                square[0] = inputGrid[6][0];
                square[1] = inputGrid[6][1];
                square[2] = inputGrid[6][2];
                square[3] = inputGrid[7][0];
                square[4] = inputGrid[7][1];
                square[5] = inputGrid[7][2];
                square[6] = inputGrid[8][0];
                square[7] = inputGrid[8][1];
                square[8] = inputGrid[8][2];
                break;
            }
            case 7: {
                square[0] = inputGrid[6][3];
                square[1] = inputGrid[6][4];
                square[2] = inputGrid[6][5];
                square[3] = inputGrid[7][3];
                square[4] = inputGrid[7][4];
                square[5] = inputGrid[7][5];
                square[6] = inputGrid[8][3];
                square[7] = inputGrid[8][4];
                square[8] = inputGrid[8][5];
                break;
            }
            case 8: {
                square[0] = inputGrid[6][6];
                square[1] = inputGrid[6][7];
                square[2] = inputGrid[6][8];
                square[3] = inputGrid[7][6];
                square[4] = inputGrid[7][7];
                square[5] = inputGrid[7][8];
                square[6] = inputGrid[8][6];
                square[7] = inputGrid[8][7];
                square[8] = inputGrid[8][8];
                break;
            }
        }
        return square;


    }

    public int getNumberSquare(int row, int column) {
        int numberSquare = -1;

        if ((row >= 0) && (row <= 2) && (column >= 0) && (column <= 2)) {
            numberSquare = 0;
        }
        ;
        if ((row >= 0) && (row <= 2) && (column >= 3) && (column <= 5)) {
            numberSquare = 1;
        }
        ;
        if ((row >= 0) && (row <= 2) && (column >= 6) && (column <= 8)) {
            numberSquare = 2;
        }
        ;
        if ((row >= 3) && (row <= 5) && (column >= 0) && (column <= 2)) {
            numberSquare = 3;
        }
        ;
        if ((row >= 3) && (row <= 5) && (column >= 3) && (column <= 5)) {
            numberSquare = 4;
        }
        ;
        if ((row >= 3) && (row <= 5) && (column >= 6) && (column <= 8)) {
            numberSquare = 5;
        }
        ;
        if ((row >= 6) && (row <= 8) && (column >= 0) && (column <= 2)) {
            numberSquare = 6;
        }
        ;
        if ((row >= 6) && (row <= 8) && (column >= 3) && (column <= 5)) {
            numberSquare = 7;
        }
        ;
        if ((row >= 6) && (row <= 8) && (column >= 6) && (column <= 8)) {
            numberSquare = 8;
        }
        ;

        return numberSquare;
    }

    public int isNumberInSet(int number, int setNumbers[]) {
        int position = -1;

        for (int i = 0; i < 9; i++) {
            if (number == setNumbers[i]) {
                position = i;
                break;
            } else {
                position = -1;
            }
        }
        return position;
    }

    public int countNumbersInSet(int number, int[] setNumbers) {
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (setNumbers[i] == number) {
                count++;
            }
        }
        return count;
    }

    public void testRow(int numberRow, int number) {
        int countMatch = 0;
        int countZeros = 0;
        int position = -1;
        int[] row = new int[9];
        row = this.getRow(numberRow);

        for (int i = 0; i < 9; i++) {

            if (row[i] == 0) {
                countZeros++;
                // position = i;
                if ((this.isNumberInSet(number, this.getColumn(i)) >= 0) ||
                        (this.isNumberInSet(number, this.getSquare(getNumberSquare(numberRow, i))) >= 0)) {
                    countMatch++;
                } else {
                    position = i;
                }
            }
        }

        if ((countZeros - countMatch == 1) && (inputGrid[numberRow][position] == 0)) {
            inputGrid[numberRow][position] = number;
            System.out.print(" square = " + getNumberSquare(numberRow, position));
            System.out.println("  Row " + numberRow + " " + position + " num = " + number);
        }

    }

    public void testColumn(int numberColumn, int number) {
        int countMatch = 0;
        int countZeros = 0;
        int position = -1;
        int[] column = new int[9];
        column = this.getColumn(numberColumn);

        for (int i = 0; i < 9; i++) {

            if (column[i] == 0) {
                countZeros++;
                if ((this.isNumberInSet(number, this.getRow(i)) >= 0) ||
                        (this.isNumberInSet(number, this.getSquare(getNumberSquare(i, numberColumn))) >= 0)) {
                    countMatch++;
                } else {
                    position = i;
                }
            }
        }

        if ((countZeros - countMatch == 1) && (inputGrid[position][numberColumn] == 0)) {
            inputGrid[position][numberColumn] = number;
            System.out.print(" square = " + getNumberSquare(position, numberColumn));
            System.out.println("  Column " + position + " " + numberColumn + " num = " + number);
        }
    }

    public void testSquare(int numberSquare, int number) {
        int countMatch = 0;
        int countZeros = 0;
        int shiftRow = 0;
        int shiftColumn = 0;
        int[] position = {0, 0};
        int[] square = new int[9];
        square = this.getSquare(numberSquare);
        switch (numberSquare) {
            case 0: {
                shiftRow = 0;
                shiftColumn = 0;
                break;
            }
            case 1: {
                shiftRow = 0;
                shiftColumn = 3;
                break;
            }
            case 2: {
                shiftRow = 0;
                shiftColumn = 6;
                break;
            }
            case 3: {
                shiftRow = 3;
                shiftColumn = 0;
                break;
            }
            case 4: {
                shiftRow = 3;
                shiftColumn = 3;
                break;
            }
            case 5: {
                shiftRow = 3;
                shiftColumn = 6;
                break;
            }
            case 6: {
                shiftRow = 6;
                shiftColumn = 0;
                break;
            }
            case 7: {
                shiftRow = 6;
                shiftColumn = 3;
                break;
            }
            case 8: {
                shiftRow = 6;
                shiftColumn = 6;
                break;
            }
        }
        for (int i = 0 + shiftRow; i < 3 + shiftRow; i++) {
            for (int j = 0 + shiftColumn; j < 3 + shiftColumn; j++) {
                if (inputGrid[i][j] == 0) {
                    countZeros++;
                    if ((this.isNumberInSet(number, this.getRow(i)) >= 0) ||
                            (this.isNumberInSet(number, this.getColumn(j)) >= 0)) {
                        countMatch++;
                    } else {
                        position[0] = i;
                        position[1] = j;
                    }
                }
            }
        }
        if ((countZeros - countMatch == 1) && (inputGrid[position[0]][position[1]] == 0)) {
            inputGrid[position[0]][position[1]] = number;
            System.out.print(" square = " + getNumberSquare(position[0], position[1]));
            System.out.println("  Square" + " " + position[0] + " " + position[1] + " num = " + number);
        }
    }

    public void testAllRow() {
        for (int i = 0; i < 9; i++) {
            for (int number = 1; number <= 9; number++) {
                if (isNumberInSet(number, getRow(i)) < 0) {
                    testRow(i, number);
                }

            }
        }
    }

    public void testAllColumn() {
        for (int j = 0; j < 9; j++) {
            for (int number = 1; number <= 9; number++) {
                if (isNumberInSet(number, getColumn(j)) < 0) {
                    testColumn(j, number);
                }
            }
        }
    }

    public void testAllSquare() {
        for (int z = 0; z < 9; z++) {
            for (int number = 1; number <= 9; number++) {
                if (isNumberInSet(number, getSquare(z)) < 0) {
                    testSquare(z, number);
                }
            }
        }
    }

    public void testRowAdvanced(int rowNumber) {
        int[] row = getRow(rowNumber);
        int[] set = new int[countNumbersInSet(0, row)];
        int t = 0;
        int match = 0;
        int sweetNumber = 0;
        for (int number = 1; number <= 9; number++) {
            if (isNumberInSet(number, row) < 0) {
                set[t++] = number;

            }
        }

        for (int num : set) {
            System.out.print(" | " + num);
        }
        System.out.println();
        for (int j = 0; j < 9; j++) {
            if (row[j] == 0) {
                for (int num : set) {
                    if (
                            (isNumberInSet(num, getColumn(j)) >= 0) ||
                                    (isNumberInSet(num, getSquare(getNumberSquare(rowNumber, j))) >= 0)
                    ) {
                        match++;
                    } else {
                        sweetNumber = num;
                    }
                }
                if ((set.length - match) == 1) {
                    changeGrid(rowNumber, j, sweetNumber);
                    System.out.println("!row wow " + " j = " + j + " match = " + match + " number " + sweetNumber);
                }
                match = 0;

            }
        }
    }

    public void testColumnAdvanced(int columnNumber) {
        int[] column = getColumn(columnNumber);
        int[] set = new int[countNumbersInSet(0, column)];
        int t = 0;
        int match = 0;
        int sweetNumber = 0;
        for (int number = 1; number <= 9; number++) {
            if (isNumberInSet(number, column) < 0) {
                set[t++] = number;

            }
        }

        for (int num : set) {
            System.out.print(" | " + num);
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (column[i] == 0) {
                for (int num : set) {
                    if ((isNumberInSet(num, getRow(i)) >= 0) || (isNumberInSet(num, getSquare(getNumberSquare(i, columnNumber))) >= 0)) {
                        match++;
                    } else {
                        sweetNumber = num;
                    }
                }
                if ((set.length - match) == 1) {
                    changeGrid(i, columnNumber, sweetNumber);
                    System.out.println("!col wow " + " i = " + i + " match = " + match + " number " + sweetNumber);
                }
                match = 0;

            }
        }
    }

    public void testAllRowAdvanced() {
        for (int j = 0; j < 9; j++) {
            if (countNumbersInSet(0, getRow(j)) > 1) {
                testRowAdvanced(j);
            }
        }
    }

    public void testAllColumnAdvanced() {
        for (int i = 0; i < 9; i++) {
            if (countNumbersInSet(0, getColumn(i)) > 1) {
                testColumnAdvanced(i);
            }
        }
    }

    public void testGrid() {
        int number;
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                number = inputGrid[row][column];
                if (number == 0) {
                    continue;
                }
                if (countNumbersInSet(number, getRow(row)) > 1) {
                    System.out.println("error row " + row + " column  " + column);
                }
                if (countNumbersInSet(number, getColumn(column)) > 1) {
                    System.out.println("error row " + row + " column  " + column);
                }
                if (countNumbersInSet(number, getSquare(getNumberSquare(row, column))) > 1) {
                    System.out.println("error row " + row + " column  " + column);
                }
            }
        }


    }


}

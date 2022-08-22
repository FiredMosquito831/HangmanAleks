package tictactoe;

public class CheckXandOWins {
    public static void checkWins(char [][] matrix) {
        String checkDiagLeft = "";
        String checkDiagRight = "";
        String checkRowUpDown = "";
        String checkRowRightLeft = "";
        byte checkWinsX = 0;
        byte checkWinsO = 0;
        for (int i = 0; i < matrix.length; i ++) {
            checkDiagLeft += matrix[i][i];
        }
        if (checkDiagLeft.equals("XXX")) {
            checkWinsX ++;
        } else if (checkDiagLeft.equals("OOO")) {
            checkWinsO ++;
        }
        int k = matrix.length - 1;
        int l = 0;
        while (k >= 0 && l < matrix.length) {
            checkDiagRight += matrix[k][l];
            k --;
            l ++;
        }
        if (checkDiagRight.equals("XXX")) {
            checkWinsX ++;
        } else if (checkDiagRight.equals("OOO")) {
            checkWinsO ++;
        }

        for (int i = 0; i < matrix.length; i ++) {
            checkRowRightLeft = "";
            checkRowUpDown = "";
            for (int j = 0; j < matrix.length; j ++) {
                checkRowRightLeft += matrix[i][j];
                checkRowUpDown += matrix[j][i];
            }
            if (checkRowUpDown.equals("XXX")) {
                checkWinsX ++;
            } else if (checkRowUpDown.equals("OOO")) {
                checkWinsO ++;
            } else {
                checkRowUpDown = "";
            }
            if (checkRowRightLeft.equals("XXX")) {
                checkWinsX ++;
            } else if (checkRowRightLeft.equals("OOO")) {
                checkWinsO ++;
            } else {
                checkRowRightLeft = "";
            }
        }
        int count1 = 0;
    if (checkWinsO == 1 && checkWinsX == 0) {
    System.out.println("O wins");
    System.exit(0);
    } else if (checkWinsX == 1 && checkWinsO == 0) {
        System.out.println("X wins");
        System.exit(0);
    } else {
        for (char [] chars : matrix) {
            for (char char1 : chars) {
                if (char1 == ' ') {
                    count1 ++;
                }
            }
        }
        if (count1 == 0) {
            System.out.println("Draw");
            System.exit(0);
        } else {
            count1 = 0;
        }
    }
    }
}
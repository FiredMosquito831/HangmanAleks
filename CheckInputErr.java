/* package tictactoe;

public class CheckInputErr {
    public static void inputCheck(char[][] matrix, String position, char lastMove) {
        int pos1 = Integer.parseInt(String.valueOf(position.charAt(0))) - 1;
        int pos2 = Integer.parseInt(String.valueOf(position.charAt(2))) - 1;
        if (!position.contains("1") && !position.contains("2") && !position.contains("3") &&
                !position.contains("4") && !position.contains("5") && !position.contains("6") &&
                !position.contains("7") && !position.contains("8") && !position.contains("9") &&
                !position.contains("0")) {
            System.out.println("You should enter numbers!");
        } else if (position.charAt(0) < '1' || position.charAt(2) > '3') {
            System.out.println("Coordinates should be from 1 to 3!");
        } else if (matrix[pos1][pos2] > 'X' || matrix[pos1][pos2] < 'X' &&
                matrix[pos1][pos2] > 'O' || matrix[pos1][pos2] < 'O') {
            if (lastMove == 'X') {
                matrix[pos1][pos2] = 'O';
                lastMove = 'O';
            } else if (lastMove == 'O'){
                matrix[pos1][pos2] = 'X';
                lastMove = 'X';
            }
            output.printingOutput(matrix);
            CheckXandOWins.checkWins(matrix);
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }
} */
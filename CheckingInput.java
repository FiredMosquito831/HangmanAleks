/* package tictactoe;

public class CheckingInput {
    public static void checkMatrix(char[][] matrix, String lista) {

        boolean checkPossible = true;
        boolean checkDraw = true;
        byte counterCheckPossibleX = 0;
        byte counterCheckPossibleO = 0;
        for (int i = 0; i < lista.length(); i ++) {
            if (lista.charAt(i) == 'X') {
                counterCheckPossibleX ++;
            }
            if (lista.charAt(i) == 'O') {
                counterCheckPossibleO ++;
            }
        } if (counterCheckPossibleX - counterCheckPossibleO > 1 ||
        counterCheckPossibleO - counterCheckPossibleX > 1) {
            System.out.println("Impossible");
            System.exit(0);
        }


        CheckXandOWins.checkWins(matrix);


        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0;j < matrix[i].length; j ++) {
                if (matrix[i][j] != 'X' && matrix[i][j] != 'O') {
                    System.out.println("Game not finished");
                    System.exit(0);
                }
            }
        }
        System.out.println("Draw");
        checkDraw = true; //lol
    }
}  */
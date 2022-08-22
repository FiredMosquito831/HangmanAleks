package tictactoe;

public class ReadingInput {
    public static void Input(char[][] list) {

        /* String lista = input.nextLine();
        int k = 0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3;j ++) {
                list[i][j] = lista.charAt(k);
                k ++;
            }
        }

        for (int i = 0; i < lista.length(); i ++) {
            if (lista.charAt(i) == 'X') {
                lastMove = 'X';
            } else if (lista.charAt(i) == 'O') {
                lastMove = 'O';
            }
        } */
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                list[i][j] = ' ';
            }
        }
        RunLiveGame.LiveGame(list);
    }
}
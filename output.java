package tictactoe;

public class output {
    public static void printingOutput(char [][] list) {
        System.out.println("---------");
        for (char[] chars : list) {
            System.out.print("| ");
            for (int j = 0; j < chars.length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}

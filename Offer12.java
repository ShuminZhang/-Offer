import java.util.*;

public class Offer12 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != words[k]) {
            return false;
        }

        if (k == words.length - 1) {
            return true;
        }

        board[i][j] = '\0';

        boolean res = dfs(board, words, i - 1, j, k + 1) || dfs(board, words, i + 1, j, k + 1) ||
                dfs(board, words, i, j - 1, k + 1) || dfs(board, words, i, j + 1, k + 1);

        board[i][j] = words[k];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行数：");
        int row = sc.nextInt();
        System.out.println("输入列数：");
        int column = sc.nextInt();
        String[] temp = new String[row + 1];
        System.out.println("输入数组：");
        for (int i = 0; i < row; i++) {
            temp[i] = sc.next();
        }

        char[][] board = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = temp[i].charAt(j);
                System.out.println(board[i][j]);
            }
        }

        System.out.println("输入需要匹配的字符串：");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Offer12 o = new Offer12();
        System.out.println(o.exist(board, str));

        sc.close();
        s.close();
    }
}

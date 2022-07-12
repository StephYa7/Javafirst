public class ex008 {
    public static void main(String[] args) {
        int[][] board = new int[5][5];
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[1].length; j++)
                setHorse(board, i, j, 1);
        }

    }

    public static void showArray(int[][] board) {
        for (int[] i : board) {
            for (int j : i) {
                System.out.printf("%3d", j);
            }
            System.out.println("");
        }

    }

    public static void setHorse(int[][] board, int X, int Y, int count) {

        if (count > board.length * board[0].length) {
            showArray(board);
            System.out.println("");
            return;

        }
        if (X < 0 || Y < 0 || X >= board.length || Y >= board[0].length || board[X][Y] != 0)
            return;
        board[X][Y] = count;
        setHorse(board, X + 2, Y + 1, count + 1);
        setHorse(board, X + 2, Y - 1, count + 1);
        setHorse(board, X - 2, Y + 1, count + 1);
        setHorse(board, X - 2, Y - 1, count + 1);
        setHorse(board, X + 1, Y + 2, count + 1);
        setHorse(board, X + 1, Y - 2, count + 1);
        setHorse(board, X - 1, Y + 2, count + 1);
        setHorse(board, X - 1, Y - 2, count + 1);
        board[X][Y] = 0;

    }
}

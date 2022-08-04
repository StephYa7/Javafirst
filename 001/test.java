import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class test {
    public static void main(String[] args) {

        String xStart = "1";
        String yStart = "1";
        int xSize = 12;
        int ySize = 12;
        int xFinish = 9;
        int yFinish = 9;
        String[][] board = new String[xSize][ySize];

        paintBoard(board, xFinish, yFinish);

        setBoard(board, xStart, yStart);

        showBoard(board);

        System.out.println(wayToStart(board, xFinish, yFinish));

    }

    public static ArrayList<String> wayToStart(String[][] board, int xFinish, int yFinish) {

        ArrayList<String> result = new ArrayList<String>();

        if (isNumber(board[xFinish][yFinish]) == false) {
            result.add("Нет решений");
            return result;
        }

        while (Integer.parseInt(board[xFinish][yFinish]) > 1) {
            System.out.println(board[xFinish][yFinish]);

            if (isNumber(board[xFinish - 1][yFinish]) == true) {
                System.out.println(board[xFinish-1][yFinish]);
                if (Integer.parseInt(board[xFinish - 1][yFinish]) + 1 == Integer.parseInt(board[xFinish][yFinish])) {
                    xFinish -= 1;
                    continue;                    
                }
            }
            if (isNumber(board[xFinish + 1][yFinish]) == true) {
                System.out.println(board[xFinish+1][yFinish]);
                if (Integer.parseInt(board[xFinish - 1][yFinish]) + 1 == Integer.parseInt(board[xFinish][yFinish])) {
                    xFinish += 1;
                    continue;
                    
                }
            }
            if (isNumber(board[xFinish][yFinish + 1]) == true) {
                System.out.println(board[xFinish][yFinish-1]);
                if (Integer.parseInt(board[xFinish - 1][yFinish]) + 1 == Integer.parseInt(board[xFinish][yFinish])) {
                    yFinish += 1;
                    continue;
                    
                }
            }
            if (isNumber(board[xFinish][yFinish - 1]) == true) {
                System.out.println(board[xFinish][yFinish+1]);
                if (Integer.parseInt(board[xFinish][yFinish + 1]) + 1 == Integer.parseInt(board[xFinish][yFinish])) {
                    yFinish -= 1;
                    continue;
                    
                }
            }

            

            // result.add("{ x =" + Integer.toString(xFinish));
            // result.add("{ y =" + Integer.toString(yFinish) + "}" );
            // System.out.println(result);


        }

        return result;

    }

    private static boolean isNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // public class CoordPair<X,Y>{

    // }

    public static void setBoard(String[][] board, String xStart, String yStart) {
        int count = 1;
        Stack<String> bufSetNext = new Stack<>();
        Stack<String> bufSet = new Stack<>();

        bufSetNext.push(xStart);
        bufSetNext.push(yStart);

        while (!bufSetNext.isEmpty() || !bufSetNext.isEmpty()) {

            while (!bufSetNext.isEmpty()) {
                int y = Integer.parseInt(bufSetNext.pop());
                int x = Integer.parseInt(bufSetNext.pop());
                if (board[x + 1][y] == "O") {
                    board[x + 1][y] = Integer.toString(count);
                    bufSet.push(Integer.toString(x + 1));
                    bufSet.push(Integer.toString(y));
                }
                if (board[x][y + 1] == "O") {
                    board[x][y + 1] = Integer.toString(count);
                    bufSet.push(Integer.toString(x));
                    bufSet.push(Integer.toString(y + 1));
                }
                if (board[x - 1][y] == "O") {
                    board[x - 1][y] = Integer.toString(count);
                    bufSet.push(Integer.toString(x - 1));
                    bufSet.push(Integer.toString(y));
                }
                if (board[x][y - 1] == "O") {
                    board[x][y - 1] = Integer.toString(count);
                    bufSet.push(Integer.toString(x));
                    bufSet.push(Integer.toString(y - 1));
                }
            }
            count += 1;
            while (!bufSet.isEmpty()) {
                int y = Integer.parseInt(bufSet.pop());
                int x = Integer.parseInt(bufSet.pop());
                if (board[x + 1][y] == "O") {
                    board[x + 1][y] = Integer.toString(count);
                    bufSetNext.push(Integer.toString(x + 1));
                    bufSetNext.push(Integer.toString(y));
                }
                if (board[x][y + 1] == "O") {
                    board[x][y + 1] = Integer.toString(count);
                    bufSetNext.push(Integer.toString(x));
                    bufSetNext.push(Integer.toString(y + 1));
                }
                if (board[x - 1][y] == "O") {
                    board[x - 1][y] = Integer.toString(count);
                    bufSetNext.push(Integer.toString(x - 1));
                    bufSetNext.push(Integer.toString(y));
                }
                if (board[x][y - 1] == "O") {
                    board[x][y - 1] = Integer.toString(count);
                    bufSetNext.push(Integer.toString(x));
                    bufSetNext.push(Integer.toString(y - 1));
                }
            }
            count += 1;

        }
        board[Integer.parseInt(xStart)][Integer.parseInt(yStart)] = "0";
    }

    // public static String[][] board = new String[xSize][ySize];

    public static void paintBoard(String[][] board, int xFinish, int yFinish) {
        Random random = new Random();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int pointRandom = random.nextInt(11);
                if (pointRandom > 9)
                    board[i][j] = "X";
                else
                    board[i][j] = "O";

            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1) {
                    board[i][j] = "X";
                }

            }
        }

        board[xFinish][yFinish] = "O";
        // board[random.nextInt(board.length-1)][random.nextInt(board[0].length-1)] =
        // "F";

    }

    public static void showBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf(board[i][j]);
                System.out.printf(" ");
            }
            System.out.println("");
        }
    }
}
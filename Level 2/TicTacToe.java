
import java.util.Scanner;
public class TicTacToe {
   
static final int SIZE = 3;
    static char[][] board = new char[SIZE][SIZE];
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        method();
    }
    static void initializeBoard() {
        currentPlayer = 'X';
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }
    static void printBoard() {

        System.out.println("Current Board:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + board[i][j] + " ");

                if (j < SIZE - 1) System.out.print("|");
            }
            System.out.println();
            if (i < SIZE - 1) {
                System.out.println("---|---|---");
            }
        }
    }
    static boolean isWin() {
        // Check rows and columns
        for (int i = 0; i < SIZE; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }
    static boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    static void playGame(Scanner scanner) {
        boolean gameEnded = false;
        while (!gameEnded) {
            printBoard();
            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt()-1;
            int col = scanner.nextInt()-1;
            scanner.nextLine(); // Consume newline

            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != ' ') {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = currentPlayer;

            if (isWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isDraw()) {
                printBoard();
                System.out.println("The game is a draw!");
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }
    static void method() {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            initializeBoard();
            playGame(scanner);
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.nextLine().equalsIgnoreCase("y");
        } while (playAgain);

        scanner.close();    
    }




}

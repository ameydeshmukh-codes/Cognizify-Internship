
import java.util.Scanner;
public class TicTacToe {
    
    static final int BOARD_SIZE = 3;
    static char[][] gameBoard = new char[BOARD_SIZE][BOARD_SIZE];
    static char activePlayer = 'X';

    public static void main(String[] args) {
        startGameLoop();
    }

    static void resetGame() {

        activePlayer = 'X'; 
        
        // Clear the board
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                gameBoard[i][j] = ' ';
            }
        }
    }

    static void displayBoard() {
        System.out.println("\n--- Current Game ---");
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(" " + gameBoard[i][j] + " ");
                if (j < BOARD_SIZE - 1) System.out.print("|");
            }
            System.out.println();
            if (i < BOARD_SIZE - 1) {
                System.out.println("---|---|---");
            }
        }
        System.out.println();
    }

    static boolean checkWinner() {
        // Scan rows and cols
        for (int i = 0; i < BOARD_SIZE; i++) {
            boolean rowWin = (gameBoard[i][0] == activePlayer && gameBoard[i][1] == activePlayer && gameBoard[i][2] == activePlayer);
            boolean colWin = (gameBoard[0][i] == activePlayer && gameBoard[1][i] == activePlayer && gameBoard[2][i] == activePlayer);
            
            if (rowWin || colWin) return true;
        }
        // Scan diagonals
        boolean d1 = (gameBoard[0][0] == activePlayer && gameBoard[1][1] == activePlayer && gameBoard[2][2] == activePlayer);
        boolean d2 = (gameBoard[0][2] == activePlayer && gameBoard[1][1] == activePlayer && gameBoard[2][0] == activePlayer);
        
        return d1 || d2;
    }

    static boolean checkDraw() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (gameBoard[i][j] == ' ') return false; // Found an empty spot, keep playing
            }
        }
        return true;
    }

    static void processTurn(Scanner input) {
        boolean matchOver = false;

        while (!matchOver) {
            displayBoard();
            int r = -1;
            int c = -1;
            boolean validMove = false;

            // Robust Input Validation Loop
            while (!validMove) {
                System.out.print("Player " + activePlayer + ", choose row (1-3) and column (1-3): ");
                
                if (input.hasNextInt()) {
                    r = input.nextInt() - 1; // Convert 1-3 to 0-2
                    c = input.nextInt() - 1;
                    
                    // Logic check
                    if (r >= 0 && r < BOARD_SIZE && c >= 0 && c < BOARD_SIZE && gameBoard[r][c] == ' ') {
                        validMove = true;
                    } else {
                        System.out.println("Error: Spot taken or out of bounds.");
                    }
                } else {
                    System.out.println("Error: Please enter numbers only.");
                    input.next(); // Clear bad input
                }
            }
            input.nextLine(); // Clear newline buffer

            // Apply Move
            gameBoard[r][c] = activePlayer;

            // Check Status
            if (checkWinner()) {
                displayBoard();
                System.out.println("*** Player " + activePlayer + " Wins! ***");
                matchOver = true;
            } else if (checkDraw()) {
                displayBoard();
                System.out.println("It's a Draw!");
                matchOver = true;
            } else {
                // Switch Turns
                activePlayer = (activePlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    static void startGameLoop() {
        Scanner input = new Scanner(System.in);
        String response;

        do {
            resetGame();
            processTurn(input);
            System.out.print("Play another round? (y/n): ");
            response = input.nextLine();
        } while (response.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}

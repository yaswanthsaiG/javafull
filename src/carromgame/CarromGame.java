package carromgame;


    import java.util.Scanner;

public class CarromGame {
        private CarromBoard board;
        private Player player1;
        private Player player2;
        private Player currentPlayer;

        public CarromGame(String player1Name, String player2Name) {
            board = new CarromBoard();
            player1 = new Player(player1Name);
            player2 = new Player(player2Name);
            currentPlayer = player1;
        }

        private void switchPlayer() {
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        public void play() {
            Scanner scanner = new Scanner(System.in);
            while (!board.isEmpty()) {
                System.out.println(currentPlayer.getName() + "'s turn");
                System.out.println("Enter 1 to pocket white coin, 2 to pocket black coin:");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        if (board.getWhiteCoins() > 0) {
                            board.removeWhiteCoin();
                            currentPlayer.addScore(1);
                        } else {
                            System.out.println("No white coins left.");
                        }
                        break;
                    case 2:
                        if (board.getBlackCoins() > 0) {
                            board.removeBlackCoin();
                            currentPlayer.addScore(1);
                        } else {
                            System.out.println("No black coins left.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
                switchPlayer();
            }

            // Display the winner
            if (player1.getScore() > player2.getScore()) {
                System.out.println(player1.getName() + " wins with score: " + player1.getScore());
            } else if (player2.getScore() > player1.getScore()) {
                System.out.println(player2.getName() + " wins with score: " + player2.getScore());
            } else {
                System.out.println("It's a draw!");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Player 1 name:");
            String player1Name = scanner.nextLine();
            System.out.println("Enter Player 2 name:");
            String player2Name = scanner.nextLine();

            CarromGame game = new CarromGame(player1Name, player2Name);
            game.play();
        }
    }


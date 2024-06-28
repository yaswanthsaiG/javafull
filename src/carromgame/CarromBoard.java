package carromgame;

public class CarromBoard {

        private int whiteCoins;
        private int blackCoins;

        public CarromBoard() {
            whiteCoins = 9; // Usually, there are 9 white coins
            blackCoins = 9; // Usually, there are 9 black coins
        }

        public int getWhiteCoins() {
            return whiteCoins;
        }

        public int getBlackCoins() {
            return blackCoins;
        }

        public void removeWhiteCoin() {
            if (whiteCoins > 0) {
                whiteCoins--;
            }
        }

        public void removeBlackCoin() {
            if (blackCoins > 0) {
                blackCoins--;
            }
        }

        public boolean isEmpty() {
            return whiteCoins == 0 && blackCoins == 0;
        }
    }



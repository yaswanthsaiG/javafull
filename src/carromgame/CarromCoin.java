package carromgame;

public class CarromCoin {

        public enum CoinType {
            WHITE,
            BLACK,
            QUEEN
        }

        private CoinType type;

        public CarromCoin(CoinType type) {
            this.type = type;
        }

        public CoinType getType() {
            return type;
        }
    }


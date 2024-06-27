package carromgame;


public class Player {
    private final String name;
    private int score;

    // Constructor to initialize the player's name and score
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Getter method for player's name
    public String getName() {
        return name;
    }

    // Getter method for player's score
    public int getScore() {
        return score;
    }

    // Method to add points to player's score
    public void addScore(int points) {
        score += points;
    }
}

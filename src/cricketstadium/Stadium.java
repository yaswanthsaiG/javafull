package cricketstadium;

public class Stadium {
    private final int seatingCapacity;

    public Stadium(String ignoredLocation, int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}

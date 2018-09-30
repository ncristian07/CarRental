package ro.jademy.carrental.cars.components.body;

public class DoorNumberType {

    private int twoDoors;
    private int fourDoors;
    private int sixDoors;

    public DoorNumberType(int twoDoors, int fourDoors, int sixDoors) {
        this.twoDoors = twoDoors;
        this.fourDoors = fourDoors;
        this.sixDoors = sixDoors;
    }

    public int getTwoDoors() {
        return twoDoors;
    }

    public int getFourDoors() {
        return fourDoors;
    }

    public int getSixDoors() {
        return sixDoors;
    }
}

// derived class
class MountainBike extends Bicycle {
    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    MountainBike(int gear, int speed, int seatHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    // the MountainBike subclass adds one more method
    public void setHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    // overriding toString() method of Bicycle to print more info
    public String toString() {
        return (super.toString() + "\nSeat height is "
                + seatHeight);
    }
}


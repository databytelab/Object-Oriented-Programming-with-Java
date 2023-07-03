// SuperClass (Parent Class)
class Bicycle {
    // the Bicycle class has two fields
    private int gear;
    private int speed;
    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    // the Bicycle class has three methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    // toString() method to print info of Bicycle
    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "Speed of bicycle is " + speed);
    }
}

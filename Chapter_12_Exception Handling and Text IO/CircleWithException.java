public class CircleWithException {
    /* The radius of the circle */
    private double radius;

    /* The number of objects created */
    public static int numberOfObjects = 0;

    /* Construct a circle with radius 1 */
    public CircleWithException() {
        this(1.0);
    }

    /* Construct a circle with a specified radius */
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    /* Set a new radius */
    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius > 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }

    /* Return radius */
    public double getRadius() {
        return radius;
    }

    /* Return number of objects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /* Return area of the circle */
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

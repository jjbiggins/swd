public class Rectangle extends Quadrilateral{

    private int angleDegrees;

    public Rectangle(String name, String type, double length, double width, int angleDegrees) {
        super(name, type, length, width);

        if(angleDegrees != 90)
            throw new IllegalArgumentException(
                    "Angle Degrees must be 90 Degrees");

        this.angleDegrees = angleDegrees;
    }

    public int getAngleDegrees() {
        return angleDegrees;
    }

    public void setAngleDegrees(int angleDegrees) {
        this.angleDegrees = angleDegrees;
    }
}

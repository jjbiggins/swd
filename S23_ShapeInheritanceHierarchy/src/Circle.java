public class Circle extends Shape2D{

    private double radius;

    public Circle(String name, String type, double radius){
        super(name, type);
        this.radius = radius;
    }

    @Override
    public void setArea(double radius1, double radius2){
        super.setArea(Math.PI, radius2 * radius1);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Shape2D extends Shape {

    private double area;
    private double perimeter;

    public Shape2D(String name, String type){
        super(name, type);
    }


    public double getArea() {
        return area;
    }

    public void setArea(double side1, double side2) {
        this.area = side1 * side2;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double side1, double side2) {
        this.perimeter = 2*(side1 + side2);
    }
}

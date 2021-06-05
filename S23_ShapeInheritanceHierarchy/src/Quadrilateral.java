public class Quadrilateral extends Shape2D {

    private double length;
    private double width;

    public Quadrilateral(String name, String type){
        super(name, type);
        length = 1;
        width = 1;
    }


    public Quadrilateral(String name, String type, double length, double width){
        super(name, type);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

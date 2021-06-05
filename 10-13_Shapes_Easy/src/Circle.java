public class Circle extends TwoDimensionalShape {

    private int radius;

    public Circle(int radius, String typeOfShape){
        super(typeOfShape);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return (Math.PI * radius * radius);
    }
}

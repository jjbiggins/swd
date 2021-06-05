public class Rectangle extends TwoDimensionalShape{

    private int length;
    private int width;

    public Rectangle(int length, int width, String typeOfShape){
        super(typeOfShape);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }
}

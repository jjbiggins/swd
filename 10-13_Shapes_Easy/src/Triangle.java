public class Triangle extends TwoDimensionalShape {

    private int base;
    private int height;

    public Triangle(int base, int height, String typeOfShape){
        super(typeOfShape);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
}

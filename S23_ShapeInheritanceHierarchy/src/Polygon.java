public class Polygon extends Shape{

    private final int numberOfSides;

    public Polygon(String nameOfShape, String typeOfShape, int numberOfSides){
        super(nameOfShape, typeOfShape);
        this.numberOfSides = numberOfSides;
    }
}

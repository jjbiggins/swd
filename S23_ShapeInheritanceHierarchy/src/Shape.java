public class Shape {

    private final String nameOfShape;
    private final String typeOfShape;

    Shape(String nameOfShape, String typeOfShape){
        this.nameOfShape = nameOfShape;
        this.typeOfShape = typeOfShape;
    }

    public String getName(){return nameOfShape;}
}

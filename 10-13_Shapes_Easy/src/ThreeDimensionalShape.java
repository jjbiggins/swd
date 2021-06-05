public abstract class ThreeDimensionalShape extends Shape {


    public ThreeDimensionalShape(String typeOfShape){
        super(typeOfShape);
    }


    public abstract double getArea();

    public abstract double getVolume();
}

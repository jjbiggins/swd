public class Sphere extends ThreeDimensionalShape {

    private int radius;

    public Sphere(int radius, String typeOfShape){
        super(typeOfShape);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume(){
        return ((4/3) * Math.PI * radius * radius * radius);
    }

}

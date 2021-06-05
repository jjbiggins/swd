public class Tetrahedron extends ThreeDimensionalShape{

    private int sideLength;
    
    public Tetrahedron(int sideLength, String typeOfShape){
        super(typeOfShape);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea(){
        return Math.sqrt(3) * sideLength;
    }

    @Override
    public double getVolume(){
        return ((sideLength * sideLength * sideLength) / (6 * Math.sqrt(2)));
    }
}

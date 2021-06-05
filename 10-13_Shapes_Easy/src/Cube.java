public class Cube extends ThreeDimensionalShape {

    private int length;
    private int width;
    private int height;

    public Cube(int length, int width, int height, String typeOfString){
        super(typeOfString);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return (2 * ((length * width) + (length * height) + (width * height)));
    }

    @Override
    public double getVolume(){
        return length * width * height;
    }
}

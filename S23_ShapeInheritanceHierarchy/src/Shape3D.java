public class Shape3D extends Shape{

    private double volume;
    private double surfaceArea;

    public Shape3D(String name, String type){
        super(name, type);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
}

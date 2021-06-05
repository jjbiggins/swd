public class ShapePolymorphismTest {
    public static void main(String[] args){

        Circle circle = new Circle(6,"Circle");

        Sphere sphere = new Sphere(6, "Sphere");

        Rectangle rectangle = new Rectangle(4, 5, "Rectangle");

        Cube cube = new Cube(4, 4, 5, "Rectangular Prism");

        Triangle triangle = new Triangle(6, 5, "Triangle");

        Tetrahedron tetrahedron = new Tetrahedron(6, "Tetrahedron");

        Shape[] shapes = new Shape[6];
        shapes[0] = circle;
        shapes[1] = sphere;
        shapes[2] = rectangle;
        shapes[3] = cube;
        shapes[4] = triangle;
        shapes[5] = tetrahedron;

        for(Shape currentShape : shapes){

            System.out.print(currentShape.getTypeOfShape());

            if(currentShape instanceof TwoDimensionalShape){

                TwoDimensionalShape shape2D = (TwoDimensionalShape) currentShape;
                System.out.println(" has an area of " + shape2D.getArea());
            }
            else if(currentShape instanceof  ThreeDimensionalShape){

                ThreeDimensionalShape shape3D = (ThreeDimensionalShape) currentShape;
                System.out.print(" has a surface area of " + shape3D.getArea());
                System.out.println(" and a volume of " + shape3D.getVolume());
            }

            System.out.println("");
        }

    }
}

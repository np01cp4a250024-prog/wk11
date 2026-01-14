package w11;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(10, 9);
        shapes[1] = new Circle(10);

        for (Shape shape : shapes) {
            shape.displayShapeInfo();
            {
                ((Drawable) shape).draw();
            }
        }
    }
}

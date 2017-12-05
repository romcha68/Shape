import com.brainacad.oop.testshapes.Circle;
import com.brainacad.oop.testshapes.Rectangle;
import com.brainacad.oop.testshapes.Shape;
import com.brainacad.oop.testshapes.Triangle;

/**
 * Created by User on 01.12.2017.
 */
public class Main {
    public static void main(String[] args){
        Shape shape = new Shape("RED");
        Shape circle = new Circle("GREEN", 10);
        Shape rectangle = new Rectangle("RED", 11, 22);
        Shape triangle = new Triangle("BLACK", 5, 5, 5);

        Shape[] array = new Shape[9];
        array[0] = new Rectangle("RED", 11, 22);
        array[1] = new Rectangle("RED", 11, 22);
        array[2] = new Rectangle("RED", 11, 22);
        array[3] = new Rectangle("RED", 11, 22);
        array[4] = new Rectangle("RED", 11, 22);
        array[5] = new Circle("GREEN", 10);
        array[6] = new Circle("Green", 10);
        array[7] = new Triangle("BLACK", 5, 5, 5);
        array[8] = new Triangle("BLACK", 5, 5, 5);

        for(Shape shaper:array){
            System.out.println(shaper.toString() + " " + shaper.calcArea());
        }

        System.out.println("This is " + shape.toString());
        System.out.println("Shape area is: " + shape.calcArea());
        System.out.println("This is " + circle.toString());
        System.out.println("Shape area is: " + circle.calcArea());
        System.out.println("This is " + rectangle.toString());
        System.out.println("Shape area is: " + rectangle.calcArea());
        System.out.println("This is " + triangle.toString());
        System.out.println("Shape area is: " + triangle.calcArea());
    }
}

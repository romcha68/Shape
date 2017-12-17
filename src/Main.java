import com.brainacad.oop.testshapes.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by User on 01.12.2017.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.next()); //??? scanner.nextInt();

        Shape[] shapes = new Shape[arraySize];
        for(int i = 0; i < shapes.length; i++) {
            shapes[i] = Shape.parseShape(scanner.next());
        }

        for(Shape shape : shapes) {
            shape.draw();
        }
    }
}

package Factories;

import ColorsShapes.RedRectangle;
import ColorsShapes.RedSquare;
import ColorsShapes.RedCircle;
import Shapes.Shape;

public class RedShapeFactory extends AbstractFactory {

    public Shape getCircle(float ray) {
        return new RedCircle(ray);
    }

    public Shape getRectangle(float base) {
        return new RedRectangle(base);
    }

    public Shape getSquare(float height) {
        return new RedSquare(height);
    }
}

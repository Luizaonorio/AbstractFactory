package Factories;

import ColorsShapes.BlueRectangle;
import ColorsShapes.BlueSquare;
import ColorsShapes.BlueCircle;
import Shapes.Shape;

public class BlueShapeFactory extends AbstractFactory {

    public Shape getCircle(float ray) {
        return new BlueCircle(ray);
    }

    public Shape getRectangle(float base) {
        return new BlueRectangle(base);
    }

    public Shape getSquare(float height) {
        return new BlueSquare(height);
    }
}

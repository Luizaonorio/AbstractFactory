package Factories;

import Shapes.Shape;

public abstract class AbstractFactory {

    public abstract Shape getCircle(float ray);

    public abstract Shape getRectangle(float base);

    public abstract Shape getSquare(float height);

}

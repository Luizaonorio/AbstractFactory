package ColorsShapes;

import Shapes.Circle;

public class BlueCircle extends Circle {

    public BlueCircle(float ray) {
        super(ray, "BLUE");
    }

    public void draw() {
        System.out.println("Dentro do Circulo " + getColor()
                + " de raio " + getRay() + " no método draw()" );
    }
}

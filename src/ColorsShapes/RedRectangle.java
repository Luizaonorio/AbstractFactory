package ColorsShapes;

import Shapes.Rectangle;

public class RedRectangle extends Rectangle {

    public RedRectangle(float base) {
        super(base, "Red");
    }

    public void draw() {
        System.out.println("Dentro de Retangulo " + getColor()
                + " de base " + getBase() + " no método draw()");
    }
}

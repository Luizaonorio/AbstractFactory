package ColorsShapes;

import Shapes.Square;

public class BlueSquare extends Square {

    public BlueSquare(float height) {
        super(height, "BLUE");
    }
    public void draw() {
        System.out.println("Dentro de Triangulo " + getColor()
                + " de altura " + getHeigth() + " no método draw()");
    }
}

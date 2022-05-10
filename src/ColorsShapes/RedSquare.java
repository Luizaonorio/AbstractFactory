package ColorsShapes;

import Shapes.Square;

public class RedSquare extends Square {

    public RedSquare(float height) {
        super(height, "RED");
    }

    public void draw() {
        System.out.println("Dentro de Triangulo " + getColor()
                + " de altura " + getHeigth() + " no método draw()");
    }

}

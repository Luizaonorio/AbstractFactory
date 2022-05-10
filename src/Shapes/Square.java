package Shapes;

public abstract class Square extends Shape {

    private float heigth;

    public Square(float height, String color) {
        super(color);
        this.heigth = heigth;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }
}

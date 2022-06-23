import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;
import org.junit.Test;

public class MainUnitTest {

    @Test
    public void testRectangle() {
        Rectangle defaultRectangle = new Rectangle();

        Rectangle customRectangle = new Rectangle();
        customRectangle.setHeight(5.3);
        customRectangle.setWidth(3.8);
        customRectangle.setColor("orange");
        customRectangle.setFilling(true);

        Rectangle customRectangle2 = new Rectangle("purple", true, 3.4, 1.9);

        printShape(defaultRectangle);
        printShape(customRectangle);
        printShape(customRectangle2);
    }

    @Test
    public void testCircle() {
        Circle defaultCircle = new Circle();

        Circle customCircle = new Circle();
        customCircle.setRadius(3.7);
        customCircle.setColor("cyan");
        customCircle.setFilling(false);

        Circle customCircle2 = new Circle("green", false, 5.6);

        printShape(defaultCircle);
        printShape(customCircle);
        printShape(customCircle2);
    }

    @Test
    public void testSquare() {
        Square defaultSquare = new Square();

        Square customSquare = new Square();
        customSquare.setColor("black");
        customSquare.setFilling(true);
        customSquare.setSide(5);

        Square customSquare2 = new Square(7.6);

        Square customSquare3 = new Square("yellow", true, 8.2);

        printShape(defaultSquare);
        printShape(customSquare);
        printShape(customSquare2);
        printShape(customSquare3);
    }

    public void printShape(Shape shape) {
        System.out.println(shape + ", area=" + shape.getArea() + ", circumference=" + shape.getCircumference());
    }

}

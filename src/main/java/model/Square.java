package model;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(callSuper = true)
@NoArgsConstructor
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filling, double side) {
        super(color, filling, side, side);
    }

    public void setSide(double side) {
        setHeight(side);
        setWidth(side);
    }

    public double getSide() {
        return super.getWidth();
    }


}

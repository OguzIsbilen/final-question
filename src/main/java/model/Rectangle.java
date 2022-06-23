package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Rectangle extends Shape {

    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(String color, boolean filling, double width, double height) {
        super(color, filling);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (width * height);
    }

    public double getCircumference() {
        return (2 * (width + height));
    }

}

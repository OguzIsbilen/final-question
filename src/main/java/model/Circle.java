package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Circle extends Shape {

    private double radius = 1.0;

    public Circle(String color, boolean filling, double radius) {
        super(color, filling);
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }

}

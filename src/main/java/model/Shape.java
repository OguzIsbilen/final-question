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
@ToString
public abstract class Shape {

    private String color = "blue";
    private boolean filling = true;

    public abstract double getArea();

    public abstract double getCircumference();

}

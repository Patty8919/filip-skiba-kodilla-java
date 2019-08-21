<<<<<<< HEAD
package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private int r;
    private double pi = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r == circle.r &&
                Double.compare(circle.pi, pi) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, pi);
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return pi *(r*r);
    }
}
=======
package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private int r;
    private double pi = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r == circle.r &&
                Double.compare(circle.pi, pi) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, pi);
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return pi *(r*r);
    }
}
>>>>>>> 7259dfe96ba4b4a6129cc9ead52c842e94ca297f

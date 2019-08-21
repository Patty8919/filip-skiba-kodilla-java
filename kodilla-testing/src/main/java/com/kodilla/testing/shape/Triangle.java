<<<<<<< HEAD
package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                h == triangle.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, h);
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 100;
    }
}
=======
package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                h == triangle.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, h);
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 100;
    }
}
>>>>>>> 7259dfe96ba4b4a6129cc9ead52c842e94ca297f

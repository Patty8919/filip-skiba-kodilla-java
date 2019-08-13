package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList<Shape> shapesList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapesList.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapesList.contains(shape)){
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        Shape shape = null;
        if (n >= 0 && n < shapesList.size()){
            shape = shapesList.get(n);
        }
        return shape;
    }
    public ArrayList<Shape> showFigures(){
        return shapesList;
    }
    public int getShapesQuantity() {
        return shapesList.size();
    }
}

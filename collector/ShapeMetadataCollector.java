package com.latte.collector;

import com.latte.draw.Shape;
import com.latte.draw.ShapeDrawer;
import com.latte.erase.ShapeEraser;

public class ShapeMetadataCollector implements ShapeCollector {

    private static ShapeMetadataCollector instance;

    private Shape shape;
    private ShapeDrawer drawer;
    private ShapeEraser eraser;

    private ShapeMetadataCollector() {}

    public static ShapeMetadataCollector getInstance() {
        if (instance == null) {
            instance = new ShapeMetadataCollector();
        }
        return instance;
    }

    @Override
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void setShapeDrawer(ShapeDrawer drawer) {
        this.drawer = drawer;
    }

    @Override
    public void setShapeEraser(ShapeEraser eraser) {
        this.eraser = eraser;
    }

    @Override
    public void collectShape() {
        System.out.println("Collecting shape metadata...");
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Shape is not set. Please set a shape.");
        }
    }

    @Override
    public void printShape() {
        System.out.println("Printing shape metadata...");
        if (shape != null) {
            shape.erase();
        } else {
            System.out.println("Shape is not set. Please set a shape.");
        }
    }
}

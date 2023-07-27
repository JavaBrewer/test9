package com.latte.lc;

import com.latte.collector.ShapeCollector;
import com.latte.collector.ShapeMetadataCollector;
import com.latte.draw.Circle;
import com.latte.draw.CircleDrawer;
import com.latte.draw.Rectangle;
import com.latte.draw.RectangleDrawer;
import com.latte.draw.Shape;
import com.latte.draw.ShapeDrawer;
import com.latte.erase.CircleEraser;
import com.latte.erase.RectangleEraser;
import com.latte.erase.ShapeEraser;

public class Program {

    public static void setShapeCollector(ShapeCollector collector,
                                         Shape shape,
                                         ShapeDrawer drawer,
                                         ShapeEraser eraser) {
        collector.setShape(shape);
        collector.setShapeDrawer(drawer);
        collector.setShapeEraser(eraser);
    }

    public static void collectShape(ShapeCollector collector) {
        collector.collectShape();
    }

    public static void printShape(ShapeCollector collector) {
        collector.printShape();
    }

    public static void main(String[] args) {
        ShapeCollector collector = ShapeMetadataCollector.getInstance();

        Shape circle = new Circle();
        ShapeDrawer circleDrawer = CircleDrawer.getInstance();
        ShapeEraser circleEraser = CircleEraser.getInstance();

        setShapeCollector(collector, circle, circleDrawer, circleEraser);
        collectShape(collector);
        printShape(collector);

        Shape rectangle = new Rectangle();
        ShapeDrawer rectangleDrawer = RectangleDrawer.getInstance();
        ShapeEraser rectangleEraser = RectangleEraser.getInstance();

        setShapeCollector(collector, rectangle, rectangleDrawer, rectangleEraser);
        collectShape(collector);
        printShape(collector);
    }
}

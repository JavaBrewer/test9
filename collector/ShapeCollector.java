package com.latte.collector;

import com.latte.draw.Shape;
import com.latte.draw.ShapeDrawer;
import com.latte.erase.ShapeEraser;

public interface ShapeCollector {
    void setShape(Shape shape);
    void setShapeDrawer(ShapeDrawer drawer);
    void setShapeEraser(ShapeEraser eraser);
    void collectShape();
    void printShape();
}

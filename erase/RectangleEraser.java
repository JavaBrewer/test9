package com.latte.erase;

public class RectangleEraser implements ShapeEraser {

    private static RectangleEraser instance;

    private RectangleEraser() {}

    public static RectangleEraser getInstance() {
        if (instance == null) {
            instance = new RectangleEraser();
        }
        return instance;
    }

    @Override
    public void erase() {
        System.out.println("Erasing a rectangle");
    }

    @Override
    public void eraseWithPattern(String pattern) {
        System.out.println("Erasing a rectangle with pattern: " + pattern);
    }
}

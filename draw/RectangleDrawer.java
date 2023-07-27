package com.latte.draw;

public class RectangleDrawer implements ShapeDrawer {

    private static RectangleDrawer instance;

    private RectangleDrawer() {}

    public static RectangleDrawer getInstance() {
        if (instance == null) {
            instance = new RectangleDrawer();
        }
        return instance;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void drawWithPattern(String pattern) {
        System.out.println("Drawing a rectangle with pattern: " + pattern);
    }
}

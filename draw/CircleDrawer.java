package com.latte.draw;

public class CircleDrawer implements ShapeDrawer {

    private static CircleDrawer instance;

    private CircleDrawer() {}

    public static CircleDrawer getInstance() {
        if (instance == null) {
            instance = new CircleDrawer();
        }
        return instance;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void drawWithPattern(String pattern) {
        System.out.println("Drawing a circle with pattern: " + pattern);
    }
}

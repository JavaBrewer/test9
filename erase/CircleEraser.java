package com.latte.erase;

public class CircleEraser implements ShapeEraser {

    private static CircleEraser instance;

    private CircleEraser() {}

    public static CircleEraser getInstance() {
        if (instance == null) {
            instance = new CircleEraser();
        }
        return instance;
    }

    @Override
    public void erase() {
        System.out.println("Erasing a circle");
    }

    @Override
    public void eraseWithPattern(String pattern) {
        System.out.println("Erasing a circle with pattern: " + pattern);
    }
}

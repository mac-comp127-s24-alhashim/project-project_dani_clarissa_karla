package SizableButton;

import edu.macalester.graphics.CanvasWindow;

public class Example {
    public static void main(String[] args) {
        CanvasWindow window = new CanvasWindow("Big Button", 400, 400);
        Button jb = new Button("Test", 200, 200);
        jb.setPosition(100, 100);
        jb.onClick(() -> jb.setPosition(jb.getX() + 2, jb.getY() + 2));

        window.add(jb);
    }
}

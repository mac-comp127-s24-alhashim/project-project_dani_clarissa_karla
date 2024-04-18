import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;
// import edu.macalester.graphics.ui.Button;
import SizableButton.*;
import java.awt.Color;


public class basicdisplaysample {
    public CanvasWindow canvas;
    private static final int CANVAS_WIDTH = 1000;
    private static final int CANVAS_HEIGHT = 750;

    public Display(){
        canvas = new CanvasWindow("Other Window", CANVAS_WIDTH, CANVAS_HEIGHT);

        Rectangle outerbox = new Rectangle(0, 0, 155, 55);
        outerbox.setFillColor(new Color(255, 20, 147));
        outerbox.setStroked(false);
        outerbox.setCenter(CANVAS_WIDTH/2, 500);
        canvas.add(outerbox);
    
    }

    public static void main(String[] args) {
        canvas = new Display();
    }
}

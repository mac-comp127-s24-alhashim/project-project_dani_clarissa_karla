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
    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Other Window", CANVAS_WIDTH, CANVAS_HEIGHT);

        Rectangle outerbox = new Rectangle(50, 90, 275, 150);
        outerbox.setFillColor(new Color(255, 111, 0));
        outerbox.setStroked(false);
        canvas.add(outerbox);

        GraphicsText boxText1 = new GraphicsText("Colors");
        boxText1.setFont("Times New Roman", FontStyle.PLAIN, 25);
        boxText1.setCenter(175,125);
        canvas.add(boxText1);

        Button color1 = new Button("blue", 100, 40);
        color1.setPosition(70, 150);
        color1.setFillColor(new Color(140, 158, 255));
        //color1.setLineColor(new Color(140, 158, 255));
        canvas.add(color1);
        
       // color1.onClick(() -> {
       //     ;
       // });
        
       Button color2 = new Button("red", 100, 40);
        color2.setPosition(150, 150);
        color2.setFillColor(new Color(140, 158, 255));
        //color1.setLineColor(new Color(140, 158, 255));
        canvas.add(color2);
        
       // color2.onClick(() -> {
       //     ;
       // });

       Button color3 = new Button("green", 100, 40);
        color3.setPosition(230, 150);
        color3.setFillColor(new Color(140, 158, 255));
        //color1.setLineColor(new Color(140, 158, 255));
        canvas.add(color3);
        
       // color3.onClick(() -> {
       //     ;
       // });

       Button color4 = new Button("pink", 100, 40);
        color4.setPosition(110, 190);
        color4.setFillColor(new Color(140, 158, 255));
        //color1.setLineColor(new Color(140, 158, 255));
        canvas.add(color4);
        
       // color4.onClick(() -> {
       //     ;
       // });

       Button color5 = new Button("purple", 100, 40);
        color5.setPosition(190, 190);
        color5.setFillColor(new Color(140, 158, 255));
        //color1.setLineColor(new Color(140, 158, 255));
        canvas.add(color5);
        
       // color5.onClick(() -> {
       //     ;
       // });


    }
   
}

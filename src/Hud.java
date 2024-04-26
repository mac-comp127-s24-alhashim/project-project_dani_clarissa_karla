import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;
import SizableButton.*;
import java.awt.Color;

/*
 * Creates a HUD window with a specific number of buttons
 */
public class Hud extends GraphicsGroup {
    
    public Hud(String type, int num, MainGame mainGame){
        GraphicsGroup graphicsGroup = new GraphicsGroup();
        CanvasWindow canvas = mainGame.canvas;
        Image eye_parts = new Image("Eyes\\Eyes-01.png");
        if (type == "Color"){
            //fix colors
            
            Rectangle outerbox = new Rectangle(50, 90, 275, 150);
            outerbox.setFillColor(new Color(255, 111, 0));
            outerbox.setStroked(true);
            graphicsGroup.add(outerbox);

            GraphicsText boxText1 = new GraphicsText("Colors");
            boxText1.setFont("Times New Roman", FontStyle.PLAIN, 25);
            boxText1.setCenter(175,125);
            graphicsGroup.add(boxText1);

            Button color1 = new Button("", 40, 40);
            color1.setPosition(70, 150);
            color1.setFillColor(new Color(140, 158, 255));
            //color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color1);
            
        color1.onClick(() -> {
            
        });
            
        Button color2 = new Button("", 40, 40);
            color2.setFillColor(Color.RED);
            // color2.setLineColor(Color.RED);
            color2.setPosition(150, 150);
            graphicsGroup.add(color2);
            
        // color2.onClick(() -> {
        //     ;
        // });

        Button color3 = new Button("green", 40, 40);
            color3.setPosition(230, 150);
            color3.setFillColor(new Color(140, 158, 255));
            //color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color3);
            
        // color3.onClick(() -> {
        //     ;
        // });

        Button color4 = new Button("pink", 40, 40);
            color4.setPosition(110, 190);
            color4.setFillColor(new Color(140, 158, 255));
            //color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color4);
            
        // color4.onClick(() -> {
        //     ;
        // });

        Button color5 = new Button("purple", 40, 40);
            color5.setPosition(190, 190);
            color5.setFillColor(new Color(140, 158, 255));
            //color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color5);
            
        // color5.onClick(() -> {
        //     ;
        // });

        }
        else if (type == "Ears"){
            GraphicsGroup graphicsGroup2 = new GraphicsGroup();

            Rectangle outerbox = new Rectangle(50, 90, 275, 150);
            outerbox.setFillColor(new Color(255, 111, 0));
            outerbox.setStroked(true);
            graphicsGroup2.add(outerbox);
            
            GraphicsText boxText2 = new GraphicsText("Eyes");
            boxText2.setFont("Times New Roman", FontStyle.PLAIN, 25);
            boxText2.setCenter(175,125);
            graphicsGroup2.add(boxText2);

            Button eyes1 = new Button("Eyes-01", 40, 40);
            eyes1.setPosition(70, 150);
            graphicsGroup2.add(eyes1);

            eyes1.onClick(() -> {
                canvas.remove(eye_parts);
                Image part = new Image("Eyes\\Eyes-01.png");
                canvas.add(part);
            });

            //eyes1.onClick(() -> {
                //MainGame.mainGame.remove(eye_parts);
                //Image part = new Image("Eyes\\Eyes-02.png");
                //MainGame.mainGame.add(part);
            //});

        }


    }

    //takes in the type of window, the number of buttons, and acts serperately for the color window
    //I'll design it more thoroughly in class tomorrow
    //builds in the buttons with the method call lambda, or a value that can be used later to call
    
}

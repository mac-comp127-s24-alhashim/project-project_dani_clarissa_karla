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
        color1.setPosition(100, 150);
        color1.setFillColor(new Color(204, 176, 154));
        //color1.setLineColor(new Color(140, 158, 255));
        graphicsGroup.add(color1);
        color1.onClick(() -> {
        });
        Button color2 = new Button("", 40, 40);
        color2.setFillColor(new Color(182, 205, 223));
        // color2.setLineColor(Color.RED);
        color2.setPosition(150, 150);
        graphicsGroup.add(color2);
        // color2.onClick(() -> {
        // ;
        // });
        
        
        Button color3 = new Button("", 40, 40);
        color3.setPosition(200, 150);
        color3.setFillColor(new Color(247, 206, 214));
        //color1.setLineColor(new Color(140, 158, 255));
        graphicsGroup.add(color3);
        // color3.onClick(() -> {
        // ;
        // });
        
        
        Button color4 = new Button("", 40, 40);
        color4.setPosition(250, 150);
        color4.setFillColor(new Color(255, 255, 255));
        //color1.setLineColor(new Color(140, 158, 255));
        graphicsGroup.add(color4);
        // color4.onClick(() -> {
        // ;
        // });
        
        
        Button color5 = new Button("", 40, 40);
        color5.setPosition(100, 190);
        color5.setFillColor(new Color(213, 248, 254));
        //color1.setLineColor(new Color(140, 158, 255));
        graphicsGroup.add(color5);
        // color5.onClick(() -> {
        // ;
        // });
        
        
        Button color6 = new Button("", 40, 40);
        color6.setPosition(150, 190);
        color6.setFillColor(new Color(182, 162, 161));
        //color1.setLineColor(new Color(140, 158, 255));
        graphicsGroup.add(color6);
        // color5.onClick(() -> {
        // ;
        // });
        
        
        Button color7 = new Button("", 40, 40);
        color7.setPosition(200, 190);
        color7.setFillColor(new Color(249, 221, 181));
        //color1.setLineColor(new Color(140, 158, 255));
        graphicsGroup.add(color7);
        // color5.onClick(() -> {
        // ;
        // });
        
        
        }
        else if (type == "Eyes"){
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
        
        
        Button eyes2 = new Button("Eyes-02", 40, 40);
        eyes2.setPosition(70, 150);
        graphicsGroup2.add(eyes2);
        
        
        eyes2.onClick(() -> {
        canvas.remove(eye_parts);
        Image part = new Image("Eyes\\Eyes-02.png");
        canvas.add(part);
        });
        
        
        Button eyes3 = new Button("Eyes-03", 40, 40);
        eyes3.setPosition(70, 150);
        graphicsGroup2.add(eyes3);
        
        
        eyes3.onClick(() -> {
        canvas.remove(eye_parts);
        Image part = new Image("Eyes\\Eyes-03.png");
        canvas.add(part);
        });
        Button eyes4 = new Button("Eyes-04", 40, 40);
        eyes4.setPosition(70, 150);
        graphicsGroup2.add(eyes4);
        
        
        eyes4.onClick(() -> {
        canvas.remove(eye_parts);
        Image part = new Image("Eyes\\Eyes-04.png");
        canvas.add(part);
        });
        
        
        Button eyes5 = new Button("Eyes-05", 40, 40);
        eyes5.setPosition(70, 150);
        graphicsGroup2.add(eyes5);
        
        
        eyes5.onClick(() -> {
        canvas.remove(eye_parts);
        Image part = new Image("Eyes\\Eyes-05.png");
        canvas.add(part);
        });
        
        
        Button eyes6 = new Button("Eyes-06", 40, 40);
        eyes6.setPosition(70, 150);
        graphicsGroup2.add(eyes6);
        
        
        eyes6.onClick(() -> {
        canvas.remove(eye_parts);
        Image part = new Image("Eyes\\Eyes-06.png");
        canvas.add(part);
        });
        
        
        Button eyes7 = new Button("Eyes-07", 40, 40);
        eyes7.setPosition(70, 150);
        graphicsGroup2.add(eyes7);
        
        
        eyes7.onClick(() -> {
        canvas.remove(eye_parts);
        Image part = new Image("Eyes\\Eyes-07.png");
        canvas.add(part);
        });
        }
        
        
        
        
        }
        
        
        //takes in the type of window, the number of buttons, and acts serperately for the color window
        //I'll design it more thoroughly in class tomorrow
        //builds in the buttons with the method call lambda, or a value that can be used later to call
        }
        
        
        
        
        
        
        
        
        
        
        
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

    public Hud(String type, int num, MainGame mainGame, int posX, int posY) {
        GraphicsGroup graphicsGroup = new GraphicsGroup();
        CanvasWindow canvas = mainGame.canvas;

        if (type == "Color") {
            // fix colors

            Rectangle outerbox = new Rectangle(posX, posY, 275, 150);
            outerbox.setFillColor(new Color(255, 111, 0));
            outerbox.setStroked(true);
            graphicsGroup.add(outerbox);

            GraphicsText boxText1 = new GraphicsText("Colors");
            boxText1.setFont("Times New Roman", FontStyle.PLAIN, 25);
            boxText1.setCenter(175, 125);
            graphicsGroup.add(boxText1);

            Button color1 = new Button("", 40, 40);
            color1.setPosition(posX + (1 * 40), posY);
            color1.setFillColor(new Color(140, 158, 255));
            // color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color1);

            posX += 20;

            color1.onClick(() -> {
                mainGame.changeBody(1);
            });

            Button color2 = new Button("", 40, 40);
            color2.setFillColor(Color.RED);
            // color2.setLineColor(Color.RED);
            color2.setPosition(posX + (2 * 40), posY);
            graphicsGroup.add(color2);

            posX += 20;

            color2.onClick(() -> {
                mainGame.changeBody(2);
            });

            Button color3 = new Button("green", 40, 40);
            color3.setPosition(posX + (3 * 40), posY);
            color3.setFillColor(new Color(140, 158, 255));
            // color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color3);

            posX += 20;

            color3.onClick(() -> {
                mainGame.changeBody(3);
            });

            Button color4 = new Button("pink", 40, 40);
            color4.setPosition(posX + (4 * 40), posY);
            color4.setFillColor(new Color(140, 158, 255));
            // color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color4);

            posX += 20;

            color4.onClick(() -> {
                mainGame.changeBody(4);
            });

            Button color5 = new Button("purple", 40, 40);
            color5.setPosition(posX + (1 * 40), posY + 40);
            color5.setFillColor(new Color(140, 158, 255));
            // color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color5);

            posX += 20;

            color5.onClick(() -> {
                mainGame.changeBody(5);
            });

            Button color6 = new Button("purple", 40, 40);
            color6.setPosition(posX + (2 * 40), posY + 40);
            color6.setFillColor(new Color(140, 158, 255));
            // color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color6);

            posX += 20;

            color6.onClick(() -> {
                mainGame.changeBody(6);
            });

            Button color7 = new Button("purple", 40, 40);
            color7.setPosition(posX + (3 * 40), posY + 40);
            color7.setFillColor(new Color(140, 158, 255));
            // color1.setLineColor(new Color(140, 158, 255));
            graphicsGroup.add(color7);

            posX += 20;

            color7.onClick(() -> {
                mainGame.changeBody(7);
            });

        } else {
            GraphicsGroup graphicsGroup2 = new GraphicsGroup();

            Rectangle outerbox = new Rectangle(posX, posY, 275, 150);
            outerbox.setFillColor(new Color(255, 111, 0));
            outerbox.setStroked(true);
            graphicsGroup2.add(outerbox);

            GraphicsText boxText2 = new GraphicsText(type);
            boxText2.setFont("Times New Roman", FontStyle.PLAIN, 25);
            boxText2.setCenter(outerbox.getCenter());
            graphicsGroup.add(boxText2);

            String valString;
            int currentVal;
            for (int i = 1; i <= num; i++) {
                valString = "" + i;
                currentVal = i;

                Button button = new Button(valString, 40, 40);
                graphicsGroup.add(button);

                button.onClick(() -> {
                    switch (type) {
                        case "Arms":
                            mainGame.changeArms(currentVal);
                            break;
                        case "Ears":
                            mainGame.changeEars(currentVal);
                            break;
                        case "Eyes":
                            mainGame.changeEyes(currentVal);
                            break;
                        case "Legs":
                            mainGame.changeLegs(currentVal);
                            break;
                        case "Mouth":
                            mainGame.changeMouth(currentVal);
                            break;
                        case "Nose":
                            mainGame.changeNose(currentVal);
                            break;
                        case "Accessories":
                            mainGame.changeAccessories(currentVal);
                            break;
                    }
                });
                if (i >= 4) {
                    button.setPosition(posX + (i * 40), posY);
                } else {
                    button.setPosition(posX - 80 + ((i - 4) * 40), posY);
                }
                posX += 20;
            }
        }
    }
}

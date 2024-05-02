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
            int original = posX;

            Rectangle outerbox = new Rectangle(posX, posY, 250, 150);
            outerbox.setFillColor(new Color(60, 180, 170));
            outerbox.setStroked(true);
            graphicsGroup.add(outerbox);

            GraphicsText boxText1 = new GraphicsText("Body");
            boxText1.setFont("Times New Roman", FontStyle.PLAIN, 25);
            boxText1.setCenter(outerbox.getCenter());
            graphicsGroup.add(boxText1);

            Button color1 = new Button("", 40, 40);
            color1.setPosition(posX + 30, posY + 20);
            color1.setFillColor(new Color(204, 176, 154));
            color1.setLineColor(new Color(204, 176, 154));
            graphicsGroup.add(color1);

            posX += 20;

            color1.onClick(() -> {
                mainGame.changeBody(1);
            });

            Button color2 = new Button("", 40, 40);
            color2.setFillColor(new Color(182, 205, 223));
            color2.setLineColor(new Color(182, 205, 223));
            color2.setPosition(posX + (2 * 30), posY + 20);
            graphicsGroup.add(color2);

            posX += 20;

            color2.onClick(() -> {
                mainGame.changeBody(2);
            });

            Button color3 = new Button("", 40, 40);
            color3.setPosition(posX + (3 * 30), posY + 20);
            color3.setFillColor(new Color(247, 206, 214));
            color3.setLineColor(new Color(247, 206, 214));
            graphicsGroup.add(color3);

            posX += 20;

            color3.onClick(() -> {
                mainGame.changeBody(3);
            });

            Button color4 = new Button("", 40, 40);
            color4.setPosition(posX + (4 * 30), posY + 20);
            color4.setFillColor(new Color(255, 255, 255));
            color4.setLineColor(new Color(255, 255, 255));
            graphicsGroup.add(color4);


            color4.onClick(() -> {
                mainGame.changeBody(4);
            });

            posX -= 70;

            Button color5 = new Button("", 40, 40);
            color5.setPosition(original + (1 * 30), posY + 90);
            color5.setFillColor(new Color(213, 248, 254));
            color5.setLineColor(new Color(213, 248, 254));
            graphicsGroup.add(color5);

            original += 20;

            color5.onClick(() -> {
                mainGame.changeBody(5);
            });

            Button color6 = new Button("", 40, 40);
            color6.setPosition(original + (2 * 30), posY + 90);
            color6.setFillColor(new Color(182, 162, 161));
            color6.setLineColor(new Color(182, 162, 161));
            graphicsGroup.add(color6);

            original += 20;

            color6.onClick(() -> {
                mainGame.changeBody(6);
            });

            Button color7 = new Button("", 40, 40);
            color7.setPosition(original + (3 * 30), posY + 90);
            color7.setFillColor(new Color(249, 221, 181));
            color7.setLineColor(new Color(249, 221, 181));
            graphicsGroup.add(color7);

            color7.onClick(() -> {
                mainGame.changeBody(7);
            });

        } else {

            Rectangle outerbox = new Rectangle(posX, posY, 250, 150);
            outerbox.setFillColor(new Color(60, 180, 170));
            outerbox.setStroked(true);
            graphicsGroup.add(outerbox);

            GraphicsText boxText = new GraphicsText(type);
            boxText.setFont("Times New Roman", FontStyle.PLAIN, 25);
            boxText.setCenter(outerbox.getCenter());
            graphicsGroup.add(boxText);

            String valString;
            for (int i = 1; i <= num; i++) {
                valString = "" + i;
                int currentVal = i;

                Button button = new Button(valString, 40, 40);
                button.setFillColor(new Color(255, 150, 190));
                button.setLineColor(Color.WHITE);
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
                        case "Mouths":
                            mainGame.changeMouth(currentVal);
                            break;
                        case "Noses":
                            mainGame.changeNose(currentVal);
                            break;
                        case "Accessories":
                            mainGame.changeAccessories(currentVal);
                            break;
                    }
                });
                if (i <= 4) {
                    button.setPosition(posX + (i * 30), posY + 20);
                } else {
                    button.setPosition(posX - 80 + ((i - 4) * 30), posY + 90);
                }
                posX += 20;
            }
        }
        canvas.add(graphicsGroup);
    }
}

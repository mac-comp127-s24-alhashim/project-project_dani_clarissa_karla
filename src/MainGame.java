import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;
// import edu.macalester.graphics.ui.Button;
import SizableButton.*;
import java.awt.Color;
import java.io.File;


public class MainGame {

    private String creatureName;
    public CanvasWindow canvas;

    private String backgroundChoice;


    private List<String> bodyList;
    private List<String> eyesList;
    private List<String> mouthList;
    private List<String> accessoriesList;
    private List<String> armsList;
    private List<String> legsList;
    private List<String> earsList;
    private List<String> noseList;
    private List<String> buildingList;

    private Image body = new Image("");
    private Image eyes = new Image("");
    private Image mouth = new Image("");
    private Image accessories = new Image("");
    private Image arms = new Image("");
    private Image legs = new Image("");
    private Image ears = new Image("");
    private Image nose = new Image("");


    private static final int CANVAS_WIDTH = 1000;
    private static final int CANVAS_HEIGHT = 750;


    public MainGame() {

        bodyList = readFolder("res/Body Parts/Bodies");
        eyesList = readFolder("res/Body Parts/Eyes");
        mouthList = readFolder("res/Body Parts/Mouths");
        accessoriesList = readFolder("res/Body Parts/Accessories");
        armsList = readFolder("res/Body Parts/Arms");
        legsList = readFolder("res/Body Parts/Legs");
        earsList = readFolder("res/Body Parts/Ears");
        noseList = readFolder("res/Body Parts/Noses");


        canvas = new CanvasWindow("Main Window", CANVAS_WIDTH, CANVAS_HEIGHT);
        GraphicsText startText = new GraphicsText("Create a Mascot!");
        startText.setFont("Times New Roman", FontStyle.BOLD, 50);
        startText.setCenter(CANVAS_WIDTH / 2, 100);
        canvas.add(startText);

        Button startButton = new Button("Start", 100, 40);
        startButton.setCenter(CANVAS_WIDTH / 2, 500);
        startButton.setFillColor(new Color(255, 115, 190));
        startButton.setLineColor(new Color(255, 105, 180));
        canvas.add(startButton);

        Rectangle buttonBack = new Rectangle(0, 0, 115, 55);
        buttonBack.setFillColor(new Color(255, 20, 147));
        buttonBack.setStroked(false);
        buttonBack.setCenter(CANVAS_WIDTH / 2, 500);
        canvas.add(buttonBack);

        startButton.onClick(() -> {
            buildingSelection(canvas);
        });
    }

    public void buildingSelection(CanvasWindow canvas) {
        canvas.removeAll();
        buildingList = readFolder("res/Buildings");

        Image oldMain = new Image(buildingList.get(1));
        oldMain.setMaxWidth(CANVAS_WIDTH / 2);
        oldMain.setMaxHeight(CANVAS_HEIGHT / 2);
        canvas.add(oldMain);

        Button oldMainButton = new Button("", CANVAS_WIDTH / 2, CANVAS_HEIGHT / 2);
        oldMainButton.setPosition(0, 0);
        oldMainButton.setClear();
        canvas.add(oldMainButton);

        // canvas.onClick(e -> System.out.print(e.getPosition()));

        oldMainButton.onClick(() -> {
            // backgroundChoice = oldMainBackground;
            characterCreator(canvas);
        });

        Image jwall = new Image(buildingList.get(2));
        jwall.setPosition(CANVAS_WIDTH / 2, 0);
        jwall.setMaxWidth(CANVAS_WIDTH / 2);
        jwall.setMaxHeight(CANVAS_HEIGHT / 2);
        canvas.add(jwall);

        Button jwallButton = new Button("", CANVAS_WIDTH / 2, CANVAS_HEIGHT / 2);
        jwallButton.setPosition(CANVAS_WIDTH / 2, 0);
        jwallButton.setClear();
        canvas.add(jwallButton);

        jwallButton.onClick(() -> {
            // backgroundChoice = jwallBackground;
            characterCreator(canvas);
        });

        Image carnegie = new Image(buildingList.get(3));
        carnegie.setPosition(0, CANVAS_HEIGHT / 2);
        carnegie.setMaxWidth(CANVAS_WIDTH / 2);
        carnegie.setMaxHeight(CANVAS_HEIGHT / 2);
        canvas.add(carnegie);

        Button carnegieButton = new Button("", CANVAS_WIDTH / 2, CANVAS_HEIGHT / 2);
        carnegieButton.setPosition(0, CANVAS_HEIGHT / 2);
        carnegieButton.setClear();
        canvas.add(carnegieButton);

        carnegieButton.onClick(() -> {
            // backgroundChoice = carnegieBackground;
            characterCreator(canvas);
        });

        Image olri = new Image(buildingList.get(4));
        olri.setPosition(CANVAS_WIDTH / 2, CANVAS_HEIGHT / 2);
        olri.setMaxWidth(CANVAS_WIDTH / 2);
        olri.setMaxHeight(CANVAS_HEIGHT / 2);
        canvas.add(olri);

        Button olriButton = new Button("", CANVAS_WIDTH / 2, CANVAS_HEIGHT / 2);
        olriButton.setPosition(CANVAS_WIDTH / 2, CANVAS_HEIGHT / 2);
        olriButton.setClear();
        canvas.add(olriButton);

        olriButton.onClick(() -> {
            // backgroundChoice = olriBackground;
            characterCreator(canvas);
        });

    }

    public void characterCreator(CanvasWindow canvas) {
        canvas.removeAll();

        Hud bodyHud = new Hud("Color", 7, this);
        canvas.add(bodyHud);

        canvas.add(body);
        canvas.add(eyes);
        canvas.add(mouth);
        canvas.add(accessories);
        canvas.add(arms);
        canvas.add(legs);
        canvas.add(ears);
        canvas.add(nose);


    }

    public void changeBody(int val) {
        canvas.remove(body);
        body = new Image(bodyList.get(val));
        body.setCenter((CANVAS_WIDTH / 2) - 50, CANVAS_HEIGHT - 300);
        canvas.add(body);
    }

    public void changeEars(int val) {
        canvas.remove(ears);
        ears = new Image(earsList.get(val));

        if (val == 2 || val == 3 || val == 5) {
            ears.setMaxHeight(eyes.getImageHeight() / 3);
            ears.setMaxWidth(eyes.getImageWidth() / 3);
        } else if (val == 6 || val == 7) {
            ears.setMaxHeight(eyes.getImageHeight() / 3.5);
            ears.setMaxWidth(eyes.getImageWidth() / 3.5);
        } else if (val == 4) {
            ears.setMaxHeight(eyes.getImageHeight() / 2.5);
            ears.setMaxWidth(eyes.getImageWidth() / 2.5);
        } else {
            ears.setMaxHeight(eyes.getImageHeight() / 2);
            ears.setMaxWidth(eyes.getImageWidth() / 2);
        }
        switch (val) {
            case 1:
                ears.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 350);
                break;
            case 2:
                ears.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 390);
                break;
            case 3:
                ears.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 370);
                break;
            case 4:
                ears.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 340);
                break;
            case 5:
                ears.setCenter((CANVAS_WIDTH / 2) + 20, CANVAS_HEIGHT - 380);
                break;
            case 6:
                ears.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 380);
                break;
            case 7:
                ears.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 345);
                break;
        }
        canvas.add(ears);
    }

    public void changeArms(int val) {
        canvas.remove(arms);
        arms = new Image(armsList.get(val));
        // add pos
        canvas.add(arms);
    }

    public void changeLegs(int val) {
        canvas.remove(legs);
        legs = new Image(legsList.get(val));
        // add pos
        canvas.add(legs);
    }

    public void changeEyes(int val) {
        canvas.remove(eyes);
        eyes = new Image(eyesList.get(val));
        eyes.setMaxHeight(eyes.getImageHeight() / 4);
        eyes.setMaxWidth(eyes.getImageWidth() / 4);
        eyes.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 280);
        canvas.add(eyes);
    }

    public void changeAccessories(int val) {
        canvas.remove(accessories);
        accessories = new Image(accessoriesList.get(val));
        // add pos
        canvas.add(accessories);
    }

    public void changeMouth(int val) {
        canvas.remove(mouth);
        mouth = new Image(mouthList.get(val));
        if (val == 5 || val == 4 || val == 6) {
            mouth.setMaxHeight(mouth.getImageHeight() / 9);
            mouth.setMaxWidth(mouth.getImageWidth() / 9);
        } else {
            mouth.setMaxHeight(mouth.getImageHeight() / 6);
            mouth.setMaxWidth(mouth.getImageWidth() / 6);
        }
        mouth.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 210);
        canvas.add(mouth);
    }

    public void changeNose(int val) {
        canvas.remove(nose);
        nose = new Image(noseList.get(val));
        if (val != 1 && val != 5) {
            nose.setMaxHeight(nose.getImageHeight() / 10);
            nose.setMaxWidth(nose.getImageWidth() / 10);
        } else if (val == 5) {
            nose.setMaxHeight(nose.getImageHeight() / 9);
            nose.setMaxWidth(nose.getImageWidth() / 9);
        } else {
            nose.setMaxHeight(nose.getImageHeight() / 5);
            nose.setMaxWidth(nose.getImageWidth() / 5);
        }
        nose.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 255);
        canvas.add(nose);
    }

    public static List<String> readFolder(String folderName) {
        List<String> folderList = new ArrayList<>();
        folderList.add("");
        File folder = new File(folderName);
        for (File fileEntry : folder.listFiles()) {
            if (!fileEntry.isDirectory()) {
                folderList.add(fileEntry.getPath().substring(4));
            }
        }
        folderList.sort(Comparator.naturalOrder());
        return folderList;
    }

    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
        System.out.println(readFolder("res/Buildings"));
    }

}

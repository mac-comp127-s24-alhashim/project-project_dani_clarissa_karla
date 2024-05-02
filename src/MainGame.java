import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

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

    public CanvasWindow canvas;

    private List<String> backgroundList;
    private String backgroundChoice;

    public List<String> bodyList;
    public List<String> eyesList;
    public List<String> mouthList;
    public List<String> accessoriesList;
    public List<String> armsList;
    public List<String> legsList;
    public List<String> earsList;
    public List<String> noseList;
    public List<String> buildingList;

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

        List<String> logoList = readFolder("res/Logo");
        Image gameLogo = new Image(logoList.get(1));
        gameLogo.setCenter(CANVAS_WIDTH/2, CANVAS_HEIGHT/2);
        canvas.add(gameLogo);

        Button startButton = new Button("Start", 100, 40);
        startButton.setCenter(CANVAS_WIDTH / 2, 700);
        startButton.setFillColor(new Color(255, 115, 190));
        startButton.setLineColor(new Color(255, 105, 180));
        canvas.add(startButton);

        Rectangle buttonBack = new Rectangle(0, 0, 115, 55);
        buttonBack.setFillColor(new Color(255, 20, 147));
        buttonBack.setStroked(false);
        buttonBack.setCenter(CANVAS_WIDTH / 2, 700);
        canvas.add(buttonBack);

        startButton.onClick(() -> {
            buildingSelection(canvas);
        });
    }

    public void buildingSelection(CanvasWindow canvas) {
        backgroundList = readFolder("res/Backgrounds");

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


        oldMainButton.onClick(() -> {
            backgroundChoice = backgroundList.get(1);
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
            backgroundChoice = backgroundList.get(2);
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
            backgroundChoice = backgroundList.get(4);
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
            backgroundChoice = backgroundList.get(3);
            characterCreator(canvas);
        });

    }

    public void characterCreator(CanvasWindow canvas) {
        canvas.removeAll();

        Image background = new Image(backgroundChoice);
        background.setMaxHeight(CANVAS_HEIGHT);
        background.setMaxWidth(CANVAS_WIDTH);
        background.setCenter(CANVAS_WIDTH/2, CANVAS_HEIGHT/2);
        canvas.add(background);

        Button randomButton = new Button("Random", 70, 70);
        randomButton.setCenter(CANVAS_WIDTH - 170, CANVAS_HEIGHT - 70);
        randomButton.setFillColor(new Color(255, 150, 190));
        randomButton.setLineColor(Color.white);
        canvas.add(randomButton);

        randomButton.onClick(() -> {
            random();
        });

        Button doneButton = new Button("Done", 70, 70);
        doneButton.setCenter(CANVAS_WIDTH - 80, CANVAS_HEIGHT - 70);
        doneButton.setFillColor(new Color(50, 180, 180));
        doneButton.setLineColor(Color.white);
        canvas.add(doneButton);

        doneButton.onClick(() -> {
            done();
        });

        Hud bodyHud = new Hud("Color", 7, this, 25, 50);
        canvas.add(bodyHud);
        Hud armHud = new Hud("Arms", 7, this, 25, 200);
        canvas.add(armHud);
        Hud earHud = new Hud("Ears", 7, this, 25, 350);
        canvas.add(earHud);
        Hud eyeHud = new Hud("Eyes", 7, this, 25, 500);
        canvas.add(eyeHud);
        Hud legHud = new Hud("Legs", 7, this, 700, 350);
        canvas.add(legHud);
        Hud mouthHud = new Hud("Mouths", 7, this, 700, 50);
        canvas.add(mouthHud);
        Hud noseHud = new Hud("Noses", 6, this, 700, 200);
        canvas.add(noseHud);
        Hud accessoriesHud = new Hud("Accessories", 5, this, 370, 50);
        canvas.add(accessoriesHud);

        canvas.add(body);
        canvas.add(eyes);
        canvas.add(mouth);
        canvas.add(arms);
        canvas.add(accessories);
        canvas.add(legs);
        canvas.add(ears);
        canvas.add(nose);

        random();

    }

    private void random() {
        changeBody(randomGen(7));
        changeEyes(randomGen(7));
        changeMouth(randomGen(7));
        changeArms(randomGen(7));
        changeLegs(randomGen(7));
        changeEars(randomGen(7));
        changeNose(randomGen(6));
        changeAccessories(randomGen(5));
    }

    private void done(){
        canvas.removeAll();
        Image background = new Image(backgroundChoice);
        background.setMaxHeight(CANVAS_HEIGHT);
        background.setMaxWidth(CANVAS_WIDTH);
        background.setCenter(CANVAS_WIDTH/2, CANVAS_HEIGHT/2);
        canvas.add(background);
        canvas.add(body);
        canvas.add(eyes);
        canvas.add(mouth);
        canvas.add(arms);
        canvas.add(accessories);
        canvas.add(legs);
        canvas.add(ears);
        canvas.add(nose);
    }

    private int randomGen(int num) {
        Random rand = new Random();
        int randomValue = rand.nextInt(num) + 1;
        return randomValue;
    }

    public void changeBody(int val) {
        canvas.remove(body);
        canvas.remove(eyes);
        canvas.remove(mouth);
        canvas.remove(arms);
        canvas.remove(accessories);
        canvas.remove(legs);
        canvas.remove(ears);
        canvas.remove(nose);
        body = new Image(bodyList.get(val));
        body.setCenter((CANVAS_WIDTH / 2) - 50, CANVAS_HEIGHT - 300);
        canvas.add(body);
        canvas.add(eyes);
        canvas.add(mouth);
        canvas.add(arms);
        canvas.add(accessories);
        canvas.add(legs);
        canvas.add(ears);
        canvas.add(nose);
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
        if (val == 1) {
            arms.setMaxHeight(eyes.getImageHeight() / 1.1);
            arms.setMaxWidth(eyes.getImageWidth() / 1.1);
            arms.setCenter((CANVAS_WIDTH / 2) + 40, CANVAS_HEIGHT - 260);
        } else if (val == 2 || val == 7) {
            arms.setMaxHeight(eyes.getImageHeight() / 2.1);
            arms.setMaxWidth(eyes.getImageWidth() / 2.1);
            arms.setCenter((CANVAS_WIDTH / 2) + 15, CANVAS_HEIGHT - 240);
        } else if (val == 3) {
            arms.setMaxHeight(eyes.getImageHeight() / 2);
            arms.setMaxWidth(eyes.getImageWidth() / 2);
            arms.setCenter((CANVAS_WIDTH / 2), CANVAS_HEIGHT - 240);
        } else if (val == 4 || val == 5) {
            arms.setMaxHeight(eyes.getImageHeight() / 1.6);
            arms.setMaxWidth(eyes.getImageWidth() / 1.6);
            arms.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 260);
        } else if (val == 6) {
            arms.setMaxHeight(eyes.getImageHeight() / 1.5);
            arms.setMaxWidth(eyes.getImageWidth() / 1.5);
            arms.setCenter((CANVAS_WIDTH / 2) + 40, CANVAS_HEIGHT - 220);
        }
        canvas.add(arms);
    }

    public void changeLegs(int val) {
        canvas.remove(legs);
        legs = new Image(legsList.get(val));
        if (val == 1 || val == 2 || val == 5 || val == 6 || val == 7) {
            legs.setMaxHeight(eyes.getImageHeight() / 2.5);
            legs.setMaxWidth(eyes.getImageWidth() / 2.5);
        } else if (val == 3 || val == 4) {
            legs.setMaxHeight(eyes.getImageHeight() / 3.5);
            legs.setMaxWidth(eyes.getImageWidth() / 3.5);
        }
        if (val == 4) {
            legs.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 110);
        } else if (val == 7) {
            legs.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 150);
        } else {
            legs.setCenter((CANVAS_WIDTH / 2) + 10, CANVAS_HEIGHT - 170);
        }
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
        if (val != 4) {
            accessories.setMaxHeight(eyes.getImageHeight() / 2.5);
            accessories.setMaxWidth(eyes.getImageWidth() / 2.5);
        } else if (val == 4) {
            accessories.setMaxHeight(eyes.getImageHeight() / 2);
            accessories.setMaxWidth(eyes.getImageWidth() / 2);
        }
        accessories.setCenter((CANVAS_WIDTH / 2) + 230, CANVAS_HEIGHT - 150);
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
    }

}

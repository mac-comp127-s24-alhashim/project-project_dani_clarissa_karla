
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


public class TestImages {

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


    public TestImages() {

        bodyList = readFolder("res/Body Parts/Bodies");
        eyesList = readFolder("res/Body Parts/Eyes");
        mouthList = readFolder("res/Body Parts/Mouths");
        accessoriesList = readFolder("res/Body Parts/Accessories");
        armsList = readFolder("res/Body Parts/Arms");
        legsList = readFolder("res/Body Parts/Legs");
        earsList = readFolder("res/Body Parts/Ears");
        noseList = readFolder("res/Body Parts/Noses");


        canvas = new CanvasWindow("Test Window", CANVAS_WIDTH, CANVAS_HEIGHT);
        GraphicsText startText = new GraphicsText("Create a Mascot!");
        startText.setFont("Times New Roman", FontStyle.BOLD, 50);
        startText.setCenter(CANVAS_WIDTH / 2, 100);
        canvas.add(startText);

        characterCreator(canvas);
    }


    public void characterCreator(CanvasWindow canvas) {


        canvas.removeAll();

        canvas.add(body);
        changeBody(3);
        canvas.add(eyes);
        changeEyes(4);
        canvas.add(mouth);
        changeMouth(7);
        canvas.add(accessories);
        canvas.add(arms);
        changeArms(7);
        canvas.add(legs);
        changeLegs(7);
        canvas.add(ears);
        changeEars(3);
        canvas.add(nose);
        changeNose(5);
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
        TestImages testImages = new TestImages();
        System.out.println(readFolder("res/Body Parts/Bodies"));
    }

}
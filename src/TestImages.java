
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
    private List<String> handsList;
    private List<String> feetList;
    private List<String> earsList;
    private List<String> noseList;

    private Image body = new Image("");
    private Image eyes = new Image("");
    private Image mouth = new Image("");
    private Image accessories = new Image("");
    private Image hands = new Image("");
    private Image feet = new Image("");
    private Image ears = new Image("");
    private Image nose = new Image("");


    private static final int CANVAS_WIDTH = 1000;
    private static final int CANVAS_HEIGHT = 750;


    public TestImages(){

        bodyList = readFolder("res/Body Parts/Bodies");
        eyesList = readFolder("res/Body Parts/Eyes");
        mouthList = readFolder("res/Body Parts/Mouths");
        accessoriesList = readFolder("res/Body Parts/Accessories");
        handsList = readFolder("res/Body Parts/Hands");
        feetList = readFolder("res/Body Parts/Feet");
        earsList = readFolder("res/Body Parts/Ears");
        noseList = readFolder("res/Body Parts/Noses");


        canvas = new CanvasWindow("Test Window", CANVAS_WIDTH, CANVAS_HEIGHT);
        GraphicsText startText = new GraphicsText("Create a Mascot!");
        startText.setFont("Times New Roman", FontStyle.BOLD, 50);
        startText.setCenter(CANVAS_WIDTH/2, 100);
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
        canvas.add(accessories);
        canvas.add(hands);
        canvas.add(feet);
        canvas.add(ears);
        canvas.add(nose);
    }

    public void changeBody(int val) {
        canvas.remove(body);
        body = new Image(bodyList.get(val));
        // add pos
        body.setCenter((CANVAS_WIDTH/2)-50, CANVAS_HEIGHT-300);
        canvas.add(body);
    }

    private void changeEars(int val) {
        canvas.remove(ears);
        ears = new Image(earsList.get(val));
        // add pos
        canvas.add(ears);

    }

    private void changeHands(int val) {
        canvas.remove(hands);
        hands = new Image(handsList.get(val));
        // add pos
        canvas.add(hands);
    }

    private void changeFeet(int val) {
        canvas.remove(feet);
        feet = new Image(feetList.get(val));
        // add pos
        canvas.add(feet);
    }

    private void changeEyes(int val) {
        canvas.remove(eyes);
        eyes = new Image(eyesList.get(val));
        eyes.setMaxHeight(eyes.getImageHeight()/4);
        eyes.setMaxWidth(eyes.getImageWidth()/4);
        eyes.setCenter((CANVAS_WIDTH/2)+10, CANVAS_HEIGHT-280);
        canvas.add(eyes);
    }

    private void changeAccessories(int val) {
        canvas.remove(accessories);
        accessories = new Image(accessoriesList.get(val));
        // add pos
        canvas.add(accessories);

    }

    private void changeNose(int val) {
        canvas.remove(nose);
        nose = new Image(noseList.get(val));
        // add pos
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

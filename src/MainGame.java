import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;
// import edu.macalester.graphics.ui.Button;
import SizableButton.*;
import java.awt.Color;


public class MainGame {

    private String creatureName;
    public CanvasWindow canvas;

    private String backgroundChoice;

    private List<String> bodyList = List.of("");
    private List<String> eyesList = List.of("");
    private List<String> mouthList = List.of("");
    private List<String> accessoriesList = List.of("");
    private List<String> handsList = List.of("");
    private List<String> feetList = List.of("");
    private List<String> tailList = List.of("");



    private Image body = new Image(bodyList.get(0));
    private Image eyes = new Image(eyesList.get(0));
    private Image mouth = new Image(mouthList.get(0));
    private Image accessories = new Image(accessoriesList.get(0));
    private Image hands = new Image(handsList.get(0));
    private Image feet = new Image(feetList.get(0));
    private Image tail = new Image(tailList.get(0));

    private static final int CANVAS_WIDTH = 1000;
    private static final int CANVAS_HEIGHT = 750;


    public MainGame(){
        canvas = new CanvasWindow("Main Window", CANVAS_WIDTH, CANVAS_HEIGHT);
        GraphicsText startText = new GraphicsText("Create a Mascot!");
        startText.setFont("Times New Roman", FontStyle.PLAIN, 50);
        startText.setCenter(CANVAS_WIDTH/2, 100);
        canvas.add(startText);

        Button startButton = new Button("Start", 100, 40);
        startButton.setCenter(CANVAS_WIDTH/2, 500);
        startButton.setFillColor(new Color(255, 115, 190));
        startButton.setLineColor(new Color(255, 105, 180));
        canvas.add(startButton);

        Rectangle buttonBack = new Rectangle(0, 0, 115, 55);
        buttonBack.setFillColor(new Color(255, 20, 147));
        buttonBack.setStroked(false);
        buttonBack.setCenter(CANVAS_WIDTH/2, 500);
        canvas.add(buttonBack);

        startButton.onClick(() -> {
            buildingSelection(canvas);
        });
    }

    public void buildingSelection(CanvasWindow canvas){
        canvas.removeAll();

        Image oldMain = new Image("Buildings\\old main sketch.jpeg");
        oldMain.setMaxWidth(CANVAS_WIDTH/2);
        oldMain.setMaxHeight(CANVAS_HEIGHT/2);
        canvas.add(oldMain);

        Button oldMainButton = new Button("", CANVAS_WIDTH/2, CANVAS_HEIGHT/2);
        oldMainButton.setPosition(0, 0);
        oldMainButton.setClear();
        canvas.add(oldMainButton);

        // canvas.onClick(e -> System.out.print(e.getPosition()));

        oldMainButton.onClick(() -> {
            // backgroundChoice = oldMainBackground;
            characterCreator(canvas);
        });

        Image jwall = new Image("Buildings\\jwall-Sketch.jpeg");
        jwall.setPosition(CANVAS_WIDTH/2, 0);
        jwall.setMaxWidth(CANVAS_WIDTH/2);
        jwall.setMaxHeight(CANVAS_HEIGHT/2);
        canvas.add(jwall);

        Button jwallButton = new Button("", CANVAS_WIDTH/2, CANVAS_HEIGHT/2);
        jwallButton.setPosition(CANVAS_WIDTH/2, 0);
        jwallButton.setClear();
        canvas.add(jwallButton);

        jwallButton.onClick(() -> {
            // backgroundChoice = jwallBackground;
            characterCreator(canvas);
        });

        Image carnegie = new Image("Buildings\\Carnegie-Sketch.jpeg");
        carnegie.setPosition(0, CANVAS_HEIGHT/2);
        carnegie.setMaxWidth(CANVAS_WIDTH/2);
        carnegie.setMaxHeight(CANVAS_HEIGHT/2);
        canvas.add(carnegie);

        Button carnegieButton = new Button("", CANVAS_WIDTH/2, CANVAS_HEIGHT/2);
        carnegieButton.setPosition(0, CANVAS_HEIGHT/2);
        carnegieButton.setClear();
        canvas.add(carnegieButton);

        carnegieButton.onClick(() -> {
            // backgroundChoice = carnegieBackground;
            characterCreator(canvas);
        });

        Image olri = new Image("Buildings\\Olri-Sketch.jpeg");
        olri.setPosition(CANVAS_WIDTH/2, CANVAS_HEIGHT/2);
        olri.setMaxWidth(CANVAS_WIDTH/2);
        olri.setMaxHeight(CANVAS_HEIGHT/2);
        canvas.add(olri);

        Button olriButton = new Button("", CANVAS_WIDTH/2, CANVAS_HEIGHT/2);
        olriButton.setPosition(CANVAS_WIDTH/2, 0);
        olriButton.setClear();
        canvas.add(olriButton);

        olriButton.onClick(() -> {
            // backgroundChoice = olriBackground;
            characterCreator(canvas);
        });

    }

    public void characterCreator(CanvasWindow canvas){
        canvas.removeAll();
        
    }
    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
    }
    
}

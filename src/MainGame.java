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
    

    // Button jb = new Button("Test", 200, 200);
    // jb.setPosition(100, 100);
    // jb.onClick(() -> jb.setPosition(jb.getX() + 2, jb.getY() + 2));

    // window.add(jb);


    public MainGame(){
        canvas = new CanvasWindow("Main Window", 1000, 750);
        GraphicsText startText = new GraphicsText("Create a Mascot!");
        startText.setFont("Times New Roman", FontStyle.PLAIN, 50);
        startText.setCenter(500, 100);
        canvas.add(startText);
        Button startButton = new Button("Start", 100, 40);
        startButton.setCenter(500, 500);
        canvas.add(startButton);
        Rectangle buttonBack = new Rectangle(0, 0, 115, 55);
        buttonBack.setFillColor(Color.PINK);
        buttonBack.setCenter(500, 500);
        canvas.add(buttonBack);

        startButton.onClick(() -> {
            buildingSelection(canvas);
        });
    }

    public void buildingSelection(CanvasWindow canvas){
        canvas.removeAll();
    }

    public void run(){

    }
    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
    }
    
}

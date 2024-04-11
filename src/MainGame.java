import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.ui.Button;

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
    


    public MainGame(){
        canvas = new CanvasWindow("Main Window", 1000, 750);
        GraphicsText startText = new GraphicsText("Create a Mascot!");
        startText.setFont("Times New Roman", FontStyle.PLAIN, 50);
        startText.setCenter(500, 100);
        canvas.add(startText);
        Button startButton = new Button("Start");
        startButton.setScale(5);
        startButton.setCenter(500, 500);
        canvas.add(startButton);
    }

    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
    }
    
}

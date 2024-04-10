import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsText;

public class MainGame {

    public String creatureName;
    public CanvasWindow canvas;

    public MainGame(){
        canvas = new CanvasWindow("Main Window", 1000, 750);
        GraphicsText startText = new GraphicsText("Create a Mascot!");
        startText.setFont("Times New Roman", FontStyle.PLAIN, 50);
        startText.setCenter(500, 100);
        canvas.add(startText);
    }

    private void changeBody(){

    }

    private void changeEars(){
        
    }

    private void changeTail(){
        
    }

    private void changeHands(){
        
    }

    private void changeFeet(){
        
    }

    private void changeEyes(){
        
    }

    private void changeAcc(){
        
    }

    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
    }
}

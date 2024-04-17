import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Image;
import javax.imageio.ImageIO;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Point;

public class Displays {
    private Image currentBody;
    private double maxWidth = Double.POSITIVE_INFINITY, maxHeight = Double.POSITIVE_INFINITY;

    
    private void changeBody(CanvasWindow canvas, String imagePath){
        currentBody = new Image(0,0);
        if(currentBody != null){
            
        }


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

    /**
     * Causes the image to shrink (preserving aspect ratio) if the image width is larger than the
     * given maximum width.
     */
    // public void setMaxWidth(double maxWidth) {
    //     this.maxWidth = maxWidth;
    //     changed();
    // }
}

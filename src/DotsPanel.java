import javax.swing.*;
import java.awt.*;

/**
 * Created by michael_hopps on 10/2/17.
 */
public class DotsPanel extends JPanel{

    private Dot a, b, c;

    public DotsPanel(int width, int height){
        setSize(width,height);

        a = new Dot(getWidth()/2, 0);
        //3.  Initialize Dot a to be the top center of the screen.
//            Initialize Dot b to be the bottom left of the screen.
//            Initialize Dot c to be the bottom right of the screen.

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //1.  Go finish the Dot class.
        //2.  Make a few Dots and their midpoints and draw them to test your work.
        //      Once satisfied with your results, delete your test code.
            //Dot test1 = new Dot(100, 100);
            //test1.draw(g2);
            //Dot test2...
            //Dot mid = test1.getMidpoint(test2);

        //3.  Go up to the constructor.  Code up there.

        //4.  Create a Dot called currentDot.  Have it represent the center of the screen.

        //7.  Draw currentDot.

        //8.  Modify your code so that steps 5-7 are repeated 10,000 times.

        //9.  Bask in the glory of the result.
        //10. Modify colors, shapes, etc as much as you want.  Make it more awesome.
                //You could add a Color instance field to the Dot class...
                //You could base the Color RGB colors on many things...

    }

}

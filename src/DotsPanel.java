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
        b = new Dot(0, getHeight());
        c = new Dot(getWidth(), getHeight());
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //4.  Create a Dot called currentDot.  Have it represent the center of the screen.

        Dot currentDot = new Dot(getWidth()/2, getHeight()/2);

        for (int i = 0; i < 40000; i++) {
            int r = (int)(Math.random()*3);
            if(r == 0){ //move toward a
                g2.setColor(Color.RED);
                currentDot = a.getMidpoint(currentDot);
            }else if(r == 1){ //move toward b
                g2.setColor(Color.BLUE);
                currentDot = b.getMidpoint(currentDot);
            }else{  //move toward c
                g2.setColor(Color.CYAN);
                currentDot = c.getMidpoint(currentDot);
            }
            currentDot.draw(g2);
        }

        //8.  Modify your code so that steps 5-7 are repeated 10,000 times.

        //9.  Bask in the glory of the result.
        //10. Modify colors, shapes, etc as much as you want.  Make it more awesome.

    }

}

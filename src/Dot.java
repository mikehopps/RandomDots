import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;

/**
 * Created by michael_hopps on 10/5/17.
 */
public class Dot {

    private int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //3.  draw(Graphics2D g2) -> draws this dot (drawOval with w,h = 1,1)
    public void draw(Graphics2D g2){
        g2.drawOval(x, y, 1, 1);
    }

    public Dot getMidpoint(Dot other) {
        int midX = (x + other.getX())/2;
        int midY = (y + other.getY())/2;
        return new Dot(midX, midY);
    }
}

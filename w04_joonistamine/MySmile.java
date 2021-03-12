import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MySmile {
    public static void main(String[] args) throws IOException {
        int width = 100;
        int height = 100;

        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.GRAY);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.YELLOW);
        g.fillArc(0, 0, width, height, 0, 360);

        g.setColor(Color.BLUE);
        g.fillOval(10, 30, 30, 20);
        g.fillOval(60, 30, 30, 20);

        g.drawArc(20, 50, 60, 30, 0, -180);

        g.setColor(Color.BLACK);
        g.fillOval(10, 25, 30, 5);
        g.fillOval(60, 25, 30, 5);

        ImageIO.write(picture, "png", new File("smile.png"));
    }
}

// Java program to demonstrate working of Robot 
// class. This program is for Windoes. It opens 
// notepad and types a message. 
import java.awt.*; 
import java.io.*; 
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class robo 
{ 
    public static void main() throws IOException, 
    AWTException, InterruptedException 
    { 
        try { 
            Thread.sleep(5000); 
        } 
        catch (InterruptedException e) 
        { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
        Rectangle rec=new Rectangle(738,209,(22),(18));
        Robot robot = new Robot(); 
        String path="D://Shot1.jpg";
        // Press keys using robot. A gap of 
        // of 500 mili seconds is added after 
        // every key press 
        BufferedImage img=robot.createScreenCapture(rec);
        ImageIO.write(img, "jpg", new File(path)); 
        System.out.println("Screenshot saved");
        robot.mouseMove(1360,21);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    } 
} 
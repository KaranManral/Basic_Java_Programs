import java.awt.*; 
import java.io.*; 
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class robot1 
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
        Rectangle rec=new Rectangle(738,209,(607-585),(303-285));
        Robot robot = new Robot(); 
        String path="D://Shot1.jpg";
        // Press keys using robot. A gap of 
        // of 500 mili seconds is added after 
        // every key press 
        BufferedImage img=robot.createScreenCapture(rec);
        // For storing image in RAM 
        BufferedImage image = null; 

        // READ IMAGE 
        try
        { 
            File input_file = new File("D:\\Shot1.jpg"); //image file path 

            /* create an object of BufferedImage type and pass 
            as parameter the width,  height and image int 
            type.TYPE_INT_ARGB means that we are representing 
            the Alpha, Red, Green and Blue component of the 
            image pixel using 8 bit integer value. */
            image = new BufferedImage((607-585),(303-285), 
                BufferedImage.TYPE_INT_ARGB); 

            // Reading input file 
            image=ImageIO.read(input_file); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: "+e); 
        } 
        for (int y = 0; y < 18; y++)
        {
            for (int x = 0; x < 22; x++) 
            {
                int pixelC = img.getRGB(x, y);
                int pixelB = image.getRGB(x, y);
                if(pixelC==pixelB)
                    System.out.println("True");
                else
                    System.out.println("False");
            }
        } 
        long difference = 0; 
        for (int y = 0; y <18; y++) 
        { 
            for (int x = 0; x < 22; x++) 
            { 
                int rgbA = img.getRGB(x, y); 
                int rgbB = image.getRGB(x, y); 
                int redA = (rgbA >> 16) & 0xff; 
                int greenA = (rgbA >> 8) & 0xff; 
                int blueA = (rgbA) & 0xff; 
                int redB = (rgbB >> 16) & 0xff; 
                int greenB = (rgbB >> 8) & 0xff; 
                int blueB = (rgbB) & 0xff; 
                difference += Math.abs(redA - redB); 
                difference += Math.abs(greenA - greenB); 
                difference += Math.abs(blueA - blueB); 
            } 
        } 

        // Total number of red pixels = width * height 
        // Total number of blue pixels = width * height 
        // Total number of green pixels = width * height 
        // So total number of pixels = width * height * 3 
        double total_pixels = 22 * 18 * 3; 

        // Normalizing the value of different pixels 
        // for accuracy(average pixels per color 
        // component) 
        double avg_different_pixels = difference / 
            total_pixels; 

        // There are 255 values of pixels in total 
        double percentage = (avg_different_pixels / 
                255) * 100; 

        System.out.println("Difference Percentage-->" + 
            percentage); 
    }
}
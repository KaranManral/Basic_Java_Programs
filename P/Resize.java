package P;
import java.awt.*;
import java.awt.event.*;

class MyClickListener extends Frame implements MouseListener {
    int width = 0;
    int height = 0;
    MyClickListener() 
    {
        setSize(150,150);
        setVisible(true);
        addMouseListener(this);
        addWindowListener(new MyWindowListener());
        height = getHeight();
        width = getWidth();
    }
    public void mouseClicked(MouseEvent event) {
        if (height == 250)
        {
            height = 150;
            width = 150;
        }
        else{
             height += 10;
             width += 10;
        }
        setSize(height,width);
    }
    public void mousePressed(MouseEvent e) {
        
     }
 
     public void mouseReleased(MouseEvent e) {
       
     }
 
     public void mouseEntered(MouseEvent e) {
        
     }
 
     public void mouseExited(MouseEvent e) {
        
     }
}

public class Resize {
    public static void main(String[] args) {
        new MyClickListener();        
    }
}

class MyWindowListener extends WindowAdapter {

    @Override
	public void windowClosing(WindowEvent event) {
        System.exit(0);
    }

}
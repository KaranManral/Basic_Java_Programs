package P;
import javax.swing.*;
import java.awt.event.*;
public class TypedCharacter extends JFrame 
{
	String msg="Typed character is: "; //To store character typed
	JLabel l; //To display character typed
	public TypedCharacter()
	{
		l=new JLabel(msg); //Initializing Label
		setSize(200,150); //Setting size of Frame
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent Ke)
			{
				msg+=Ke.getKeyChar(); 
				l.setText(msg);	//Displaying Character Typed
				msg="Typed character is: ";
			}
		});
		add(l); //Adding Label to Frame
		setVisible(true);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TypedCharacter();
	}

}


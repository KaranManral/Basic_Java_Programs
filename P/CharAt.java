package P;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class CharAt 
{
	JFrame jf=new JFrame("Text");
	JTextField jt=new JTextField(10);
	JLabel jl=new JLabel();
	CharAt()
	{
		jf.setSize(300,200);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(jt);
		jf.add(jl);
		jt.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e)
			{
				jl.setText(jt.getText());	
			}
		});
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CharAt();
	}

}

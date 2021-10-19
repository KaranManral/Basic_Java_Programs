package P;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Toggle {

	JFrame jf=new JFrame();
	JToggleButton jb=new JToggleButton("Click Here");
	JLabel jl=new JLabel("Deselected");
	Toggle()
	{
		jf.setSize(200,100);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(jb);
		jf.add(jl);
		jb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if(jb.isSelected())
				{
					jl.setText("Selected");
					jb.setContentAreaFilled(false);
					jb.setOpaque(true);
					jb.setBackground(Color.green);
				}
				else
				{
					jl.setText("Deselected");
					jb.setBackground(Color.red);
				}
			}
		});
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Toggle();
	}

}

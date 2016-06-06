import java.awt.FlowLayout;
import javax.swing.*;

public class LabelFrame extends JFrame
{
	
	private JLabel  label1;
	public LabelFrame(){
		super("testing JLabel");
		setLayout(new FlowLayout());
		String q="test";
		Icon bug=new ImageIcon("giphy.gif");
		label1=new JLabel("序號產生器",bug,SwingConstants.LEFT);
		
		add(label1);
		
		
	}
}
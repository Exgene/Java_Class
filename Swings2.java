
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class SwingEle implements ActionListener{
	JScrollPane jsp;
	JCheckBox c1,c2,c3,c4;
	String[] cities = {"Mlore","Blore","Mysuru","Madikeri","Updupi","Bhatkal","Puttur","Sullia"};
	JList<String> jList = new Jlist<String>(cities);
	JRadioButton r1,r2;
	JTextField tf1,tf2;
	ArrayList<String> hobby = new ArrayList<String>();
	SwingEle({
		JFrame jf = new JFrame("Big Swing");
		jf.setSize(300,300);
		jf.setLayout(new FlowLayout());
		JLabel jl1 = new JLabel("Name");
		tf1 = new JTextField(20);
		JLabel jl2 = new JLabel("Number");
		tf2 = new JTextField(20);
		jf.add(jl1);
	})
}

public class Swings2 {

	public static void main(String[] args) {


	}

}

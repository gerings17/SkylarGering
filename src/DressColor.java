import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import javax.swing.*;


public class DressColor extends JFrame implements ActionListener{
	
	HashMap<String, String> colors = new HashMap<String, String>();
	JPanel panel;
	JLabel label1;
	JLabel label2;
	JTextField field1;
	JTextField field2;
	JButton button1;
	JButton finishButton;
	JLabel picture;
	String name;
	String color;
	
	public static void main(String[]args) throws MalformedURLException{
		DressColor a = new DressColor();
		//String name = a.field1.getText();
		//String color = a.field2.getText();
		
	}
	
	DressColor() throws MalformedURLException{
		setTitle("Dress Color");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		label1 = new JLabel("your name");
		field1 = new JTextField(10);
		label2 = new JLabel("'white/gold' or 'black/blue'");
		field2 = new JTextField(10);
		button1 = new JButton("Enter");
		finishButton = new JButton("Finish");
		add(panel);
		picture = new JLabel();
		picture = createImage("https://upload.wikimedia.org/wikipedia/en/a/a8/The_Dress_%28viral_phenomenon%29.png");
		panel.add(picture);
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button1);
		panel.add(finishButton);
		JOptionPane.showMessageDialog(null, "Enter your name in the first box and the color combonation in the second box.  Then hit the enter button. Repeate this process for everyone you want to survey and then hit finish.");
		button1.addActionListener(this);
		pack();
	}
	
	JLabel createImage(String imageURL) throws MalformedURLException {
	 	URL url = new URL(imageURL);
        Icon icon = new ImageIcon(url);
        return new JLabel(icon);
	}
	
	public void actionPerformed(ActionEvent e) {
		name = field1.getText();
		color = field2.getText();
		System.out.println(color + name);
		field1.setText("");
		field2.setText("");
	}
	
	public void addDataToHash(String n, String c){
		name = n;
		color = c;
	}


}

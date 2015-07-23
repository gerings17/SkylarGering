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
	double wg =0, bb =0, sum =0;
	
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
		label2 = new JLabel("'white/gold' or 'blue/black'");
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
		finishButton.addActionListener(this);
		pack();
	}
	
	JLabel createImage(String imageURL) throws MalformedURLException {
	 	URL url = new URL(imageURL);
        Icon icon = new ImageIcon(url);
        return new JLabel(icon);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1){
			name = field1.getText();
			color = field2.getText();
			addDataToHash(name, color);
			//System.out.println(color + name);
			field1.setText("");
			field2.setText("");
		}
		if(e.getSource()==finishButton){
			percents();
		}
	}
	
	public void addDataToHash(String n, String c){
		name = n;
		color = c;
		colors.put(name, color);
	}
	public void percents(){
		for (Object value : colors.values()) {
			if(value.equals("white/gold")){
				wg++;
				
			}
			if(value.equals("blue/black")){
				bb++;
			}
		}
		sum = bb+wg;
		//System.out.println(sum);
		
		double bbpercent = (bb/sum)*100;
		//System.out.println((bb/sum)*100);
		double wgpercent = (wg/sum)*100;
		//System.out.println(wgpercent);
		
		JOptionPane.showMessageDialog(null, wgpercent +"% of people see the dress as white/gold and "+ bbpercent + "% of people see the dress as blue/black.");
	}


}

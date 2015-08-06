import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Scanner;

public class opticalIllusion extends JFrame{
	
	public static void main(String[]args){
		int BOXES_PER_SIDE;
		int BOX_SIZE;
		int BOX_SPACING;
		int windowLW;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter in how many boxes you want per side.");
		BOXES_PER_SIDE = reader.nextInt();
		System.out.println("Please enter in how large you would like each side of the box to be.");
		BOX_SIZE = reader.nextInt();
		System.out.println("Please enter in how large you would like the spacing between each box to be.");
		BOX_SPACING = reader.nextInt(); 
		windowLW = (BOXES_PER_SIDE * BOX_SIZE) + ((BOXES_PER_SIDE + 1)*BOX_SPACING);
		opticalIllusion a  = new opticalIllusion(windowLW);
		
	}
	
//	int sizeOfWindow(){
//		Scanner reader = new Scanner(System.in);
//		System.out.println("Please enter in how many boxes you want per side.");
//		BOXES_PER_SIDE = reader.nextInt();
//		System.out.println("Please enter in how large you would like each side of the box to be.");
//		BOX_SIZE = reader.nextInt();
//		System.out.println("Please enter in how large you would like the spacing between each box to be.");
//		BOX_SPACING = reader.nextInt(); 
//		windowLW = (BOXES_PER_SIDE * BOX_SIZE) + ((BOXES_PER_SIDE + 1)*BOX_SPACING);
//		return windowLW;
//	}
	
	public opticalIllusion(int size){
		setTitle("Frame Size");
		setSize(size, size);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JLabel side = new JLabel();
		
	}

}

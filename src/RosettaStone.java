
import java.awt.Container;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.HashMap;

import java.util.Random;

import javax.swing.*;

public class RosettaStone extends JFrame implements ActionListener {

	HashMap<String, String> translate = new HashMap<String, String>();

	String buttonText = "";

	JButton b;

	public static void main(String[] args) {

		RosettaStone a = new RosettaStone();

	}

	public RosettaStone() {

		setTitle("Rosetta Stone");

		setSize(400, 400);

		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		addWords();

		buttonText = getRandomKey(translate);

		b = new JButton(buttonText);

		add(panel);

		panel.add(b);
		pack();

		b.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		String buttonTextKey = translate.get(buttonText);

		if (buttonTextKey == null) {

			buttonText = getRandomKey(translate);
			b.setText(buttonText);

		}

		else { // spanish
			b.setText(buttonTextKey);
			buttonText = buttonTextKey;

		}

	}

	public void addWords() {

		translate.put("hola", "hello");

		translate.put("primavera", "spring");

		translate.put("llover", "rain");

		translate.put("jardin", "garden");

		translate.put("orugg", "caterpillar");

		translate.put("caracol", "snail");

		translate.put("fuera", "outside");

		translate.put("pez", "fish");

		translate.put("luna", "moon");

		translate.put("sol", "sun");

		translate.put("el tigre", "tiger");

		translate.put("el arbol", "tree");

		translate.put("el pastel", "cake");

		translate.put("la pelota", "ball");

		translate.put("el velero", "sailing boat");

	}

	String getRandomKey(HashMap<String, String> map) {

		String[] keysAsArray = map.keySet().toArray(new String[0]);

		int randomness = new Random().nextInt(map.size());

		return keysAsArray[randomness];

	}

}

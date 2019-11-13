package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
	String Input= JOptionPane.showInputDialog("What's your favorite color?");
	JOptionPane.showMessageDialog(null, Input+ " is my favorite color too!");
	

	
	Robot S=new Robot("mini");
	S.setSpeed(100);
		S.penDown();
		
		for (int i = 0; i < 3; i++) {
		
		S.turn(120);
S.move(100);





		}
}
}


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Jimmy Silva
 * 
 * this class is the graphical user interface that creates a JFrame for the layers of images to be added to.
 * Once the layers are set the implemented MouseListener will look for a mouseClicked MouseEvent in order to remove that particular layer 
 */

public class Viewer implements MouseListener{

	static JFrame frame = new JFrame("PlaceHolder title"); //rename this
	static JPanel panelone = new JPanel(); //Creates the first layer that will hold the image that will be seen first
	static JPanel paneltwo = new JPanel();//panel will be setVisible(true) or (false) depending on mouseEvent
	static JPanel panelthree = new JPanel();//panel will be setVisible(true) or (false) depending on actionEvent if user enters correct answer
	
	public static void setsize(int x, int y){
		frame.setSize(x, y);
		}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args){
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setsize(1200, 800);
		//add the JMenu here 
		//add the images to the panels
		//etc etc I'm going to bed
	}

	
}

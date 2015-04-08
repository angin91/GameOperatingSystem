package se.angin.gop.main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	public boolean fse = false;
	public int fsm = 0;
	public GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[1];
	
	public GameWindow(String title, int width, int height){
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	private void setFullscreen(){
		switch(fsm){
		case 0:
			System.out.println("No Fullscreen");
			setUndecorated(false);
			break;
		case 1:
			setUndecorated(true);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case 2:
			setUndecorated(true);
			device.setFullScreenWindow(this);
			break;
		}
	}
	
	public void setFullscreen(int fsnm){
		fse = true;
		if(fsm <=2){
			this.fsm = fsnm;
			setFullscreen();
		}else{
			System.err.println("Error " + fsnm + "is not Supported");
		}
	}
}

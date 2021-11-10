package main;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int x = 200;
	int y = 200;
	int diameter = 25;
	Random random = new Random();
	int max = 10;
	int min = -10;
	int dirX = random.nextInt(max-min) + min;
	int dirY = random.nextInt(max-min) + min;
	Ball ball = new Ball(x, y, diameter, dirX, dirY);
	
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(ball.getPosX(), ball.getPosY(), ball.getDiameter(), ball.getDiameter());
	}
	
	private void updatePosition() {
		//Edge detection
		if (ball.getPosX() <= 25 || ball.getPosX() >= 775) {
			ball.setDirX(ball.getDirX()*-1);
		} else if (ball.getPosY() <= 10 || ball.getPosY() >= 390) {
			ball.setDirY(ball.getDirY()*-1);
		}
		System.out.println("Direction X ->" + ball.getDirX());
		System.out.println("Direction Y ->" + ball.getDirY());
		ball.setPosX(ball.getPosX() + ball.getDirX());
		ball.setPosY(ball.getPosY() + ball.getDirY());
	}
	
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Bouncing Ball");
		Canvas canvas = new Canvas();
		frame.add(canvas);
		frame.setSize(800, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true) {
			canvas.updatePosition();
			canvas.repaint();
			Thread.sleep(10);
		}
	}
	
	

}

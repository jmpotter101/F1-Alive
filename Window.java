package com.johnmichaelpotter.main;

import java.awt.Canvas;

public class Window extends Canvas {
	
	private static final long serialVersionUID = 
	
	public Window(int width, int height, String title, Game game) {
		Jframe frame = new JFrame(title);
		
		frame.setPrefferedSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeto(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}
	
}
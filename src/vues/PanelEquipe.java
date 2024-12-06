package vues;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class PanelEquipe extends JPanel {
	
	JLabel label;
	BufferedImage image1;
	JButton imageBTN;
	
	
	PanelEquipe (){
		
		label = new JLabel ("Les Equipes");
		//image1 = ImageIO.read(getClass().getResource("resources/water.bmp"));
		imageBTN.setIcon(new ImageIcon(image1));
		
		
		add(label);
		
	}
	
	public static void main(String[] args) {
		PanelEquipe pe = new PanelEquipe();
		JFrame f = new JFrame();
		f.add(pe);
	}
	

}

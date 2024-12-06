package vues;

import javax.swing.*;

public class FenetreJO extends JPanel{
	
public static void main(String[] args) {
		
		JFrame fenetre = new JFrame("Jeux Olympiques");
		fenetre.setSize(300,300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fenetre.add(new PanelPlanning());
		
		fenetre.setVisible(true);
	}
}

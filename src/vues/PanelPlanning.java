package vues;

import javax.swing.*;

public class PanelPlanning extends JPanel {
	
	JTable planning;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	
	public PanelPlanning() {
		super();
		
		b1 = new JButton("Escalade");
		b2 = new JButton("Badminton");
		b3 = new JButton("VolleyBall");
		b4 = new JButton("Aviron");
		b5 = new JButton("Cyclisme");
		b6 = new JButton("Athletisme");
		
		
		JButton [][] buttons = {{b1,b2},{b3,b4},{b5,b6}};
		String [] titres = {"nom","prenom","age"};
		planning.getColumn("Button");
		
		 planning = new JTable (buttons,titres);
		 
		 /*add(p);
		 add(p1);
		 add(p2);
		 add(p3);
		 add(p4);
		 add(p5);
		 add(p6);*/
		 add(planning);
	}

}

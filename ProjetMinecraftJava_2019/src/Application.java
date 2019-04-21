import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Application extends JFrame  {

	Modele modl;
	
	public Application(Modele modl) {
		this.modl = modl;
		this.setTitle("Crafting");
		this.setSize(680, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Controleur ctrl = new Controleur(modl);
		this.setLayout(null);
		JLabel jl = new JLabel(new ImageIcon("craftingfleche.png"));
		jl.setBounds(new Rectangle(440,90,67,67));
		AWT_Inventaire inventaire = new AWT_Inventaire(modl,ctrl);
		AWT_crafting craft = new AWT_crafting(modl,ctrl);
		AWT_Recette recette = new AWT_Recette(modl,ctrl);
		this.add(recette);
		this.add(craft);
		this.add(inventaire);
		this.add(jl);
		this.setVisible(true);
	}

	

	
	
}
package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.view.*;

public class Controller implements ActionListener{
	View view;
	public Controller() {
		view=new View();
		view.getBotonJuego().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(view.getBotonJuego())) {
			view.getPanelTablero().escribirTablero();
		}
		
	}

}

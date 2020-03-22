package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.*;

public class Controller implements ActionListener{
	View view;
	Computadora comp;
	public Controller() {
		view=new View();
		view.getBotonJuego().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(view.getBotonJuego())) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					view.getPanelTablero().getTablero()[i][j].getText();
					System.out.println(view.getPanelTablero().getTablero()[i][j].getText());
				}
				}
			//comp=new Computadora(view.getPanelTablero().getTablero());
			//view.getPanelTablero().reescribirTablero(comp.escribirRespuesta());
			
		}
		
	}

}

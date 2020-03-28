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
	int turno=0;
	public Controller() {
		view=new View();
		view.getBotonJuego().addActionListener(this);
		}
	public void actionPerformed(ActionEvent e) {
		if(turno>3) {
			JOptionPane.showMessageDialog(null,"Empate. No pudimos");
		}
		buscarGanador();
		comp=new Computadora(entregarTablero(),turno);
		view.getPanelTablero().reescribirTablero(comp.escribirRespuesta());
		
		buscarGanador();
		turno++;
	}
	public String[][] entregarTablero(){
		String matriz[][]= new String [3][3];
		while(!view.getPanelTablero().getCampo1().getText().equalsIgnoreCase("x") && !view.getPanelTablero().getCampo1().getText().equalsIgnoreCase("")){
			JOptionPane.showMessageDialog(null, "Por favor escriba solo X");
			view.getPanelTablero().getCampo1().setText("");
		}
		matriz[0][0]=view.getPanelTablero().getCampo1().getText().toUpperCase();
		matriz[0][1]=view.getPanelTablero().getCampo2().getText().toUpperCase();
		matriz[0][2]=view.getPanelTablero().getCampo3().getText().toUpperCase();
		matriz[1][0]=view.getPanelTablero().getCampo4().getText().toUpperCase();
		matriz[1][1]=view.getPanelTablero().getCampo5().getText().toUpperCase();
		matriz[1][2]=view.getPanelTablero().getCampo6().getText().toUpperCase();
		matriz[2][0]=view.getPanelTablero().getCampo7().getText().toUpperCase();
		matriz[2][1]=view.getPanelTablero().getCampo8().getText().toUpperCase();
		matriz[2][2]=view.getPanelTablero().getCampo9().getText().toUpperCase();
		return matriz;
	}
	public void buscarGanador() {
		//Horizaontales
		analizarPosiciones(view.getPanelTablero().getCampo1(),view.getPanelTablero().getCampo2(),view.getPanelTablero().getCampo3());
		analizarPosiciones(view.getPanelTablero().getCampo4(),view.getPanelTablero().getCampo5(),view.getPanelTablero().getCampo6());
		analizarPosiciones(view.getPanelTablero().getCampo7(),view.getPanelTablero().getCampo8(),view.getPanelTablero().getCampo9());
		//verticales
		analizarPosiciones(view.getPanelTablero().getCampo1(),view.getPanelTablero().getCampo4(),view.getPanelTablero().getCampo7());
		analizarPosiciones(view.getPanelTablero().getCampo2(),view.getPanelTablero().getCampo5(),view.getPanelTablero().getCampo8());
		analizarPosiciones(view.getPanelTablero().getCampo3(),view.getPanelTablero().getCampo6(),view.getPanelTablero().getCampo9());
		//diagonales
		analizarPosiciones(view.getPanelTablero().getCampo1(),view.getPanelTablero().getCampo5(),view.getPanelTablero().getCampo9());
		analizarPosiciones(view.getPanelTablero().getCampo3(),view.getPanelTablero().getCampo5(),view.getPanelTablero().getCampo7());
	}
	public void analizarPosiciones(JTextField J1,JTextField J2,JTextField J3) {
		if(J1.getText().equalsIgnoreCase("x") && J2.getText().equalsIgnoreCase("x") && J3.getText().equalsIgnoreCase("x")) {
			JOptionPane.showMessageDialog(null,"Hmm, me ganaste, �qu� aburrido!");
		}
		else if(J1.getText().equalsIgnoreCase("o") && J2.getText().equalsIgnoreCase("o") && J3.getText().equalsIgnoreCase("o")) {
			JOptionPane.showMessageDialog(null,"�Ja, ja te gane humano!");
		}
	}
}



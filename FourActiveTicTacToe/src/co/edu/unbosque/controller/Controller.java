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
		buscarGanador();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(((view.getPanelTablero1().toString())));	
			}
			System.out.println();
		}
		//comp=new Computadora(entregarTablero());
		//view.getPanelTablero1().reescribirTablero(comp.escribirRespuesta());
		buscarGanador();
	}
	/*public String[][] entregarTablero(){
		String matriz[][]= new String [3][3];
		while(!view.getPanelTablero1().getCampo1().getText().equalsIgnoreCase("x") && !view.getPanelTablero1().getCampo1().getText().equalsIgnoreCase("")){
			JOptionPane.showMessageDialog(null, "Por favor escriba solo X");
			view.getPanelTablero1().getCampo1().setText("");
		}
		matriz[0][0]=view.getPanelTablero1().getCampo1().getText().toUpperCase();
		matriz[0][1]=view.getPanelTablero1().getCampo2().getText().toUpperCase();
		matriz[0][2]=view.getPanelTablero1().getCampo3().getText().toUpperCase();
		matriz[1][0]=view.getPanelTablero1().getCampo4().getText().toUpperCase();
		matriz[1][1]=view.getPanelTablero1().getCampo5().getText().toUpperCase();
		matriz[1][2]=view.getPanelTablero1().getCampo6().getText().toUpperCase();
		matriz[2][0]=view.getPanelTablero1().getCampo7().getText().toUpperCase();
		matriz[2][1]=view.getPanelTablero1().getCampo8().getText().toUpperCase();
		matriz[2][2]=view.getPanelTablero1().getCampo9().getText().toUpperCase();
		return matriz;
	}*/
	public void buscarGanador() {
		//Horizaontales
		analizarPosiciones(view.getPanelTablero1().getCampo1(),view.getPanelTablero1().getCampo2(),view.getPanelTablero1().getCampo3());
		analizarPosiciones(view.getPanelTablero1().getCampo4(),view.getPanelTablero1().getCampo5(),view.getPanelTablero1().getCampo6());
		analizarPosiciones(view.getPanelTablero1().getCampo7(),view.getPanelTablero1().getCampo8(),view.getPanelTablero1().getCampo9());
		//verticales
		analizarPosiciones(view.getPanelTablero1().getCampo1(),view.getPanelTablero1().getCampo4(),view.getPanelTablero1().getCampo7());
		analizarPosiciones(view.getPanelTablero1().getCampo2(),view.getPanelTablero1().getCampo5(),view.getPanelTablero1().getCampo8());
		analizarPosiciones(view.getPanelTablero1().getCampo3(),view.getPanelTablero1().getCampo6(),view.getPanelTablero1().getCampo9());
		//diagonales
		analizarPosiciones(view.getPanelTablero1().getCampo1(),view.getPanelTablero1().getCampo5(),view.getPanelTablero1().getCampo9());
		analizarPosiciones(view.getPanelTablero1().getCampo3(),view.getPanelTablero1().getCampo5(),view.getPanelTablero1().getCampo7());
	}
	public void analizarPosiciones(JTextField J1,JTextField J2,JTextField J3) {
		if(J1.getText().equalsIgnoreCase("x") && J2.getText().equalsIgnoreCase("x") && J3.getText().equalsIgnoreCase("x")) {
			JOptionPane.showMessageDialog(null,"Hmm, me ganaste, ¡qué aburrido!");
		}
		else if(J1.getText().equalsIgnoreCase("o") && J2.getText().equalsIgnoreCase("o") && J3.getText().equalsIgnoreCase("o")) {
			JOptionPane.showMessageDialog(null,"¡Ja, ja te gane humano!");
		}
	}
}



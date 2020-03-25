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
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//view.getPanelTablero().getTablero().addActionListener(this);
				}
			}
		}
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(((entregarTablero()[i][j])));	
			}
		}
		comp=new Computadora(entregarTablero());
		view.getPanelTablero1().reescribirTablero(comp.escribirRespuesta());
		
	}
	public String[][] entregarTablero(){
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
	}
					
}



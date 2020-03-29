package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.*;

public class Controller implements ActionListener{
	private View view;
	private Computadora comp;
	private int turno=0;
	private int contadorX=1;
	public Controller() {
		view=new View();
		view.getBotonJuego().addActionListener(this);
		}
	public void actionPerformed(ActionEvent e) {
		if(!verificarEntrada()) {
			while(!verificarEntrada()) {
				view.mostrarMensaje(1);
				for(int i=0;i<view.getPanelTablero().getTablero().size();i++) {
					if(!view.getPanelTablero().getTablero().get(i).getText().equalsIgnoreCase("x")
							&& !view.getPanelTablero().getTablero().get(i).getText().equalsIgnoreCase("")
							&& !view.getPanelTablero().getTablero().get(i).getText().equalsIgnoreCase("o"))
						view.getPanelTablero().getTablero().get(i).setText("");
					}
				}
			}
		else if(contadorX<contarX()) {
			view.mostrarMensaje(2);
		}
		else if(contarX()==0 || contadorX>contarX()) {
			view.mostrarMensaje(3);
		}
		else {
		buscarGanador();
		comp=new Computadora(entregarTablero(),turno);
		view.getPanelTablero().reescribirTablero(comp.escribirRespuesta());
		buscarGanador();
		turno++;
		contadorX++;
		}
		if(turno>4) {
			view.mostrarMensaje(4);
			validarNuevoJuego();
			
			
		}
	}
	public int contarX() {
		int contador=0;
		for(int i=0;i<view.getPanelTablero().getTablero().size();i++) {
			if(view.getPanelTablero().getTablero().get(i).getText().equalsIgnoreCase("x"))
				contador++;
		}
		return contador;
	}
	public String[][] entregarTablero(){
		String matriz[][]= new String [3][3];
		
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
		//Horizontales
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
	public boolean verificarEntrada() {
			for(int i=0;i<view.getPanelTablero().getTablero().size();i++) {
				if(!view.getPanelTablero().getTablero().get(i).getText().equalsIgnoreCase("x")
				&& !view.getPanelTablero().getTablero().get(i).getText().equalsIgnoreCase("")
				&& !view.getPanelTablero().getTablero().get(i).getText().equalsIgnoreCase("o")){
					return false;
					}
				}
			return true;
			}
	public void analizarPosiciones(JTextField J1,JTextField J2,JTextField J3) {
		if(J1.getText().equalsIgnoreCase("x") && J2.getText().equalsIgnoreCase("x") && J3.getText().equalsIgnoreCase("x")) {
			view.mostrarMensaje(5);
			validarNuevoJuego();
			
		}
		else if(J1.getText().equalsIgnoreCase("o") && J2.getText().equalsIgnoreCase("o") && J3.getText().equalsIgnoreCase("o")) {
			view.mostrarMensaje(6);
			validarNuevoJuego();
			
		}
	}
	public View getView() {
		return view;
	}
	public void setView(View view) {
		this.view = view;
	}
	public Computadora getComp() {
		return comp;
	}
	public void setComp(Computadora comp) {
		this.comp = comp;
	}
	public void validarNuevoJuego() {
		if(view.repetirJuego()==1) {
			view.dispose();
			AplMain.main (null);
		}
		else
			view.dispose();
	}
	
	
}



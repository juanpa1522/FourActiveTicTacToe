package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class View extends javax.swing.JFrame {
	private JButton botonJuego;
	private PanelTablero panelTablero;
	private PanelTableroAuxiliar panelTablero1;
	
	
	
    public View() {
    	
    	setSize(450,510);
		setResizable(false);
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializar();
		setVisible(true);
    }
    
    public void inicializar() {
    	panelTablero1 = new PanelTableroAuxiliar();
		panelTablero1.setBounds(0,0,450,450);
		add(panelTablero1);
		botonJuego= new JButton("Juego");
		botonJuego.setBounds(0,450,450,30);
		add(botonJuego);
    }

	public JButton getBotonJuego() {
		return botonJuego;
	}

	public void setBotonJuego(JButton botonJuego) {
		this.botonJuego = botonJuego;
	}

	public PanelTablero getPanelTablero() {
		return panelTablero;
	}

	public void setPanelTablero(PanelTablero panelTablero) {
		this.panelTablero = panelTablero;
	}

	public PanelTableroAuxiliar getPanelTablero1() {
		return panelTablero1;
	}

	public void setPanelTablero1(PanelTableroAuxiliar panelTablero1) {
		this.panelTablero1 = panelTablero1;
	}  
	
}


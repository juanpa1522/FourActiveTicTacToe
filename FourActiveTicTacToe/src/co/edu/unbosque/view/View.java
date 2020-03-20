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
	private static JLabel fondo = new JLabel(new ImageIcon("imagenesTicTacToe\\fondoTicTacToe.png"));
	
	
    public View() {
    	
    	setSize(450,520);
		setResizable(false);
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		panelTablero = new PanelTablero();
		add(fondo,BorderLayout.CENTER);
		add(panelTablero,BorderLayout.CENTER);
		botonJuego= new JButton("Juego");
		add(botonJuego,BorderLayout.SOUTH);
		inicializar();
		
		setVisible(true);
    }
    
    public void inicializar() {
    	panelTablero = new PanelTablero();
    	fondo.setBounds(0,0,450,450);
		add(fondo);
		panelTablero.setBounds(0,0,450,450);
		add(panelTablero);
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
    
}


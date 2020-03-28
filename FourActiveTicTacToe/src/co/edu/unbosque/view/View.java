package co.edu.unbosque.view;

import javax.swing.JButton;

public class View extends javax.swing.JFrame {
	private JButton botonJuego;
	private PanelTablero panelTablero;
	
	
	
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
    	panelTablero = new PanelTablero();
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

	public void setPanelTablero1(PanelTablero panelTablero) {
		this.panelTablero = panelTablero;
	}  
	
}


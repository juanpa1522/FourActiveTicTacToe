package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame {
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
	public void mostrarMensaje(int valor) {
		switch(valor) {
		case(1):
			JOptionPane.showMessageDialog(null, "Por favor escriba solo X");
			break;
		case(2):
			JOptionPane.showMessageDialog(null, "Estas colocando mas de una X recueda poner solo 1 por turno");
			break;
		case(3):
			JOptionPane.showMessageDialog(null, "No estas colocando ninguna X recueda poner solo 1 por turno");
			break;
		case(4):
			JOptionPane.showMessageDialog(null,"Empate. No pudimos");
			break;
		case(5):
			JOptionPane.showMessageDialog(null,"Hmm, me ganaste, ¡qué aburrido!");
			break;
		case(6):
			JOptionPane.showMessageDialog(null,"¡Ja, ja te gane humano!");
		
		}
	}
	public int repetirJuego() {
		int codigo=JOptionPane.showConfirmDialog(null, "¿Quieres volver a Jugar?");
        if (codigo==JOptionPane.YES_OPTION){
            return 1;
        }else
            return 0;
	}
}


package co.edu.unbosque.view;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTablero extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField[][] tablero= new JTextField[3][3];
	
	
	public PanelTablero() {
		setSize(450,450);
		setLayout( new GridLayout(3,3) );
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				add(escribirTablero()[i][j]);
			}
		}
	}

	public JTextField[][] getTablero() {
		return tablero;
	}

	public void setTablero(JTextField tablero[][]) {
		this.tablero = tablero;
	}
	
	public JTextField[][] escribirTablero(){
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				getTablero()[i][j]= new JTextField(2);
				getTablero()[i][j].setBackground(Color.BLACK);
				getTablero()[i][j].setBorder(null);
				getTablero()[i][j].setFont(new java.awt.Font("Posicion", 2, 100));
				getTablero()[i][j].setForeground(Color.WHITE);
				getTablero()[i][j].setHorizontalAlignment(JTextField.CENTER);

			}
		}
		return tablero;
	}
	
	public String[][] entregarTablero(){
		String matriz[][]= new String [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j]=tablero[i][j].getText();
			}
		}
		return matriz;
	}
}

package co.edu.unbosque.view;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTablero extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField tablero[][]= new JTextField[3][3];
	
	
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

	public void setTablero(JTextField[][] tablero) {
		this.tablero = tablero;
	}
	
	public JTextField[][] escribirTablero(){
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				tablero[i][j]=new JTextField(1);
				tablero[i][j].setBackground(Color.BLACK);
				tablero[i][j].setBorder(null);
				tablero[i][j].setFont(new java.awt.Font("Posicion", 2, 100));
				tablero[i][j].setForeground(Color.WHITE);
				tablero[i][j].setHorizontalAlignment(JTextField.CENTER);
				tablero[i][j].setSize(150, 150);
			}
		}
		return tablero;
	}
	
	public JTextField[][] reescribirTablero(String[][] matriz){
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				tablero[i][j]=new JTextField(1);
				tablero[i][j].setBackground(Color.BLACK);
				tablero[i][j].setBorder(null);
				tablero[i][j].setFont(new java.awt.Font("Posicion", 2, 100));
				tablero[i][j].setForeground(Color.WHITE);
				tablero[i][j].setHorizontalAlignment(JTextField.CENTER);
				tablero[i][j].setSize(150, 150);
				tablero[i][j].setText(matriz[i][j]);
				if(tablero[i][j].getText()!="") {
					tablero[i][j].setEditable(false);
				}
			}
		}
		return tablero;
	}
}

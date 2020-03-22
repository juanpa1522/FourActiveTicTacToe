package co.edu.unbosque.model;

import javax.swing.JTextField;

public class Computadora {
	private String[][] tablero= new String[3][3];
	
	public Computadora(JTextField tablero[][]) {
		this.tablero= obtenerTablero(tablero);
		
	}
	public String[][] obtenerTablero(JTextField tablero[][]){
		String matriz[][]= new String [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j]=tablero[i][j].getText();
			}
		}
		return matriz;
	}
	public String[][] escribirRespuesta() {
		String matriz[][]= getTablero();
		matriz[1][1]="O";
		return matriz;
	}
	public String[][] getTablero() {
		return tablero;
	}
	public void setTablero(String[][] tablero) {
		this.tablero = tablero;
	}
	
}

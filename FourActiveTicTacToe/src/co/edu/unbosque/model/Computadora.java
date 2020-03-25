package co.edu.unbosque.model;


public class Computadora {
	private String[][] tablero= new String[3][3];
	
	public Computadora(String tablero[][]) {
		this.tablero=tablero;
		
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

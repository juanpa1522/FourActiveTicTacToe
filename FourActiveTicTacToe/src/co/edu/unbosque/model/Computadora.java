package co.edu.unbosque.model;


public class Computadora {
	private String[][] tablero= new String[3][3];
	
	public Computadora(String tablero[][]) {
		this.tablero=tablero;
		if(ocacionPropicia(tablero)) {
			
		}
		if(peligro(tablero)) {
			
		}
		
		
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
	public boolean peligro(String tablero[][]) {
		int pivote=0;
		for(int i=0;i<3;i++) {
				//Horizontales
				if((tablero[i][pivote].equalsIgnoreCase("x") && tablero[i][pivote+1].equalsIgnoreCase("x") && tablero[i][pivote+2].equalsIgnoreCase(""))
						||(tablero[i][pivote].equalsIgnoreCase("") && tablero[i+1][pivote+1].equalsIgnoreCase("x") && tablero[i+2][pivote+2].equalsIgnoreCase("x"))
						||(tablero[i][pivote].equalsIgnoreCase("x") && tablero[i+1][pivote+1].equalsIgnoreCase("") && tablero[i+2][pivote+2].equalsIgnoreCase("x")) )
					return true;
				//verticales
				else if (tablero[pivote][i].equalsIgnoreCase("x") && tablero[pivote+1][i].equalsIgnoreCase("x") && tablero[pivote+2][i].equalsIgnoreCase("")
						||(tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("x") && tablero[pivote+2][i].equalsIgnoreCase("x"))
						||(tablero[pivote][i].equalsIgnoreCase("x") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("x")))
					return true;
				
			}
		//diagonales
		if ((tablero[0][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("x") && tablero[2][2].equalsIgnoreCase(""))
				||(tablero[0][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("x") && tablero[2][2].equalsIgnoreCase("x"))
				||(tablero[0][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("x")))
			return true;
		else if ((tablero[2][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("x") && tablero[0][2].equalsIgnoreCase(""))
				||(tablero[2][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("") && tablero[0][2].equalsIgnoreCase("x"))
				|| (tablero[2][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("x") && tablero[0][2].equalsIgnoreCase("x")))
			return true;
		else 
			return false;
	}
	public boolean ocacionPropicia(String tablero[][]) {
		int pivote=0;
		for(int i=0;i<3;i++) {
			//Horizontales
			if((tablero[i][pivote].equalsIgnoreCase("o") && tablero[i][pivote+1].equalsIgnoreCase("o") && tablero[i][pivote+2].equalsIgnoreCase(""))
					||(tablero[i][pivote].equalsIgnoreCase("") && tablero[i+1][pivote+1].equalsIgnoreCase("o") && tablero[i+2][pivote+2].equalsIgnoreCase("o"))
					||(tablero[i][pivote].equalsIgnoreCase("o") && tablero[i+1][pivote+1].equalsIgnoreCase("") && tablero[i+2][pivote+2].equalsIgnoreCase("o")) )
				return true;
			//verticales
			else if (tablero[pivote][i].equalsIgnoreCase("o") && tablero[pivote+1][i].equalsIgnoreCase("o") && tablero[pivote+2][i].equalsIgnoreCase("")
					||(tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("o") && tablero[pivote+2][i].equalsIgnoreCase("o"))
					||(tablero[pivote][i].equalsIgnoreCase("o") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("o")))
				return true;
			
		}
		// diagonales
		if ((tablero[0][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("o") && tablero[2][2].equalsIgnoreCase(""))
				||(tablero[0][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("o") && tablero[2][2].equalsIgnoreCase("o"))
				||(tablero[0][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("o")))
			return true;
		else if ((tablero[2][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("o") && tablero[0][2].equalsIgnoreCase(""))
				||(tablero[2][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("") && tablero[0][2].equalsIgnoreCase("o"))
				|| (tablero[2][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("o") && tablero[0][2].equalsIgnoreCase("o")))
			return true;
		else 
			return false;
	}
	
	public String[] leerTablero(String matriz[][]) {
		int contador=0;
		int pivote=0;
		String cadena="";
		String lectura[]=new String[8];
		while(contador<6) {
			for(int i=0;i<3;i++) {
				cadena=matriz[i][pivote]+matriz[i][pivote+1]+matriz[i][pivote+2];
				lectura[contador]=cadena;
				cadena="";
				cadena=matriz[pivote][i]+matriz[pivote+1][i]+matriz[pivote+2][i];
				lectura[contador+3]=cadena;
				cadena="";
				contador++;
			}
		}
		lectura[6]=cadena=matriz[0][0]+matriz[1][1]+matriz[2][2];
		cadena="";
		lectura[7]=cadena=matriz[2][0]+matriz[1][1]+matriz[0][2];
		return lectura;
		
	}

}

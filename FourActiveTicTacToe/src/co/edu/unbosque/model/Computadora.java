package co.edu.unbosque.model;


public class Computadora {
	private String[][] tablero= new String[3][3];
	
	
	public Computadora(String tableroE[][],int turno) {
		this.tablero=tableroE;
		if(turno<1) {
			if(tablero[0][0].equalsIgnoreCase("x")||tablero[0][2].equalsIgnoreCase("x")
					||tablero[2][0].equalsIgnoreCase("x")||tablero[2][2].equalsIgnoreCase("x"))
				tablero[1][1]="O";
			else if(tablero[0][1].equalsIgnoreCase("x")||tablero[1][0].equalsIgnoreCase("x")
					||tablero[1][2].equalsIgnoreCase("x")||tablero[2][1].equalsIgnoreCase("x"))
				tablero[1][1]="O";
			else {
				tablero[0][2]="O";
			}
		}
		else {
			if(ocacionPropicia(tablero)) {
				resolverOcacionPropicia(tablero);	
			}
			else if(peligro(tablero)) {
				resolverPeligro(tablero);
			}
			else {
				realizarAtaque(tablero);
			}
		}
		escribirRespuesta();
	}
	public String[][] escribirRespuesta() {
		String matriz[][]= getTablero();
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
				//filas
				if((tablero[i][pivote].equalsIgnoreCase("x") && tablero[i][pivote+1].equalsIgnoreCase("x") && tablero[i][pivote+2].equalsIgnoreCase(""))
						||(tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("x") && tablero[i][pivote+2].equalsIgnoreCase("x"))
						||(tablero[i][pivote].equalsIgnoreCase("x") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("x")) )
					return true;
				//columnas
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
			//Filas
			if((tablero[i][pivote].equalsIgnoreCase("o") && tablero[i][pivote+1].equalsIgnoreCase("o") && tablero[i][pivote+2].equalsIgnoreCase(""))
					||(tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("o") && tablero[i][pivote+2].equalsIgnoreCase("o"))
					||(tablero[i][pivote].equalsIgnoreCase("o") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("o")) )
				return true;
			//Columnas
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
	public void resolverOcacionPropicia(String tablero[][]) {
		int cont=0;
		int pivote=0;
		for(int i=0;i<3;i++) {
			//Filas
			if(tablero[i][pivote].equalsIgnoreCase("o") && tablero[i][pivote+1].equalsIgnoreCase("o") && tablero[i][pivote+2].equalsIgnoreCase("")
					&& cont<1) {
				tablero[i][pivote+2]="O";
				cont++;
			}
			if(tablero[i][pivote].equalsIgnoreCase("o") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("o")
					&& cont<1) {
				tablero[i][pivote+1]="o";
				cont++;
			}
			if(tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("o") && tablero[i][pivote+2].equalsIgnoreCase("o")
					&& cont<1) {
				tablero[i][pivote]="o";
				cont++;
			}
			//Columnas
			if (tablero[pivote][i].equalsIgnoreCase("o") && tablero[pivote+1][i].equalsIgnoreCase("o") && tablero[pivote+2][i].equalsIgnoreCase("")
					&& cont<1) {
				tablero[pivote+2][i]="o";
				cont++;
			}
			if (tablero[pivote][i].equalsIgnoreCase("o") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("o")
					&& cont<1) {
				tablero[pivote+1][i]="o";
				cont++;
			}
			if (tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("o") && tablero[pivote+2][i].equalsIgnoreCase("o")
					&& cont<1) {
				tablero[pivote][i]="o";	
				cont++;
			}
		}
		//diagonales
		if (tablero[0][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("o") && tablero[2][2].equalsIgnoreCase("")
				&& cont<1) {
			tablero[2][2]="o";
			cont++;
		}
		if (tablero[0][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("o")
				&& cont<1) {
			tablero[1][1]="o";
			cont++;
		}
		if (tablero[0][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("o") && tablero[2][2].equalsIgnoreCase("o")
				&& cont<1) {
			tablero[0][0]="o";
			cont++;
		}
		if (tablero[2][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("o") && tablero[0][2].equalsIgnoreCase("")
				&& cont<1) {
			tablero[0][2]="o";
			cont++;
		}
		if (tablero[2][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("") && tablero[0][2].equalsIgnoreCase("o")
				&& cont<1) {
			tablero[1][1]="o";
			cont++;
		}
		if (tablero[2][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("o") && tablero[0][2].equalsIgnoreCase("o")
				&& cont<1) {
			tablero[2][0]="o";
			cont++;
		}
	}
	public void resolverPeligro(String tablero[][]) {
		int cont=0;
		int pivote=0;
		for(int i=0;i<3;i++) {
			//Filas
			if(tablero[i][pivote].equalsIgnoreCase("x") && tablero[i][pivote+1].equalsIgnoreCase("x") && tablero[i][pivote+2].equalsIgnoreCase("")
					&& cont<1) {
					tablero[i][pivote+2]="O";
					cont++;
			}
			if(tablero[i][pivote].equalsIgnoreCase("x") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("x")
					&& cont<1) {
				tablero[i][pivote+1]="o";
				cont++;
			}
			if(tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("x") && tablero[i][pivote+2].equalsIgnoreCase("x")
					&& cont<1) {
				tablero[i][pivote]="o";
				cont++;
			}
			//Columnas
			if (tablero[pivote][i].equalsIgnoreCase("x") && tablero[pivote+1][i].equalsIgnoreCase("x") && tablero[pivote+2][i].equalsIgnoreCase("")
					&& cont<1) {
				tablero[pivote+2][i]="o";
				cont++;
			}
			if (tablero[pivote][i].equalsIgnoreCase("x") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("x")
					&& cont<1) {
				tablero[pivote+1][i]="o";
				cont++;
			}
			if (tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("x") && tablero[pivote+2][i].equalsIgnoreCase("x")
					&& cont<1) {
				tablero[pivote][i]="o";
				cont++;
			}
		}
		//diagonales
		if (tablero[0][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("x") && tablero[2][2].equalsIgnoreCase("")
				&& cont<1) {
			tablero[2][2]="o";
			cont++;
		}
		if (tablero[0][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("x")
				&& cont<1) {
			tablero[1][1]="o";
			cont++;
		}
		if (tablero[0][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("x") && tablero[2][2].equalsIgnoreCase("x")
				&& cont<1) {
			tablero[0][0]="o";
			cont++;
		}
		if (tablero[2][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("x") && tablero[0][2].equalsIgnoreCase("")
				&& cont<1) {
			tablero[0][2]="o";
			cont++;
		}
		if (tablero[2][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("") && tablero[0][2].equalsIgnoreCase("x")
				&& cont<1) {
			tablero[1][1]="o";
			cont++;
		}
		if (tablero[2][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("x") && tablero[0][2].equalsIgnoreCase("x")
				&& cont<1) {
			tablero[2][0]="o";
			cont++;
		}
	}
	public void realizarAtaque(String tablero[][]) {
		int cont=ocacionesEspeciales(tablero);
		int pivote=0;
		for(int i=0;i<3;i++) {
			//Filas
			if(tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("o") && tablero[i][pivote+2].equalsIgnoreCase("")
					&& cont<1) {
				tablero[i][pivote+2]="O";
				cont++;
			}
			if(tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("o")
					&& cont<1) {
				tablero[i][pivote+1]="o";
				cont++;
			}
			if(tablero[i][pivote].equalsIgnoreCase("o") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("")
					&& cont<1) {
				tablero[i][pivote+1]="o";
				cont++;
			}
			//Columnas
			if (tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("o") && tablero[pivote+2][i].equalsIgnoreCase("")
					&& cont<1) {
				tablero[pivote+2][i]="o";
				cont++;
			}
			if (tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("o")
					&& cont<1) {
				tablero[pivote+1][i]="o";
				cont++;
			}
			if (tablero[pivote][i].equalsIgnoreCase("o") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("")
					&& cont<1) {
				tablero[pivote+1][i]="o";	
				cont++;
			}
		}
		//diagonales
		if (tablero[0][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("o") && tablero[2][2].equalsIgnoreCase("")
				&& cont<1) {
			tablero[2][2]="o";
			cont++;
		}
		if (tablero[0][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("")
				&& cont<1) {
			tablero[1][1]="o";
			cont++;
		}
		if (tablero[0][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("o")
				&& cont<1) {
			tablero[1][1]="o";
			cont++;
		}
		if (tablero[2][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("o") && tablero[0][2].equalsIgnoreCase("")
				&& cont<1) {
			tablero[0][2]="o";
			cont++;
		}
		if (tablero[2][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("") && tablero[0][2].equalsIgnoreCase("o")
				&& cont<1) {
			tablero[1][1]="o";
			cont++;
		}
		if (tablero[2][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("") && tablero[0][2].equalsIgnoreCase("")
				&& cont<1) {
			tablero[1][1]="o";
			cont++;
		}
	}
	public int ocacionesEspeciales(String tablero[][]) {
		int cont=0;
		if(tablero[0][2].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("x") && tablero[2][0].equalsIgnoreCase("x")
				&& cont<1) {
			if(tablero[0][0].equalsIgnoreCase(""))
				tablero[0][0]="o";
			else
				casosDeCierre(tablero);
			cont++;
			return cont;
			}
		
		if(tablero[0][1].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("o") && tablero[1][0].equalsIgnoreCase("x")
				&& cont<1) {
			if(tablero[0][0].equalsIgnoreCase(""))
				tablero[0][0]="o";
			else
				casosDeCierre(tablero);
			cont ++;
			return cont;
		}
		if(tablero[1][1].equalsIgnoreCase("o") && tablero[1][2].equalsIgnoreCase("x") && tablero[2][0].equalsIgnoreCase("x")
				&& cont<1) {
			if(tablero[2][2].equalsIgnoreCase(""))
				tablero[2][2]="o";
			else
				casosDeCierre(tablero);
			cont ++;
			return cont;
		}
		if(tablero[1][1].equalsIgnoreCase("o") && tablero[1][0].equalsIgnoreCase("x") && tablero[2][1].equalsIgnoreCase("x")
				&& cont<1) {
			if(tablero[2][0].equalsIgnoreCase(""))
				tablero[2][0]="o";
			else
				casosDeCierre(tablero);
			cont ++;
			return cont;
		}
		
		
		return cont;
	}
	public int casosDeCierre(String tablero[][]) {
		int cont=0;
		int pivote=0;
				for(int i=0;i<3;i++) {
					//Filas
					if(tablero[i][pivote].equalsIgnoreCase("x") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("")
							&& cont<1 || tablero[i][pivote].equalsIgnoreCase("o") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("")
							&& cont<1) {
						tablero[i][pivote+1]="O";
						cont++;
						return cont;
					}
					if(tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("x") && tablero[i][pivote+2].equalsIgnoreCase("")
							&& cont<1 || tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("o") && tablero[i][pivote+2].equalsIgnoreCase("")
							&& cont<1) {
						tablero[i][pivote]="o";
						cont++;
						return cont;
					}
					if(tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("x")
							&& cont<1 || tablero[i][pivote].equalsIgnoreCase("") && tablero[i][pivote+1].equalsIgnoreCase("") && tablero[i][pivote+2].equalsIgnoreCase("o")
							&& cont<1) {
						tablero[i][pivote+1]="o";
						cont++;
						return cont;
					}
					//Columnas
					if (tablero[pivote][i].equalsIgnoreCase("x") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("")
							&& cont<1 || tablero[pivote][i].equalsIgnoreCase("o") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("")
							&& cont<1) {
						tablero[pivote+1][i]="o";
						cont++;
						return cont;
					}
					if (tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("x") && tablero[pivote+2][i].equalsIgnoreCase("")
							&& cont<1 || tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("o") && tablero[pivote+2][i].equalsIgnoreCase("")
							&& cont<1) {
						tablero[pivote][i]="o";
						cont++;
						return cont;
					}
					if (tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("x")
							&& cont<1 || tablero[pivote][i].equalsIgnoreCase("") && tablero[pivote+1][i].equalsIgnoreCase("") && tablero[pivote+2][i].equalsIgnoreCase("o")
							&& cont<1) {
						tablero[pivote+1][i]="o";	
						cont++;
						return cont;
					}
				}
				return cont;
			}
}


package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTablero extends JPanel {
	private JTextField campo1= new JTextField(2);
	private JTextField campo2= new JTextField(2);
	private JTextField campo3= new JTextField(2);
	private JTextField campo4= new JTextField(2);
	private JTextField campo5= new JTextField(2);
	private JTextField campo6= new JTextField(2);
	private JTextField campo7= new JTextField(2);
	private JTextField campo8= new JTextField(2);
	private JTextField campo9= new JTextField(2);
	private ArrayList <JTextField> tablero= new ArrayList<JTextField>();
	
	public PanelTablero() {
		setSize(450,450);
		setLayout( new GridLayout(3,3) );
		tablero.add(campo1);
		tablero.add(campo2);
		tablero.add(campo3);
		tablero.add(campo4);
		tablero.add(campo5);
		tablero.add(campo6);
		tablero.add(campo7);
		tablero.add(campo8);
		tablero.add(campo9);
		for(int i=0;i<tablero.size();i++) {
			tablero.get(i).setBackground(Color.BLACK);
			tablero.get(i).setFont(new java.awt.Font("Posicion", 2, 100));
			tablero.get(i).setForeground(Color.WHITE);
			tablero.get(i).setHorizontalAlignment(JTextField.CENTER);
			add(tablero.get(i));
		}
	}

	public JTextField getCampo1() {
		return campo1;
	}
	public void setCampo1(JTextField campo1) {
		this.campo1 = campo1;
	}
	public JTextField getCampo2() {
		return campo2;
	}
	public void setCampo2(JTextField campo2) {
		this.campo2 = campo2;
	}
	public JTextField getCampo3() {
		return campo3;
	}
	public void setCampo3(JTextField campo3) {
		this.campo3 = campo3;
	}
	public JTextField getCampo4() {
		return campo4;
	}
	public void setCampo4(JTextField campo4) {
		this.campo4 = campo4;
	}
	public JTextField getCampo5() {
		return campo5;
	}
	public void setCampo5(JTextField campo5) {
		this.campo5 = campo5;
	}
	public JTextField getCampo6() {
		return campo6;
	}
	public void setCampo6(JTextField campo6) {
		this.campo6 = campo6;
	}
	public JTextField getCampo7() {
		return campo7;
	}
	public void setCampo7(JTextField campo7) {
		this.campo7 = campo7;
	}
	public JTextField getCampo8() {
		return campo8;
	}
	public void setCampo8(JTextField campo8) {
		this.campo8 = campo8;
	}
	public JTextField getCampo9() {
		return campo9;
	}
	public void setCampo9(JTextField campo9) {
		this.campo9 = campo9;
	}
	public ArrayList<JTextField> getTablero() {
		return tablero;
	}
	public void setTablero(ArrayList<JTextField> tablero) {
		this.tablero = tablero;
	}
	public void reescribirTablero(String[][] matriz){
		campo1.setText(matriz[0][0].toUpperCase());
		campo2.setText(matriz[0][1].toUpperCase());
		campo3.setText(matriz[0][2].toUpperCase());
		campo4.setText(matriz[1][0].toUpperCase());
		campo5.setText(matriz[1][1].toUpperCase());
		campo6.setText(matriz[1][2].toUpperCase());
		campo7.setText(matriz[2][0].toUpperCase());
		campo8.setText(matriz[2][1].toUpperCase());
		campo9.setText(matriz[2][2].toUpperCase());
		for(int i=0;i<9;i++) {
			if(!tablero.get(i).getText().equalsIgnoreCase("")) {
				tablero.get(i).setEditable(false);
			}
		}
	}
		
}

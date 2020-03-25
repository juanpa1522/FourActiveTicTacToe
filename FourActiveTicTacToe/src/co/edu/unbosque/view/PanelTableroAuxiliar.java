package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTableroAuxiliar extends JPanel {
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
	
	public PanelTableroAuxiliar() {
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
			tablero.get(i).setBorder(null);
			tablero.get(i).setFont(new java.awt.Font("Posicion", 2, 100));
			tablero.get(i).setForeground(Color.WHITE);
			tablero.get(i).setHorizontalAlignment(JTextField.CENTER);
			add(tablero.get(i));
		}
		campo1.setBackground(Color.BLACK);
		
		add(campo1);
		campo2.setBackground(Color.BLACK);
		campo2.setBorder(null);
		campo2.setFont(new java.awt.Font("Posicion", 2, 100));
		campo2.setForeground(Color.WHITE);
		campo2.setHorizontalAlignment(JTextField.CENTER);
		add(campo2);
		campo3.setBackground(Color.BLACK);
		campo3.setBorder(null);
		campo3.setFont(new java.awt.Font("Posicion", 2, 100));
		campo3.setForeground(Color.WHITE);
		campo3.setHorizontalAlignment(JTextField.CENTER);
		add(campo3);
		campo4.setBackground(Color.BLACK);
		campo4.setBorder(null);
		campo4.setFont(new java.awt.Font("Posicion", 2, 100));
		campo4.setForeground(Color.WHITE);
		campo4.setHorizontalAlignment(JTextField.CENTER);
		add(campo4);
		campo5.setBackground(Color.BLACK);
		campo5.setBorder(null);
		campo5.setFont(new java.awt.Font("Posicion", 2, 100));
		campo5.setForeground(Color.WHITE);
		campo5.setHorizontalAlignment(JTextField.CENTER);
		add(campo5);
		campo6.setBackground(Color.BLACK);
		campo6.setBorder(null);
		campo6.setFont(new java.awt.Font("Posicion", 2, 100));
		campo6.setForeground(Color.WHITE);
		campo6.setHorizontalAlignment(JTextField.CENTER);
		add(campo6);
		campo7.setBackground(Color.BLACK);
		campo7.setBorder(null);
		campo7.setFont(new java.awt.Font("Posicion", 2, 100));
		campo7.setForeground(Color.WHITE);
		campo7.setHorizontalAlignment(JTextField.CENTER);
		add(campo7);
		campo8.setBackground(Color.BLACK);
		campo8.setBorder(null);
		campo8.setFont(new java.awt.Font("Posicion", 2, 100));
		campo8.setForeground(Color.WHITE);
		campo8.setHorizontalAlignment(JTextField.CENTER);
		add(campo8);
		campo9.setBackground(Color.BLACK);
		campo9.setBorder(null);
		campo9.setFont(new java.awt.Font("Posicion", 2, 100));
		campo9.setForeground(Color.WHITE);
		campo9.setHorizontalAlignment(JTextField.CENTER);
		add(campo9);
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
	public void reescribirTablero(String[][] matriz){
		campo1.setText(matriz[0][0]);
		campo2.setText(matriz[0][1]);
		campo3.setText(matriz[0][2]);
		campo4.setText(matriz[1][0]);
		campo5.setText(matriz[1][1]);
		campo6.setText(matriz[1][2]);
		campo7.setText(matriz[2][0]);
		campo8.setText(matriz[2][1]);
		campo9.setText(matriz[2][2]);
	}
		
}

package view;

import javax.swing.JOptionPane;

import controller.controllerFatorial;

public class Principal {

	public static void main(String[] args) throws Exception {

		controllerFatorial f = new controllerFatorial();
		int op;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de (0 a 9) para calcular seu fatorial:"));
		} while (op > 9);
		
		try {
			long res = f.ConverteFatorial(op);
			System.err.println("Fatorial de " + op + " é = " +res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

}

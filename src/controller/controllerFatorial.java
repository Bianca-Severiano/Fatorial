package controller;

import model.PilhaInt;

public class controllerFatorial {

	public controllerFatorial() {
		super();
	}
	
	PilhaInt pi = new PilhaInt();
	
	public long ConverteFatorial(int entrada) throws Exception {
		long res = 1;
		do {
			pi.push(entrada);
			try {
				res = res * pi.pop();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			entrada--;
		} while (entrada > 0);
		
		return res;
	}

}

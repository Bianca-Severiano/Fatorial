package model;

public class PilhaInt {

	No topo;
	
	public PilhaInt() {
		super();
	}

	public void push(int valor) { 
		No elemento = new No(); 
		elemento.dado = valor; 
		elemento.proximo = topo; 
		topo = elemento; 
	}
	
	public boolean isEmpty() { 
		if (topo == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int pop() throws Exception { 
		if (isEmpty()) { 
			throw new Exception("Pilha Vazia");
		} 
		int valor = topo.dado; 
		topo = topo.proximo; 
		return valor;
	}
	
	
	public int top() throws Exception { 
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		int valor = topo.dado; 
		return valor;
	}
	
	public int size() { 
		int cont = 0;
		if (!isEmpty()) { 
			No aux = topo; 
			while (aux != null) { 
				cont++; 
				aux = aux.proximo; 
			}
		}
		return cont;
	}
}

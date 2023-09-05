package model;

public class PilhaString {

	No topo;
	
	public PilhaString() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}

	public void push (String valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public String top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		String valor = topo.dado;
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
		
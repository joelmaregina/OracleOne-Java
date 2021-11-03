package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	 private Conta[] referencias;
	 private int posicaoLivre;
	 
	 public GuardadorDeContas() {
		 this.referencias = new Conta[10];
		 this.posicaoLivre = 0;
	 }
	 
	 public void adiciona(Object cc2) {
		 this.referencias[this.posicaoLivre] = (Conta) cc2;
		 this.posicaoLivre++;
	 }

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}

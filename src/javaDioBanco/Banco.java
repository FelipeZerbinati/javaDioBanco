package javaDioBanco;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<Contas> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setContas(List<Contas> contas) {
		this.contas = contas;
	}
	
	
}

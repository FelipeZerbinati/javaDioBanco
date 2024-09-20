package javaDioBanco;

public class ContaCorrente extends Contas {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void ImprimirExtrato() {
		System.out.println("=== EXTRATO CONTA CORRENTE ===");
		super.ImprimirInfosComuns();
	}
}
	

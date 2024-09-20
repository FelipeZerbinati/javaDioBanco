package javaDioBanco;

public class ContaPoupanca extends Contas{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void ImprimirExtrato() {
		System.out.println("=== EXTRATO CONTA POUPANÇA ===");
		super.ImprimirInfosComuns();
	}
}

package javaDioBanco;

public abstract class Contas implements IContas {
	
	protected static int AGENCIA_PADRAO = 0;
	public static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	
	protected void ImprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia %d", this.agencia));
		System.out.println(String.format("Numero %d", this.numero));
		System.out.println(String.format("Saldo %.2f", this.saldo));
	}
	
	public Contas(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		}
	
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Contas contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
}

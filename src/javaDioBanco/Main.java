package javaDioBanco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco Exemplo");

        List<Contas> contas = new ArrayList<>();

        // Criando clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente 1");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cliente 2");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Cliente 3");

        Cliente cliente4 = new Cliente();
        cliente4.setNome("Cliente 4");

        Cliente cliente5 = new Cliente();
        cliente5.setNome("Cliente 5");

        // Criando contas correntes e poupanças com saldo inicial
        Contas cc1 = new ContaCorrente(cliente1);
        Contas cc2 = new ContaCorrente(cliente2);
        Contas cp1 = new ContaPoupanca(cliente3);
        Contas cp2 = new ContaPoupanca(cliente4);
        Contas cc3 = new ContaCorrente(cliente5);

        // Adicionando saldo inicial
        cc1.depositar(1000);
        cc2.depositar(1500);
        cp1.depositar(2000);
        cp2.depositar(2500);
        cc3.depositar(3000);

        // Adicionando contas à lista do banco
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cc3);

        banco.setContas(contas);

        // Listando contas antes das transferências
        System.out.println("=== Saldo Inicial das Contas ===");
        for (Contas conta : contas) {
            conta.ImprimirExtrato();
            System.out.println("--------------------------");
        }

        // Realizando transferências
        System.out.println("=== Realizando Transferências ===");
        cc1.transferir(200, cc2);  // Cliente 1 transfere 200 para Cliente 2
        cp1.transferir(300, cp2);  // Cliente 3 transfere 300 para Cliente 4
        cc3.transferir(500, cc1);  // Cliente 5 transfere 500 para Cliente 1

        // Listando contas após as transferências
        System.out.println("\n=== Saldo Após Transferências ===");
        for (Contas conta : contas) {
            conta.ImprimirExtrato();
            System.out.println("--------------------------");
        }
    }
}

package projeto;

import java.util.Scanner;

public class PrimeiroProjeto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo = 0;
		
		System.out.println("Bem vindo ao banco MALU!");
		System.out.println("Seu saldo é: " + saldo);
		System.out.println("Digite '1' para depositar ou '0' para sacar");
		int op = sc.nextInt();
		
		if (op == 1) {
			System.out.println("Quanto deseja depositar?");
			double deposito = sc.nextDouble();
			saldo = saldo + deposito;
			sc.nextLine();
		} else if (op == 0) {
			System.out.println("Quanto deseja sacar?");
			double saque = sc.nextDouble();
			if (saque > saldo) {
				System.out.println("Saldo insuficiente");
			} else {
				saldo = saldo - saque;
			}
			sc.nextLine();
		}
		
		System.out.println("Operação realizada. Seu saldo é: " + saldo);
		sc.close();
	}
}

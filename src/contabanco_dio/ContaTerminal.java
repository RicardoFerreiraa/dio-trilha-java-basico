package contabanco_dio;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String Nome;
		int Agencia;
		int Numero;
		float Saldo;

		System.out.println("Por favor, digite seu nome: ");
		Nome = sc.nextLine();

		System.out.println("Por favor, digite o numero da sua Agência: ");
		Agencia = sc.nextInt();

		System.out.println("Por favor, digite o numero da sua Conta: ");
		Numero = sc.nextInt();

		System.out.println("Por favor, digite o Saldo que deseja inserir: ");
		Saldo = sc.nextFloat();
		;
		System.out.println("              Banco do Banco                ");
		System.out.println("                                            ");
		System.out.println("Olá "+Nome+" obrigado por criar uma conta em");
		System.out.println("em nosso banco, sua agência é: "+ Agencia);
		System.out.println("conta: "+Numero+" e seu Saldo: "+ Saldo + "ja esta disponivel para saque!");



		sc.close();
	}

}

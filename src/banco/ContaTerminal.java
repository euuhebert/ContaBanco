package banco;


import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Por favor, digite o número da conta !");
		int conta = sc.nextInt();
		
		System.out.println("Por favor, digite o número da Agência !");
		String agencia = sc.next();
		
		System.out.println("Agora digite o seu nome");
		String nomeCliente = sc.next();
		
		System.out.println("Digite o saldo que quer sacar");
		Double saldo = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo);
		
		
		sc.close();

	}

}

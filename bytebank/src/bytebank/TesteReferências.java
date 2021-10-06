package bytebank;

public class TesteReferências {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da Primeira: "
		+ primeiraConta.saldo);
		//Saldo 300;
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da Segunda conta: "
		+ segundaConta.saldo);
		//Saldo também de 300;
		
		
		segundaConta.saldo -= 100;
		System.out.println("Saldo da Segunda conta: "
		+ segundaConta.saldo);
		//A segunda conta imprimirá 400;
		System.out.println("Saldo da Primeira: "
		+ primeiraConta.saldo);
		//A primeira conta também imprimirá 400;
		
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta");
		}
				
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}

package bytebank;

public class TesteRefer�ncias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da Primeira: "
		+ primeiraConta.saldo);
		//Saldo 300;
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da Segunda conta: "
		+ segundaConta.saldo);
		//Saldo tamb�m de 300;
		
		
		segundaConta.saldo -= 100;
		System.out.println("Saldo da Segunda conta: "
		+ segundaConta.saldo);
		//A segunda conta imprimir� 400;
		System.out.println("Saldo da Primeira: "
		+ primeiraConta.saldo);
		//A primeira conta tamb�m imprimir� 400;
		
		
		if (primeiraConta == segundaConta) {
			System.out.println("S�o a mesmissima conta");
		}
				
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}

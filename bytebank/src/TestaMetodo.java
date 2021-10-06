
public class TestaMetodo {
	 
	public static void main(String[] args) {
		Conta contaJoelma = new Conta();
		contaJoelma.saldo = 100;
		contaJoelma.deposita(50);
		System.out.println(contaJoelma.saldo);
		
		boolean conseguiuRetirar = contaJoelma.saca(20);
		System.out.println(contaJoelma.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMaria = new Conta();
		contaMaria.deposita(1000);
		
		if (contaMaria.transfere(3000, contaJoelma)) {
			System.out.println("Transferência realizada com sucesso!");
			}else {
				System.out.println("Saldo insuficiente!");
			}
		System.out.println(contaMaria.saldo);
		System.out.println(contaJoelma.saldo);
		
		contaJoelma.titular = "Joelma Assis";
		System.out.println(contaJoelma.titular);
	}
}

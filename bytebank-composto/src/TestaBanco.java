
public class TestaBanco {
	public static void main(String[] args) {
		Cliente joelma = new Cliente();
		joelma.nome = "Joelma Assis";
		joelma.cpf = "222.222.222-22";
		joelma.profissao = "programador";
		
		Conta contaJoelma = new Conta();
		contaJoelma.deposita(100);
		
		//Associa a cliente Joelma a conta contaJoelma;
		contaJoelma.titular = joelma;
		System.out.println(contaJoelma.titular.nome);
		System.out.println(contaJoelma.titular);
		System.out.println(joelma);
	}
}

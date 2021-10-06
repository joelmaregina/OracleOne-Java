
public class testaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1606, 910);
		// conta.numero = 1606; não compila pois numero está private;
		//Para atrubuir novo valor a atributo private:
		//Para acessar valores de atributos privates:
		System.out.println(conta.getNumero());
		
		Cliente joelma = new Cliente();
		//conta.titular = joelma;		
		//joelma.nome = "Joelma Assis"; não compila pois "nome" está private;
		joelma.setNome("Joelma Silva");
		
		conta.setTitular(joelma);
		
		System.out.println(conta.getTitular());
		System.out.println(joelma.getNome());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Designer");
		//Agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Designer");
		
		System.out.println(titularDaConta);
		System.out.println(joelma);
		System.out.println(conta.getTitular());
		
		conta.deposita(200.0);
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(590);
		System.out.println(conta.getAgencia());
		
		System.out.println("O total de contas é: " + Conta.getTotal());
		
		
	}
}

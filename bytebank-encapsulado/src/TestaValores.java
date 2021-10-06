
public class TestaValores {
	public static void main(String[] args) {
	
		Conta conta = new Conta(1606, 910);
					
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1606, 2301);
		Conta conta3 = new Conta(1606, 1009);
		
		//Mostrar o total das contas (=3); Não dá pra usar Conta.getTotal()
		//Se não colocar "static" na declaração do método getTotal, seria
		//necessário usar o:
		//System.out.println(conta2.getTotal());
		
		//Uma vez utilizando o "static" no getTotal, podemos usar o:
		System.out.println(Conta.getTotal());
	}
}

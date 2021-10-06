
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaMaria = new Conta();
		System.out.println(contaMaria.getSaldo());
		
		contaMaria.titular = new Cliente();
		System.out.println(contaMaria.titular);
		
		contaMaria.titular.nome = "Maria";
		System.out.println(contaMaria.titular.nome);
	}
}

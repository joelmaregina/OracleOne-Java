
public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente jo = new Gerente();
		jo.setNome("Joelma Assis");
		jo.setCpf("160.992.610-89");
		jo.setSalario(3500.00);
		
		System.out.println(jo.getNome());
		System.out.println(jo.getCpf());
		System.out.println(jo.getSalario());
		System.out.println(jo.getBonificacao());
		
		
//		jo.salario = 300.0;
	}
}

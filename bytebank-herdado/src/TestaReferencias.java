
public class TestaReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Roque Silva");
		g1.setSalario(5000.0);
		
		//Não funciona mais pois transformamos a classe Funcionario
		//em uma classe abstrata;
//		Funcionario f = new Funcionario();
//		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(ev);
		controle.registro(d);
				
		System.out.println(controle.getSoma());
	}
	

}

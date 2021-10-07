
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(0616);
		
		Administrador adm = new Administrador();
		adm.setSenha(9010);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(5555);
			
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	}
	
}

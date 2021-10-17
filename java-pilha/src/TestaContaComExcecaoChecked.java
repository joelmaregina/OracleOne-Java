
public class TestaContaComExcecaoChecked {
	public static void main (String args) {
		
		Conta c = new Conta();
		
		//Usar o try cath ou colocar o Throws MinhaExcecao, pois MinhaExcecao é Checked;
		try {
			c.deposita();
		} catch (MinhaExcecao ex ) {
			System.out.println(" Tratamento ....");
		}
	}

}

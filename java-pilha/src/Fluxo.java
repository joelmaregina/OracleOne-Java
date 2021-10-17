
public class Fluxo {

	public static void main(String[] args) {
        System.out.println("Ini do main");
        //N�o precisa do Throws pois ja tem o tratamento para o MinhaExcecao (Checked).
        // O "Exception" no catch captura todas as exce��es
        try {
        metodo1();
	    } catch (Exception ex){
	    	String msg = ex.getMessage();
	    	System.out.println("Exception" + msg);
	    	ex.printStackTrace();
	    }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
    	System.out.println("Ini do m�todo 2 ");
    	throw new MinhaExcecao (" Deu muito errado");
    }
}
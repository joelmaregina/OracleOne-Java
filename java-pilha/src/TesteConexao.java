
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex) {
			System.out.println(" Deu erro na conexao");
		}
		
		//Essas 3 linhas acima (o try isoladamente) correspondem aos blocos try e finnaly do c�digo abaixo (O Catch pode ou n�o ser adcionado):
		
		//------------------------------------
			
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch (IllegalStateException ex){
//			System.out.println(" Deu erro na conexao");
//		}finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();
//			}
//		}
		

	}

}

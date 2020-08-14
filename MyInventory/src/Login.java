
public class Login {
	
	private String senha;
	private String email;
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public boolean autentica(String senha, String email) {
		if ( (this.senha.contains("#") && this.senha.length() >= 8) && email == this.email) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Senha ou email inválido");
			return false;
		}
	}
}

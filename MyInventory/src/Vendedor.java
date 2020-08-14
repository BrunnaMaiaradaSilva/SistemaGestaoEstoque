
public class Vendedor extends User implements Autenticavel {
	
	private Login login;
	
	public Vendedor() {
		this.login = new Login();
	}

	@Override
	public void setSenha(String senha) {
		this.login.setSenha(senha);
	}

	@Override
	public boolean autentica(String senha, String email) {
		return this.login.autentica(senha, email);
	}

	
}

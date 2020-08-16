
public class Login {
	
	private String senha;
	private String email;
	private User user;
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public boolean autentica(String senha, String email) {
		senha = this.senha;
		email = this.email;
		if ( (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && this.senha.length() >= 8) && email == this.email) {
			System.out.println("Acesso permitido");
			System.out.println("Seja bem vindo, " + user.getNome() + ", " +
			user.getNome().charAt(0) + user.getSobrenome().charAt(0));
			return true;
		} else {
			System.out.println("Senha ou email inválido");
			return false;
		}
	}

}

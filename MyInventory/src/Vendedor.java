
public class Vendedor extends Pessoa {
	
	private int senha;
	
	public boolean autentica(int senha, String email) {
		if(this.senha == senha && this.email == this.email) {
			return true;
		} else {
			return false;
		}
	}
		
}

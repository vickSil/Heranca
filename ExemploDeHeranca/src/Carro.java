
public class Carro extends Veiculo{
	
	@Override
	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Qautro portas: " + quatroPortas);
	}

	private boolean quatroPortas;
	
	//padr�o java que o booleano pergunta se a variavel � true ou false
	public boolean isQuatroPortas() {
	
		return quatroPortas;
	}
	
	public void setQuatroPortas(boolean quatroPortas) {
		//this: para escrever no atributo que � privado
		this.quatroPortas = quatroPortas;
	}
	
	
	
}

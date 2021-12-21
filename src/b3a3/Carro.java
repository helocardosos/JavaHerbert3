package b3a3;

public class Carro {
	private int qtdPortas;

	public Carro(int portas) { 
	      this.qtdPortas = portas;
	   }
	
	public void SetPortas(int portas) {
		this.qtdPortas = portas;
	}
	
	public int GetPortas() {
		return (this.qtdPortas);
	}
	
	public void ImprimirInformacoes() {
		System.out.println(this.qtdPortas);
	}
}

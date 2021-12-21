package b3a3;

public class Bicicleta {
	private boolean bagageiro;
	private int numMarchas;

	public Bicicleta(boolean bagageiro, int marcha) { 
	      this.bagageiro = bagageiro;
	      this.numMarchas = marcha;
	}
	
	public void SetBag(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
	
	public boolean GetBag() {
		return (this.bagageiro);
	}

	public void SetMarchas(int marcha) {
		this.numMarchas = marcha;
	}
	
	public int GetMarchas() {
		return (this.numMarchas);
	}
	
	public void ImprimirInformacoes() {
		System.out.println(this.bagageiro);
		System.out.println(this.numMarchas);
	}
}

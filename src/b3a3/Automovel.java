package b3a3;

public class Automovel {
	private double potmot;

	public Automovel(double portas) { 
	      this.potmot = portas;
	   }
	
	public void SetPortas(double portas) {
		this.potmot = portas;
	}
	
	public double GetPortas() {
		return (this.potmot);
	}
	
	public void ImprimirInformacoes() {
		System.out.println(this.potmot);
	}
}

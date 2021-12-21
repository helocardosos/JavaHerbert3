package b3a3;

public class Moto {
	private boolean partidaelet;

	public Moto(boolean portas) { 
	      this.partidaelet = portas;
	   }
	
	public void SetPortas(boolean portas) {
		this.partidaelet = portas;
	}
	
	public boolean GetPortas() {
		return (this.partidaelet);
	}
	
	public void ImprimirInformacoes() {
		System.out.println(this.partidaelet);
	}
}

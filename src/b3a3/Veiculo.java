package b3a3;

public class Veiculo {
	private String marca;
	private String modelo;
	private int roda;
	private int velocidade = 0;
	
	public Veiculo(int velocidade, int rodas, String modelo, String marca) { 
	      this.velocidade = velocidade;
		  this.marca = marca;
	      this.roda = rodas;
	      this.modelo = modelo;
	}
	
	public void acelerar(int n) {
		this.velocidade += n;
	}
	
	public void frear(int n) {
		this.velocidade -= n;
	}
	
	public int GetVelocidade() {
		return(this.velocidade);
	}
	
	public int GetRodas() {
		return(this.roda);
	}
	
	public String GetMarca() {
		return(this.marca);
	}
	
	public String GetModelo() {
		return(this.modelo);
	}
	
	public void SetVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void SetRodas(int rodas) {
		this.roda = rodas;
	}

	public void SetModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void SetMarca(String marca) {
		this.marca = marca;
	}
	
	public void ImprimirInformacoes() {
		System.out.println(this.modelo);
		System.out.println(this.marca);
		System.out.println(this.velocidade);
		System.out.println(this.roda);
	}
}

package b3a3;

public class Pessoa {
	private String name;
	private String pai;
	private String mae;
	
	public Pessoa(String name, String pai, String mae) { 
	      this.name = name;
	      this.pai = pai;
	      this.mae = mae;
	   }
	public Pessoa(String name) { 
		 this.name = name; 
	   }
	
	public void SetName(String name) {
		this.name = name;
	}

	public void SetPai(String name) {
		this.pai = name;
	}

	public void SetMae(String name) {
		this.mae = name;
	}
	
	public String GetName() {
		return (this.name);
	}

	public String GetPai() {
		return (this.pai);
	}
	
	public String GetMae() {
		return (this.mae);
	}
	
	public void TestarIrmaos(Pessoa individuo) {
		if(this.pai == individuo.pai || this.mae == individuo.mae){
			System.out.println("As pessoas são irmãs.");
		} else {
			System.out.println("As pessoas não são irmãs.");
		}
	}
	
	public void TestarAntecessores(Pessoa individuo) {
		if(individuo.name == this.pai || individuo.name == this.mae) {
			System.out.println("A pessoa passada no teste é parente da primeira.");
		} else {
			System.out.println("A pessoa passada no teste não é parente da primeira.");
		}
	}
}

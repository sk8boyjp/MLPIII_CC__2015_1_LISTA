package q6.locadora;

public class Fita {
	private String nome;
	private double preco = 10.00;
	
	public double calculaPreco(){
		return preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}

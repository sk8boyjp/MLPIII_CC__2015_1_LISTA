package locadoraVeiculos;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private String ano;
	private double valorKmRodado;
	private double valorLocacao;
	private int kmInicial;
	private int kmFinal;
	
	public Veiculo(String placa, String marca, String modelo,String ano,
			       double valorKmRodado,int kmInicial, int kmFinal){
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorKmRodado = valorKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}
	
	public String toString(){
		return "marca "+ marca+ "\n"+"modelo "+modelo+"\n"+"ano "+ano;
	}
	
	public double valorLocacao(){
		valorLocacao = (kmFinal - kmInicial)*valorKmRodado; 
		return valorLocacao;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}

}

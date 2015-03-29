package locadoraVeiculos;

public class VeiculoPasseio extends Veiculo {
	
	public VeiculoPasseio(String placa, String marca, String modelo,
			String ano, double valorKmRodado, 
			int kmInicial, int kmFinal) {
		super(placa, marca, modelo, ano, valorKmRodado,  kmInicial,
				kmFinal);
	}
	
	private boolean arcondicionado;
	private int qntPortas;
	
	public String toString(){
		return "marca "+ getMarca()+ "\n"+"modelo "+getModelo()+"\n"+"ano "+getAno()+"\n"+"veiculo de passeio";
	}
	
	public boolean isArcondicionado() {
		return arcondicionado;
	}
	public void setArcondicionado(boolean arcondicionado) {
		this.arcondicionado = arcondicionado;
	}
	public int getQntPortas() {
		return qntPortas;
	}
	public void setQntPortas(int qntPortas) {
		this.qntPortas = qntPortas;
	}
	

}

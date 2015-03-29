package locadoraVeiculos;

public class VeiculoCarga extends Veiculo {
	
public VeiculoCarga(String placa, String marca, String modelo, String ano,
			double valorKmRodado, int kmInicial,
			int kmFinal) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial,
				kmFinal);
		}

private double capacidadeCarga;

public String toString(){
	return "marca "+ getMarca()+ "\n"+"modelo "+getModelo()+"\n"+"ano "+getAno()+"\n"+"veiculo de carga";
}

public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
}

package q6.locadora;

public class Lancamento extends Fita {
	public Lancamento(String nome){
		setNome(nome);
	}
	public double calculaPreco(){
		return getPreco()+ getPreco()*0.20;
	}

}

package q6.locadora;

public class Infantil extends Fita{
	public Infantil(String nome){
		setNome(nome);
	}
	public double calculaPreco(){
		return getPreco()- getPreco()*0.40;
	}

}

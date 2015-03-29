package q7.ui;
import locadoraVeiculos.*;

public class Principal {
	public static void main(String []args){
	Veiculo meuVeiculo = new VeiculoPasseio("4577jp","asus","fusca","2015",100,0,200);
	Veiculo meuVeiculo2 = new VeiculoCarga("4410bayeux","telnet","massa","2050",100,0,50);
	
	System.out.println(meuVeiculo.toString());
	System.out.println("valor locacao veiculo passeio "+ meuVeiculo.valorLocacao());
	System.out.println(meuVeiculo2.toString());
	System.out.println("valor locacao veiculo carga "+ meuVeiculo2.valorLocacao());
	}
}

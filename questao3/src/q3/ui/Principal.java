package q3.ui;

import fabricas.FabricaDeCarros;

public class Principal {
	
	public static void main(String[] args){
		
		FabricaDeCarros  minhaFabrica = FabricaDeCarros.getInstance();
		
		minhaFabrica.setNome("organização tabajara");
		minhaFabrica.setCidade("joaoa Pessoa");
		minhaFabrica.setEstado("Paraiba");
		
		System.out.println("instancia 1 \n");
		System.out.println(minhaFabrica.toString());
		
		FabricaDeCarros fabrica2 = FabricaDeCarros.getInstance();
		System.out.println("\n instancia 2 \n");
		System.out.println(fabrica2.toString());
		
	}

}

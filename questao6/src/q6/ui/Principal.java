package q6.ui;

import q6.locadora.*;



public class Principal {
	public static void main(String []args){
		Fita locacao1 = new Infantil("rei leao");
		Fita locacao2 = new Lancamento("o hobit");
		
		System.out.println("fita1 "+ locacao1.getNome() +"\n"+ "valor "+ locacao1.calculaPreco() );
		System.out.println("fita2 "+ locacao2.getNome() +"\n"+ "valor "+ locacao2.calculaPreco() );
	}
   
}

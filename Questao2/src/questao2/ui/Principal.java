package questao2.ui;
import java.util.Scanner;

import questao2.montagem.Carro;



public class Principal {
	
	public static void main(String [] args){
		Carro fusca = new Carro("vermelho","fusca",1500);
		@SuppressWarnings("resource")
		Scanner pega = new Scanner(System.in);
		
		fusca.ligar();
		
		for(int i =0;i<3;i++){
		   System.out.println("informe o aumento de velocidade \n");
		   fusca.acelerar(pega.nextInt());
		}
		fusca.ligar();
	}

}

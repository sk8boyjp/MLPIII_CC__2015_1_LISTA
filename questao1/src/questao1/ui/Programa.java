package questao1.ui;
import java.util.Scanner;
import questao1.faturamento.Fatura;



public class Programa {
	
	@SuppressWarnings("resource")
	public static void main( String [] args){
		Fatura fatura = new Fatura();
		Scanner pega = new Scanner(System.in);
		
		System.out.println("informe o numero do produto");
		fatura.setNumero(pega.nextLine());
		
		System.out.println("informe a descrição do produto");
		fatura.setDescricao(pega.nextLine());
		
		System.out.println("informe a quantidade vendida");
		fatura.setQuantidade(pega.nextInt());
		
		System.out.println("informe o preço do produto");
		fatura.setPreco(pega.nextDouble());
		
		System.out.printf("o valor da fatura do produto %s  é:\n %f ",fatura.getDescricao(), fatura.getValorFatura());
	}

}

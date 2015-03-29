package questao1.faturamento;


public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public double getValorFatura(){
		if(preco<0) setPreco(0.0);
		if(quantidade <0)setQuantidade(0);
		return quantidade * preco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}

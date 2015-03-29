package fabricas;

public class FabricaDeCarros {
	
	private String cnpj;
	private String nome;
	private String cidade;
	private String estado;
	private String rua;
	private int numero;
	
	 private static FabricaDeCarros instance;

	   private FabricaDeCarros() {

	   }

	   public static FabricaDeCarros getInstance() {
	      if (instance == null)
	         instance = new FabricaDeCarros();
	      return instance;
	   }
	   
	   public String toString(){
		return "nome "+ nome +"\n"+ "cidade "+ cidade + "\n" + "estado "+ estado;
		   
	   }
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
		

}

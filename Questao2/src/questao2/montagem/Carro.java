package questao2.montagem;
public class Carro {
	
	private String cor;
	private String modelo;
	private int velocidadeAtual;
    private int velocidadeMaxima;
    private boolean carroLigado;
    
    public Carro(String cor, String modelo,int vMax){
    	this.cor = cor;
    	this.modelo = modelo;
    	this.velocidadeMaxima = vMax;
    }
    
    public void ligar(){
    	if(carroLigado==false){
    	   carroLigado = true;	
    	   System.out.println("carro ligado \n");
    	  }
    	else{
    		carroLigado=false;
    		System.out.println("carro desligado \n");
    	}
    }
    
    public void acelerar(int velocidade){
    	if(velocidadeAtual+velocidade>velocidadeMaxima)
    		System.out.println("ultrapassou limite de velocidade do carro");
    	else
    	   this.velocidadeAtual+= velocidade;
    	
    	System.out.printf("velocidade atual: %d \n",getVelocidadeAtual());
    	
    }

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}


	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}
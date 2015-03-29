package q5.google;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	public Data() {
	}
	public Data(int dia, int mes, int ano) {
    this.dia = dia;	
	if(dia>30 || dia <1)this.dia = 1;
	this.mes = mes;
	if(mes>12 || mes <1)this.mes = 1;
	this.ano = ano;
	if(ano<0)this.ano =2015;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	public String toString() {
	return dia + "/" + mes + "/" + ano;
	}

}

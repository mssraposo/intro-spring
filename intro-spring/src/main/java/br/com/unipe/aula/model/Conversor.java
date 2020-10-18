package br.com.unipe.aula.model;

public class Conversor {

	private double real;
	private double taxa = 5.65;
	
	public Conversor() {
	}
	
	public Conversor(double real, double taxa) {
		super();
		this.real = real;
		this.taxa = taxa;
	}

	
	public double Converter() {
		return real * taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	
	
	
}

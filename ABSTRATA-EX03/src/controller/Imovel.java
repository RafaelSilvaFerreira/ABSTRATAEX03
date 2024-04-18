package controller;


public class Imovel {
    public double areaTotal;
    public int numeroComodos;
    public int numeroQuartos;
    public double areaGaragem;
    public int idade;
    
	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double a) {
		this.areaTotal = a;
	}

	public void setNumeroComodos(int n) {
		this.numeroComodos = n;
		
	}

	public void setNumeroQuartos(int n) {
		this.numeroQuartos = n;
		
	}

	public void setAreaGaragem(double a) {
		this.areaGaragem = a;
		
	}

	public void setIdade(int i) {
		this.idade = i;
		
	}

	public int getIdade() {
		
		return this.idade;
	}

	public int getNumeroQuartos() {
		return this.numeroQuartos;
	}

	public double getAreaGaragem() {
		
		return this.areaGaragem;
	}

	public int getNumeroComodos() {
		return this.numeroComodos;
	}

}
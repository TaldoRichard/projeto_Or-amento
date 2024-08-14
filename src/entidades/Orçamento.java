package entidades;

public class Orçamento {
	
	private Double valorMetro;
	private Double largura;
	private Double comprimento;
	private Double faixa;
	private Double placasGesso;
	private Double metrosDeNegativo;
	private Double sacoDeGesso;
	private Double cola;
	private Double kiloDeCizal;
	private Double preçoDosMaterias;
	private Double preçoDaMaoDeObra;
	private Double preçoDecoração;
	
	public Orçamento() {
	}
	
	public Orçamento(Double valorMetro, Double largura, Double comprimento, Double faixa, Double placasGesso,
			Double metrosDeNegativo, Double sacoDeGesso, Double cola, Double kiloDeCizal) {
		this.valorMetro = valorMetro;
		this.largura = largura;
		this.comprimento = comprimento;
		this.faixa = faixa;
		this.placasGesso = placasGesso;
		this.metrosDeNegativo = metrosDeNegativo;
		this.sacoDeGesso = sacoDeGesso;
		this.cola = cola;
		this.kiloDeCizal = kiloDeCizal;
	}

	public Double getPlacasGesso() {
		return placasGesso;
	}

	public void setPlacasGesso(Double placasGesso) {
		this.placasGesso = placasGesso;
	}

	public Double getMetrosDeNegativo() {
		return metrosDeNegativo;
	}

	public void setMetrosDeNegativo(Double metrosDeNegativo) {
		this.metrosDeNegativo = metrosDeNegativo;
	}

	public Double getSacoDeGesso() {
		return sacoDeGesso;
	}

	public void setSacoDeGesso(Double sacoDeGesso) {
		this.sacoDeGesso = sacoDeGesso;
	}

	public Double getCola() {
		return cola;
	}

	public void setCola(Double cola) {
		this.cola = cola;
	}

	public Double getKiloDeCizal() {
		return kiloDeCizal;
	}

	public void setKiloDeCizal(Double kiloDeCizal) {
		this.kiloDeCizal = kiloDeCizal;
	}

	public Double getValorMetro() {
		return valorMetro;
	}

	public void setValorMetro(Double valorMetro) {
		this.valorMetro = valorMetro;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public Double getFaixa() {
		return faixa;
	}

	public void setFaixa(Double faixa) {
		this.faixa = faixa;
	}

	public void Materias() {
		preçoDosMaterias = (placasGesso * 5.00) + (sacoDeGesso * 40.00) + (metrosDeNegativo * 3.00) + (cola * 12.90) + (kiloDeCizal * 30.00);
	}
	
	public void maoDeObra() {
		preçoDaMaoDeObra = largura * comprimento * valorMetro;
	}
	
	public void decoraçao() {
		preçoDecoração = valorMetro * faixa;
	}
	
	public Double preçoFinalDoServiço() {
		if (preçoDecoração == 0.00) {
			return preçoDaMaoDeObra + preçoDosMaterias;
		}
		else {
			return preçoDaMaoDeObra + preçoDosMaterias + preçoDecoração;
		}
	}

}

package entidades;

public class GessoComun extends OrçamentoGesso{
	
	private Double placasDeGesso;
	private Double sacosDeGesso;
	private Double sisal;
	private Double gessoCola;
	private Double arame;
	private Double pitao;
	private Double metrosDeNegativo;
	
	public GessoComun() {
	}

	public GessoComun(Double valorMetro, Double largura, Double comprimento, Double nivelDoForro, Double placasDeGesso,
			Double sacosDeGesso, Double sisal, Double gessoCola, Double arame, Double pitao, Double metrosDeNegativo) {
		super(valorMetro, largura, comprimento, nivelDoForro);
		this.placasDeGesso = placasDeGesso;
		this.sacosDeGesso = sacosDeGesso;
		this.sisal = sisal;
		this.gessoCola = gessoCola;
		this.arame = arame;
		this.pitao = pitao;
		this.metrosDeNegativo = metrosDeNegativo;
	}

	public Double getPlacasDeGesso() {
		return placasDeGesso;
	}

	public void setPlacasDeGesso(Double placasDeGesso) {
		this.placasDeGesso = placasDeGesso;
	}

	public Double getSacosDeGesso() {
		return sacosDeGesso;
	}

	public void setSacosDeGesso(Double sacosDeGesso) {
		this.sacosDeGesso = sacosDeGesso;
	}

	public Double getSisal() {
		return sisal;
	}

	public void setSisal(Double sisal) {
		this.sisal = sisal;
	}

	public Double getGessoCola() {
		return gessoCola;
	}

	public void setGessoCola(Double gessoCola) {
		this.gessoCola = gessoCola;
	}

	public Double getArame() {
		return arame;
	}

	public void setArame(Double arame) {
		this.arame = arame;
	}

	public Double getPitao() {
		return pitao;
	}

	public void setPitao(Double pitao) {
		this.pitao = pitao;
	}

	public Double getMetrosDeNegativo() {
		return metrosDeNegativo;
	}

	public void setMetrosDeNegativo(Double metrosDeNegativo) {
		this.metrosDeNegativo = metrosDeNegativo;
	}
	
	public double valorMaterial() {
		double valorPlacas = placasDeGesso * 5.00;
		double valorSacosGesso = sacosDeGesso * 32.00;
		double valorCola = gessoCola * 10.00;
		double valorSisal = sisal * 30.00;
		double valorPitao = pitao * 45.00;
		double valorArame = arame * 30.00;
		double valorNegativo = metrosDeNegativo * 2.50;
		double valorTotal = valorArame + valorCola + valorNegativo + valorPitao + valorPlacas + valorSacosGesso + valorSisal;
		return valorTotal;
	}

}

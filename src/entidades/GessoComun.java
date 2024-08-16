package entidades;

public class GessoComun extends OrçamentoGesso{
	
	private Integer placasDeGesso;
	private Integer sacosDeGesso;
	private Integer sisal;
	private Integer gessoCola;
	private Integer arame;
	private Integer pitao;
	private Double metrosDeNegativo;
	
	public GessoComun() {
	}

	public GessoComun(Double valorMetro, Double largura, Double comprimento, Double nivelDoForro, Integer placasDeGesso,
			Integer sacosDeGesso, Integer sisal, Integer gessoCola, Integer arame, Integer pitao, Double metrosDeNegativo) {
		super(valorMetro, largura, comprimento, nivelDoForro);
		this.placasDeGesso = placasDeGesso;
		this.sacosDeGesso = sacosDeGesso;
		this.sisal = sisal;
		this.gessoCola = gessoCola;
		this.arame = arame;
		this.pitao = pitao;
		this.metrosDeNegativo = metrosDeNegativo;
	}

	public Integer getPlacasDeGesso() {
		return placasDeGesso;
	}

	public void setPlacasDeGesso(Integer placasDeGesso) {
		this.placasDeGesso = placasDeGesso;
	}

	public Integer getSacosDeGesso() {
		return sacosDeGesso;
	}

	public void setSacosDeGesso(Integer sacosDeGesso) {
		this.sacosDeGesso = sacosDeGesso;
	}

	public Integer getSisal() {
		return sisal;
	}

	public void setSisal(Integer sisal) {
		this.sisal = sisal;
	}

	public Integer getGessoCola() {
		return gessoCola;
	}

	public void setGessoCola(Integer gessoCola) {
		this.gessoCola = gessoCola;
	}

	public Integer getArame() {
		return arame;
	}

	public void setArame(Integer arame) {
		this.arame = arame;
	}

	public Integer getPitao() {
		return pitao;
	}

	public void setPitao(Integer pitao) {
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

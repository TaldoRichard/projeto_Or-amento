package entidades;

import java.util.ArrayList;
import java.util.List;

public class OrçamentoGesso {
	
	private Double valorMetro;
	private Double largura;
	private Double comprimento;
	private Double nivelDoForro;
	
	List<Double> areas = new ArrayList<>();
	List<Double> perimetros = new ArrayList<>();
	
	public OrçamentoGesso() {
	}

	public OrçamentoGesso(Double valorMetro, Double largura, Double comprimento, Double nivelDoForro) {
		this.valorMetro = valorMetro;
		this.largura = largura;
		this.comprimento = comprimento;
		this.nivelDoForro = nivelDoForro;
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

	public Double getNivelDoForro() {
		return nivelDoForro;
	}

	public void setNivelDoForro(Double nivelDoForro) {
		this.nivelDoForro = nivelDoForro;
	}

	public double areaDeForro() {
		return largura * comprimento;
	}
	
	public double perimetroDeForro() {
		return largura * 2 + comprimento * 2;
	}
	
	public double areaTotalDeForro() {
		double areaTotal = 0;
		for (int i=0; i<areas.size(); i++) {
			areaTotal += areas.get(i);
		}
		return areaTotal;
	}
	
	public double perimetroTotalDeForro() {
		double perimetroTotal = 0;
		for (int i=0; i<perimetros.size(); i++) {
			perimetroTotal += perimetros.get(i);
		}
		return perimetroTotal;
	}
	
}

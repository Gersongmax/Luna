package dominio;

import java.math.BigDecimal;

public class CompartimentoCarga extends Compartimento<Float> {

	CompartimentoCarga(Float capacidadeTotal, Float qntAtual) {
		super(capacidadeTotal, qntAtual);
		
	}
	public CompartimentoCarga() {
		super( 1000.0f ,0.0f); 
	}
	
	public boolean carregarCarga(float valor) {
		
		if (valor < 0 || this.getQntAtual().doubleValue() + valor > this.getCapacidadeTotal().doubleValue())
	
		return false;
		else {
			this.setQntAtual(getQntAtual().floatValue() + valor );
			return true;
		}
	
	}
	public boolean descarregarCarga(float valor) {
		if (valor < 0 || this.getQntAtual().doubleValue() - valor < 0 )
			
			return false;
			else {
				this.setQntAtual(getQntAtual().floatValue() - valor );
				return true;
			}	
		
	}

}
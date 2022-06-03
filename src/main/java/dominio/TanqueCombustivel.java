package dominio;

import java.math.BigDecimal;

public class TanqueCombustivel extends Compartimento <BigDecimal>implements Tanque {
	
	// double capacidadeTotal;
	//private double qntAtual;
	
	public TanqueCombustivel() {
		super(new BigDecimal (1000), new BigDecimal (0) );
	}
	
public TanqueCombustivel(BigDecimal capacidadeTotal, BigDecimal qntAtual) {
	super(capacidadeTotal, qntAtual) ;
		
	

}




@Override
public boolean abastecer(double valor) {
	
	//if (valor < 0 || this.getQntAtual().doubleValue() + valor > this.getCapacidadeTotal().doubleValue()
	if (valor < 0 )
			return false;
	else { 
		this.setQntAtual (new BigDecimal (getQntAtual().doubleValue() + valor));
		
		if (this.getQntAtual().doubleValue() > this.getCapacidadeTotal().doubleValue())
		{ this.setQntAtual(getCapacidadeTotal());
		return false;
		
		}
		return true;
	}
	


		
}

@Override
public boolean consumir(double valor) {
	if (valor < 0 || (this.getQntAtual().doubleValue() - valor) < 0) {
		this.setQntAtual(new BigDecimal(0));
		return false;
	}else { 
	this.setQntAtual (new BigDecimal (getQntAtual().doubleValue() - valor));
	return true;
}
	
	
}

}

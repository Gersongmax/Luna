package dominio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Aviao {
	public Aviao() {
		super();
		tanqueCombustivel = new TanqueCombustivel(new BigDecimal(1000), new BigDecimal(0));
		List<Turbina> turbinas = new ArrayList<>();
		turbinas.add(new Turbina());
		turbinas.add(new Turbina());
		lsTurbinas = turbinas;
		compartimentoCarga = new CompartimentoCarga (1000.0f,0.0f);
		
	}



	private final TanqueCombustivel tanqueCombustivel;
	private final List<Turbina> lsTurbinas;
	private final CompartimentoCarga compartimentoCarga;
	
	
	
void ligarTurbinas() {
	if (tanqueCombustivel.getQntAtual().doubleValue()>0) {
		lsTurbinas.get(0).ligar();
		lsTurbinas.get(1).ligar();
	}
	
}


void desligarTurbinas() {
	lsTurbinas.get(0).desligar();
	lsTurbinas.get(1).desligar();
}
boolean isTurbinasLigadas() {
	return lsTurbinas.get(0).isLigado();
}

int nivelPotenciaTurbinas() {
	
	return ((lsTurbinas.get(0).getNivelPotencia() + lsTurbinas.get(1).getNivelPotencia()) /2);
}

void aumentarPotenciaTurbinas() {
	try {
	 lsTurbinas.get(0).aumentarPotencia(5);
	 lsTurbinas.get(1).aumentarPotencia(5);
	}
	catch (DesligadoException e) {}
	 
	
}
void diminuirPotenciaTurbinas() {
	try {
		 lsTurbinas.get(0).diminuirPotencia(5);
		 lsTurbinas.get(1).diminuirPotencia(5);
		}
		catch (DesligadoException e) {}
	
}
void abastecer(double valor) {
	tanqueCombustivel.abastecer(valor);
	}
void consumir (double valor) {
tanqueCombustivel.consumir(valor);
}
double getCapacidadeTotalCombustivel() {
	return tanqueCombustivel.getCapacidadeTotal().doubleValue();
	
}
double getQntdAtualCombustivel() {
 return tanqueCombustivel.getQntAtual().doubleValue();
		
}
void carregarCarga(int value) {
	compartimentoCarga.carregarCarga(value);
	
}
void descarregarCarga(int value) {
	compartimentoCarga.descarregarCarga(value);
	
}
float getCapacidadeTotalCarga() {

return compartimentoCarga.getCapacidadeTotal().floatValue();
	
}
float getQntdAtualCarga() {
	return compartimentoCarga.getQntAtual().floatValue();
	
}


	
}

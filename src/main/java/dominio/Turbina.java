package dominio;

public class Turbina extends Motor {
	
private int nivelPotencia;


public Turbina () {
	nivelPotencia = 0;
}


@Override
protected void ligar() {
	nivelPotencia = 5;
	super.ligar();
}


@Override
protected void desligar() {
	nivelPotencia =0;
	super.desligar();
}
//se isLigado = false, lança DesligadoException
//se isLigado e aumento > 0, então nivelPotencia = min( nivelPotencia + aumento, 100 )

void aumentarPotencia(int aumento)throws DesligadoException {
 if (aumento < 0 )
	 return ;

	if (isLigado() == false) {
		throw new DesligadoException(" Deu erro");
	}
	if (nivelPotencia +aumento >100) nivelPotencia =100;
	else
		nivelPotencia += aumento;



}
void diminuirPotencia(int diminuicao)throws DesligadoException {
	 if (diminuicao < 0 )
		 return ;


	if (isLigado() == false) {
		throw new DesligadoException(" Deu erro");
	}
	if (nivelPotencia - diminuicao < 0) nivelPotencia =0;
	else
		nivelPotencia -= diminuicao;
	
}
	int getNivelPotencia() {
		return nivelPotencia;
	}
	
}

	









	
			
	

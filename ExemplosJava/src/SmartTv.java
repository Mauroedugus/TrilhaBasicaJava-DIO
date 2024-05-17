//Sistema para representar uma tv
public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 20;
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void selecionarCanal(int resposta) {
		canal = resposta;
	}
	
	public void ligar() {
		ligada=true;
	}
	public void desligar() {
		ligada=false;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
 }
package revista;

import java.util.ArrayList;
import java.util.List;

public class Revista extends Thread{
	
	private int tempoProducao;	

	private static int edicaoAtual = 1;
	
	private List<Assinante> assinantes = new ArrayList<Assinante>();
	
	public Revista() {
		gerarTempoProducao();
	}
	
	
	public void addAssinante(Assinante assinante) {
		assinantes.add(assinante);
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(3000);
				System.out.println("Tempo produção : " + tempoProducao);
				tempoProducao--;
			} catch (InterruptedException e) {
				
			}
			
			if(tempoProducao<=0) {
				notificarAssinantes();
				edicaoAtual++;
				gerarTempoProducao();
			}
		}
		
		
	}
	
	private void gerarTempoProducao() {
		
		tempoProducao = 1 + (int) (Math.random() * 100);
		
	}
	

	private void notificarAssinantes() {
		for(Assinante assinante : assinantes) {
			assinante.notificar(edicaoAtual);
		}
	}
	
	
	
	
	
	
	
	
}

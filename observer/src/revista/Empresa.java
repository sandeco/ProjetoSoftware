package revista;

public class Empresa extends Thread implements Assinante {

	
	private int contador = 0;
	private String nome;
	private int time;
	
	public Empresa(String nome, int time) {
		this.nome = nome;
		this.time = time;
	}
	
	
	@Override
	public void notificar(int edicao) {
		System.out.println("-----------------------------------");
		System.out.println("Empresa recebe edição " + edicao);
	}

	@Override
	public void run() {
		while(this.contador < 3000) {
			try {
				Thread.sleep(this.time);
				System.out.println(this.nome + " : " + this.contador);
				this.contador++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}

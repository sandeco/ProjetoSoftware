package observer;


public class Contador implements Runnable{
	
	private int contador = 0;
	private String nome;
	private int time;
	
	private Thread thread;
	
	
	public void start() {
		thread = new Thread();
		thread.start();
	}
	
	
	public Contador(String nome, int time) {
		this.nome = nome;
		this.time = time;
	}

	@Override
	public void run() {
		while(this.contador < 100) {
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

package revista;

public class Pessoa extends Thread implements Assinante {

	@Override
	public void notificar(int edicao) {
		System.out.println("-----------------------------------");
		System.out.println("Pessoa recebeu edição" + edicao);
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);
				System.out.println("pessoa respirando");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	

}

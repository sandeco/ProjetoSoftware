package runnable;

public class MinhaRunnable implements Runnable {

	private Thread t;
	
	public void start() {
		t = new Thread(this);
		t.start();
	}
	
	
	@Override
	public void run() {
		System.out.println("teste");
		
	}
	
	public void stop() {
		t.stop();
	}
	

}

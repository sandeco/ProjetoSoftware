package observer;

public class Main {

	public static void main(String[] args) {
		Contador cont1 = new Contador("Contador 1", 500);
		Contador cont2 = new Contador("Contador 2", 1000);
		
		cont1.start();
		cont2.start();

	}

}

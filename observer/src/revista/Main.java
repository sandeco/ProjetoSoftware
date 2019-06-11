package revista;

public class Main {

	public static void main(String[] args) {
		Revista revista = new Revista();
		Pessoa pessoa = new Pessoa();
		Empresa empresa = new Empresa("Sandeco Corp" , 2000);
		
		revista.addAssinante(pessoa);
		revista.addAssinante(empresa);
		
		revista.start();
		pessoa.start();
		empresa.start();
		
	}

}

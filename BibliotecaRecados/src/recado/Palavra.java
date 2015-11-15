package recado;

public class Palavra implements Recado {
	
	private String conteudo;

	public Palavra(String conteudo) {
		super();
		this.conteudo = conteudo;
	}

	@Override
	public void Exibir() {
		System.out.println(conteudo);

	}
	
	@Override
	public int getTotalCaracteres() {
		int totalcaracteres = 0;
		for (int i = 0; i < conteudo.length(); i++) {
			totalcaracteres++;
			if(conteudo.indexOf(i) == ' ')
				totalcaracteres--;
		}
		return 0;
	}
	
	public String getConteudo() {
		return conteudo;
	}

	@Override
	public Frase getFrase() {
		// TODO Auto-generated method stub
		return null;
	}

}

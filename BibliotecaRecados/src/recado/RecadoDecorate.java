package recado;

public abstract class RecadoDecorate implements Recado {

	Recado componente;
	
	public RecadoDecorate(Recado componente) {
		super();
		this.componente = componente;
	}

	@Override
	public void Exibir() {
		// TODO Auto-generated method stub
	}

	@Override
	public int getTotalCaracteres() {
		return 0;
		// TODO Auto-generated method stub

	}
	
	@Override
	public Frase getFrase() {
		// TODO Auto-generated method stub
		return null;
	}

}

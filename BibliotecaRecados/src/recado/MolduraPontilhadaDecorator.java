package recado;

public class MolduraPontilhadaDecorator extends RecadoDecorate {

	public MolduraPontilhadaDecorator(Recado componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Exibir() {
		// TODO Auto-generated method stub
			System.out.println("............");
			this.componente.Exibir();

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

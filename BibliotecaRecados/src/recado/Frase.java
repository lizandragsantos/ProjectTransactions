package recado;


import java.util.*;

public class Frase implements Recado {

	private List<Recado> trechos = new ArrayList<>();

	@Override
	public void Exibir() {
		// TODO Auto-generated method stub
		for (Recado r : trechos) {
			if(r instanceof Palavra)
			System.out.print(((Palavra) r).getConteudo());
		}
	}

	@Override
	public int getTotalCaracteres() {
		// TODO Auto-generated method stub
		String palavra;
		int totalcaracteres = 0;
		for (Recado r : trechos) {

			if (r instanceof Palavra) {
				palavra = ((Palavra) r).getConteudo();

				for (int i = 0; i < palavra.length(); i++) {
					totalcaracteres++;
					if (palavra.codePointAt(i) == ' ')
						totalcaracteres--;
				}
			}
		}
		return totalcaracteres;
	}

	@Override
	public Frase getFrase() {
		// TODO Auto-generated method stub
		return this;
	}

	public void add(Recado trecho) {
		this.trechos.add(trecho);
	}

	public void remove(Recado trecho) {
		this.trechos.remove(trecho);
	}
}

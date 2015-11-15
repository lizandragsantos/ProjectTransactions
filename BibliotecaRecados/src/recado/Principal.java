package recado;

import java.awt.Menu;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int option;
		int resp;
		Recado recado, trecho;
		Frase frase = new Frase();
		RecadoDecorate decorator;
		do{
			option = Menu();
			
			switch(option){
			case 1:{
				recado = new Palavra(JOptionPane.showInputDialog("Informe a palavra"));
				decorator = new MolduraTracejadoDecorator(recado);
				decorator.Exibir();
				System.out.println("\n"+recado.getTotalCaracteres());
				break;
			}
			case 2:{
				resp = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar palavra à frase?\n"
						+ "1) Sim\n"
						+ "2) Não\n"));
				while(resp < 2){
					trecho = new Palavra(JOptionPane.showInputDialog("Informe a palavra para adicionar à frase"));
					frase.add(trecho);		
					resp = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar palavra à frase?\n"
							+ "1) Sim\n"
							+ "2) Não\n"));
				}
				decorator = new MolduraPontilhadaDecorator(frase);
				decorator.Exibir();
				System.out.println("\n"+frase.getTotalCaracteres());
				break;
			}
			}
		}while(option < 3);
		

	}
	
	public static int Menu() {
		int op;
		op = Integer.parseInt(JOptionPane.showInputDialog(null, "Adicionar ao Recado:\n"
				+ "1) Palavra\n"
				+ "2) Frase\n"
				+ "3) Para Finalizar"));
		return op;
	}

}

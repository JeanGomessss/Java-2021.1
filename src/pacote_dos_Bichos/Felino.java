package pacote_dos_Bichos;

abstract class Felino extends Animal {

	protected Felino(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String vaguear() {
		return "Felino vagueia igual felino";
		
	}

}

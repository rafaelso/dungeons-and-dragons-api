package dungeonsanddragons.api.enums;

public enum Tamanho {

	MIUDO("Rato", "1/2", "0"),
	PEQUENO("Goblin", "1", "1"),
	MEDIO("Humano", "1", "1"),
	GRANDE("Troll", "2 x 2", "1 - 2"),
	ENORME("Titã da Morte", "3 x 3", "2 - 3"),
	IMENSO("Dragão Ancião", "4 x 4 (ou maior)", "3 - 4");
	
	private final String exemplo;
	private final String espaco;
	private final String alcance;

	Tamanho(String exemplo, String espaco, String alcance) {
		this.exemplo = exemplo;
		this.espaco = espaco;
		this.alcance = alcance;
	}
	
	public String getExemplo() {
		return exemplo;
	}

	public String getEspaco() {
		return espaco;
	}

	public String getAlcance() {
		return alcance;
	}
	
}
